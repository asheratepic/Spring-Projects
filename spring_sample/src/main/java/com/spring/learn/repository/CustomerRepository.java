package com.spring.learn.repository;

import java.util.List;

import com.spring.learn.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}