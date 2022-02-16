package com.cg.onlineplantnursery.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.onlineplantnursery.entity.Customer;

@Repository
public interface ICustomerRepository extends CrudRepository<Customer, Integer> 
     
{
   // findALL , Save, findById , delete 
	// +
	
	// methods from custom account repository
}