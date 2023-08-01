package com.khanhcv.shopManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.khanhcv.shopManagement.entity.CustomerEntity;
import com.khanhcv.shopManagement.service.CustomerSevice;

@Controller
public class HomeController {
	@Autowired
	private CustomerSevice customerSevice;
	
	@GetMapping("/")
	public String homePage(Model model) {
		List<CustomerEntity> customers = customerSevice.getAllCustomer();	
		model.addAttribute("customers", customers);
		return "index";	
	}
}
