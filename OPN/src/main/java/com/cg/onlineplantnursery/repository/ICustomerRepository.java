package com.cg.onlineplantnursery.repository;

import org.springframework.data.repository.CrudRepository;

import com.cg.onlineplantnursery.entity.Customer;

public interface ICustomerRepository extends CrudRepository<Customer, Integer> 
     
{
   // findALL , Save, findById , delete 
	// +
	
	// methods from custom account repository
}