package com.cg.OPN.service;

import java.util.List;

import com.cg.OPN.entity.Customer;

public interface ICustomerService {
	Customer addCustomer(Customer customer);

	Customer updateCustomer(Customer tenant);

	Customer deleteCustomer(Customer tenant);

	Customer viewCustomer(int customerId);

	List<Customer> viewAllCustomers();

	boolean validateCustomer(String userName, String password);

}
