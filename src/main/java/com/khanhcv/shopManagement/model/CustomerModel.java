package com.khanhcv.shopManagement.model;

import java.util.ArrayList;
import java.util.List;

import com.khanhcv.shopManagement.dto.CustomerDto;

import lombok.Data;

@Data
public class CustomerModel {
	private List<CustomerDto> CustomerDto = new ArrayList<>();
}
