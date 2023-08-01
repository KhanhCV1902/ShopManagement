package com.khanhcv.shopManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.khanhcv.shopManagement.dto.CustomerDto;
import com.khanhcv.shopManagement.entity.CustomerEntity;
import com.khanhcv.shopManagement.service.CustomerSevice;

@RestController
public class Customercontroller {
	@Autowired
	private CustomerSevice customerSevice;
	
	@GetMapping("/listCustomer")
	public List<CustomerEntity> getAllCustomer() {
		return customerSevice.getAllCustomer();	
	}
	
	@GetMapping("/customer")
	public CustomerDto getcustomer(@RequestParam(value = "code") String code) {
		return customerSevice.getCustomerById(code);	
	}
	
	@PostMapping(value = "/customer")
	public CustomerDto createCustomer(@RequestBody CustomerDto customerDto) {
		return customerSevice.createCustomer(customerDto);
	}
	
}
