package com.khanhcv.shopManagement.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.khanhcv.shopManagement.dto.CustomerDto;
import com.khanhcv.shopManagement.entity.CustomerEntity;

@Service
public interface CustomerSevice {
	public List<CustomerEntity> getAllCustomer();
	public CustomerDto getCustomerById(String code);
	public CustomerDto createCustomer(CustomerDto customerDto);
}
