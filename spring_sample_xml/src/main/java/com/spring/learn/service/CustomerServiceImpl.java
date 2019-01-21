package com.spring.learn.service;

import java.util.List;

import com.spring.learn.model.Customer;
import com.spring.learn.repository.CustomerRepository;

/*
 * This is really a basic pass through of the service implementation
 */
public class CustomerServiceImpl implements CustomerService {

	// observe that we have hardcoded a concrete implementation to an interface.
	// this is what Spring helps prevent.
//	private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();

	private CustomerRepository customerRepository;

	public CustomerServiceImpl() {
		
	}
	
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.spring.learn.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

	// we will use the setter injection
	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
}
