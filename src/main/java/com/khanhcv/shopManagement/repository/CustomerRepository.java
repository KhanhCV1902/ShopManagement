package com.khanhcv.shopManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.khanhcv.shopManagement.entity.CustomerEntity;

public interface CustomerRepository extends JpaRepository<CustomerEntity, String>{

}
