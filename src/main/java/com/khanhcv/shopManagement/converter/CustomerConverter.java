package com.khanhcv.shopManagement.converter;

import java.util.Date;

import org.springframework.stereotype.Component;
import com.khanhcv.shopManagement.dto.CustomerDto;
import com.khanhcv.shopManagement.entity.CustomerEntity;

@Component
public class CustomerConverter {
	public CustomerEntity toEntity(CustomerDto customerDto) {
		CustomerEntity customerEntity = new CustomerEntity();
		customerEntity.setCode(customerDto.getCode());
		customerEntity.setName(customerDto.getName());
		customerEntity.setAddress(customerDto.getAddress());
		customerEntity.setAge(customerDto.getAge());
		customerEntity.setRole(customerDto.getRole());
		customerEntity.setDob(customerDto.getDob());
		customerEntity.setGender(customerDto.getGender());
		customerEntity.setPhone(customerDto.getPhone());
		customerEntity.setCreatedDate(new Date());
		customerEntity.setUpdatedDate(new Date());
		return customerEntity;
	}
	
	public CustomerDto toDto(CustomerEntity customerEntity) {
		CustomerDto customerDto = new CustomerDto();
		customerDto.setCode(customerEntity.getCode());
		customerDto.setName(customerEntity.getName());
		customerDto.setAddress(customerEntity.getAddress());
		customerDto.setAge(customerEntity.getAge());
		customerDto.setRole(customerEntity.getRole());
		customerDto.setDob(customerEntity.getDob());
		customerDto.setGender(customerEntity.getGender());
		customerDto.setPhone(customerEntity.getPhone());
		customerDto.setUpdatedDate(new Date());
		return customerDto;
	}
}
