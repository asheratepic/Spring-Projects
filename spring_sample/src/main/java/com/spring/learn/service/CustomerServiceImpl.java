package com.spring.learn.service;

import java.util.List;

import com.spring.learn.model.Customer;
import com.spring.learn.repository.CustomerRepository;
import com.spring.learn.repository.HibernateCustomerRepositoryImpl;

/*
 * This is really a basic pass through of the service implementation
 */
public class CustomerServiceImpl implements CustomerService {
	
	//observe that we have hardcoded a concrete implementation to an interface.
	//this is what Spring helps prevent.
	private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();

	/* (non-Javadoc)
	 * @see com.spring.learn.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}
	
}
