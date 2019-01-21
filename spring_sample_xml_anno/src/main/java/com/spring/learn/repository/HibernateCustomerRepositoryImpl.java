package com.spring.learn.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.spring.learn.model.Customer;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	
	@Value("${awsuser}")
	private String awsuser;
	/* (non-Javadoc)
	 * @see com.spring.learn.repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		System.out.println(awsuser);
		List<Customer> customers = new ArrayList<>();
		
		Customer customer = new Customer();
		customer.setFirstName("Zain");
		customer.setLastName("Khan");
		
		customers.add(customer);
		
		return customers;
	}
}
