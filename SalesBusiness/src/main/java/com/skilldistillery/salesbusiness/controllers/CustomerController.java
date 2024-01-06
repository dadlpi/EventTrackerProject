package com.skilldistillery.salesbusiness.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skilldistillery.salesbusiness.entities.Customer;
import com.skilldistillery.salesbusiness.services.CustomerService;

@RestController
@RequestMapping("api")
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@GetMapping(path = {"customers", "customers/"})
	public List<Customer> index(){
		return customerService.getAllCustomers();
	}

	
}
