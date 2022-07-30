package com.cmp.services.impl;

import com.cmp.exceptions.CustomerAlreadyPresentException;
import com.cmp.model.Customer;
import com.cmp.repository.ICustomerRepository;
import com.cmp.services.ICustomerService;

public class CustomerService implements ICustomerService {

	private ICustomerRepository customerRepository;
	
	public CustomerService(ICustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	@Override
	public void addNewCustomer(Customer customer) throws CustomerAlreadyPresentException {
		if(customerRepository.getCustomerByAadhar(customer.getAadharNumber()).isPresent()) {
			throw new CustomerAlreadyPresentException("Cannot create new customer as Customer already exist with aadhar " + customer.getAadharNumber());
		}
		customerRepository.insert(customer);
	}

}
