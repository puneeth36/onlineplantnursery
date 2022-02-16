package com.cg.onlineplantnursery.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.onlineplantnursery.entity.Customer;
import com.cg.onlineplantnursery.entity.Tutorial;
import com.cg.onlineplantnursery.repository.ICustomerRepository;
import com.cg.onlineplantnursery.repository.ITutorialRepository;



@Service

public class CustomerServiceImpl implements ICustomerService{
	
	@Autowired
	ICustomerRepository repository;
	
	@Autowired
	ITutorialRepository tutorialRepository;

	@Override
	public boolean saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		repository.save(customer);
		return true;
	}

	@Override
	public Customer getCustomerById(int customerId) {
		// TODO Auto-generated method stub
		return repository.findById(customerId).get();
	}

	@Override
	public List<Customer> getAllCustomers() {
		 List<Customer> list = (List<Customer>) repository.findAll();
	     return list;
	}

	@Override
	public boolean deleteCustomerByID(int customerId) {
		repository.deleteById(customerId);
		return true;
	}

	@Override
	public boolean checkCustomerByID(int customerId) {
		return repository.existsById(customerId);
	}

	@Override
	@Transactional
	public boolean subscribeTutorial(int customerId, int tutorialId) {
		Tutorial t = tutorialRepository.findById(tutorialId).get();
		Customer customer= getCustomerById(customerId);
		if(customer!=null && t!= null)
		{
			List<Tutorial> tutorials = customer.getTutorials();
			tutorials.add(t);
			customer.setTutorials(tutorials);
		}
		
		repository.save(customer);
		
		return true;
	
	}
	

}
