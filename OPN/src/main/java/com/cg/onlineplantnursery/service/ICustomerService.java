package com.cg.onlineplantnursery.service;

import java.util.List;

import com.cg.onlineplantnursery.entity.Customer;


public interface ICustomerService {

	public boolean saveCustomer(Customer customer);
	public Customer getCustomerById(int customerId);
	public List<Customer> getAllCustomers();
	public boolean deleteCustomerByID(int customerId);
	public boolean checkCustomerByID(int customerId);
	public boolean subscribeTutorial(int customerId,int tutorialId);

}
