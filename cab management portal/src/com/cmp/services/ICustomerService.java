package com.cmp.services;

import com.cmp.exceptions.CustomerAlreadyPresentException;
import com.cmp.model.Customer;

public interface ICustomerService {
	
	public void addNewCustomer(Customer customer) throws CustomerAlreadyPresentException;

}
