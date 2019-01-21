package com.spring.learn.repository;

import java.util.ArrayList;
import java.util.List;

import com.spring.learn.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	
	private String dbUsername;
	
	
	public void setDbUsername(String dbUsername) {
		this.dbUsername = dbUsername;
	}


	/* (non-Javadoc)
	 * @see com.spring.learn.repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		System.out.println(dbUsername);
		List<Customer> customers = new ArrayList<>();
		
		Customer customer = new Customer();
		customer.setFirstName("Zain");
		customer.setLastName("Khan");
		
		customers.add(customer);
		
		return customers;
	}
}
