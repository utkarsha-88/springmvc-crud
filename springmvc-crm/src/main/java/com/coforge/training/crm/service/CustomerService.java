package com.coforge.training.crm.service;

import java.util.List;

import com.coforge.training.crm.model.Customer;

public interface CustomerService {
	
	public void saveCustomer(Customer theCustomer);

	public List<Customer> getCustomers();

	public Customer getCustomer(int theId);

	public void deleteCustomer(int theId);

}
