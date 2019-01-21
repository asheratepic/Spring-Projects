package com.spring.learn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.spring.learn.model.Customer;
import com.spring.learn.repository.CustomerRepository;

/*
 * This is really a basic pass through of the service implementation
 */
@Service("customerService")
@Scope("prototype")
public class CustomerServiceImpl implements CustomerService {
	
	//observe that we have hardcoded a concrete implementation to an interface.
	//this is what Spring helps prevent.
	
	private CustomerRepository customerRepository;
	
	public CustomerServiceImpl() {
		
	}
	
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		System.out.println("We are using constructor injection");
		this.customerRepository = customerRepository;
	}
	@Autowired
	public void setCustomerRepository(CustomerRepository customerRepository) {
		System.out.println("We are using setter injection");
		this.customerRepository = customerRepository;
	}
	/* (non-Javadoc)
	 * @see com.spring.learn.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}
	
}
