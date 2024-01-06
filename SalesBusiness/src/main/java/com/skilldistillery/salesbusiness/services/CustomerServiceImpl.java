package com.skilldistillery.salesbusiness.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skilldistillery.salesbusiness.entities.Customer;
import com.skilldistillery.salesbusiness.repositories.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public List<Customer> getAllCustomers() {
		return customerRepository.findAll();
	}

	@Override
	public Customer getCustomer(int customerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer createCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer updateCustomer(int customerId, Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer deleteCustomer(int customerId) {
		// TODO Auto-generated method stub
		return null;
	}

}
