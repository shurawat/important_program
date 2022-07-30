package com.cmp.repository;

import java.util.Optional;

import com.cmp.model.Customer;

public interface ICustomerRepository {

	public void insert(Customer customer);

	public Customer getCustomer(String id);

	public Optional<Customer> getCustomerByAadhar(String aadhar);

}
