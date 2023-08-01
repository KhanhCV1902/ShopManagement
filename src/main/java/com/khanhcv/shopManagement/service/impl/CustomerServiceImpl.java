package com.khanhcv.shopManagement.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khanhcv.shopManagement.converter.CustomerConverter;
import com.khanhcv.shopManagement.dto.CustomerDto;
import com.khanhcv.shopManagement.entity.CustomerEntity;
import com.khanhcv.shopManagement.repository.CustomerRepository;
import com.khanhcv.shopManagement.service.CustomerSevice;

@Service
public class CustomerServiceImpl implements CustomerSevice{
	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private CustomerConverter customerConverter;

	@Override
	public List<CustomerEntity> getAllCustomer() {
		return customerRepository.findAll();
	}

	@Override
	public CustomerDto getCustomerById(String code) {
		CustomerEntity customerEntity = customerRepository.getById(code);
		return customerConverter.toDto(customerEntity);
	}

	@Override
	public CustomerDto createCustomer(CustomerDto customerDto) {
		CustomerEntity customerEntity = new CustomerEntity();
		customerEntity = customerRepository.save(customerConverter.toEntity(customerDto));
		return customerConverter.toDto(customerEntity);
	}

}
