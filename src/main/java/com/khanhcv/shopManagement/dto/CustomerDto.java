package com.khanhcv.shopManagement.dto;

import java.util.Date;

import lombok.Data;

@Data
public class CustomerDto {
	private String code;
	private String name;
	private String userName;
	private String password;
	private String role;
	private int age;
	private String address;
	private int phone;
	private Date dob;
	private String gender;
	private Date createdDate;
	private Date updatedDate;
}
