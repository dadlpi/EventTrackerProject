package com.skilldistillery.salesbusiness.services;

import java.util.List;

import com.skilldistillery.salesbusiness.entities.Customer;

public interface CustomerService {

	List<Customer> getAllCustomers();
	Customer getCustomer(int customerId);
	Customer createCustomer(Customer customer);
	Customer updateCustomer(int customerId, Customer customer);
	Customer deleteCustomer(int customerId);
	
	
}
