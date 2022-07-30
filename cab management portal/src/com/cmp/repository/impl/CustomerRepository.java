package com.cmp.repository.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import com.cmp.model.Customer;
import com.cmp.repository.ICustomerRepository;

public class CustomerRepository implements ICustomerRepository {

	private final static CustomerRepository INSTANCE = new CustomerRepository();
	
	Map<String, Customer> customerMap = new HashMap<>();

	public CustomerRepository() {
		initialCustomerLoad();
	}
	
	public static ICustomerRepository getInstance() {
		return INSTANCE;
	}

	public void initialCustomerLoad() {
		customerMap.put("1", new Customer("1", "Shubham", "Rawat", "1234 1234 1234 1234", "9772258585"));
		customerMap.put("2", new Customer("2", "Niharika", "Singh", "1234 1234 1234 2222", "9772258586"));
		customerMap.put("3", new Customer("3", "Mohit", "Arora", "1234 1234 1234 3333", "9772258587"));
	}

	@Override
	public void insert(Customer customer) {
		customerMap.put(customer.getId(), customer);
	}

	@Override
	public Customer getCustomer(String id) {
		return customerMap.get(id);
	}

	@Override
	public Optional<Customer> getCustomerByAadhar(String aadhar) {
		return customerMap.values().stream().filter(c -> c.getAadharNumber().equals(aadhar)).findFirst();
	}

}
