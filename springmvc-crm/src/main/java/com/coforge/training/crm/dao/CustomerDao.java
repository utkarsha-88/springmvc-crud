package com.coforge.training.crm.dao;

import java.util.List;

import com.coforge.training.crm.model.Customer;

public interface CustomerDao {
	
	
	public void saveCustomer(Customer theCustomer);
	
	public List<Customer> getCustomers();
	
	public Customer getCustomer(int theId);
	
	public void deleteCustomer(int theId);



}
