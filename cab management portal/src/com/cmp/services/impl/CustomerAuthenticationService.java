package com.cmp.services.impl;

import com.cmp.model.Customer;
import com.cmp.repository.ICustomerRepository;
import com.cmp.services.IAuthenticationService;

public class CustomerAuthenticationService implements IAuthenticationService {
		
	private ICustomerRepository customerRepository;
	public CustomerAuthenticationService(ICustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
	
	public boolean authenticate(String id, String password) {
		
		Customer customer = customerRepository.getCustomer(id);
		return customer.isAuthenticate(password);
	
	}
		

}
