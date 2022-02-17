package com.cg.onlineplantnursery.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.onlineplantnursery.entity.Customer;
import com.cg.onlineplantnursery.service.ICustomerService;

@RestController
@RequestMapping("/app")
public class WebController {
	@Autowired
	ICustomerService service;
	
	@GetMapping("/customer")
	public Customer getCustomerInfo(@RequestParam int CustomerId)
	{
		return service.getCustomerById(CustomerId);
	}
	
	@GetMapping("/customers")
	public List<Customer> getAllCustomers()
	{
		return service.getAllCustomers();
	}
	 
	
	@PostMapping("/tutorial")
	public ResponseEntity<Boolean> addTutorial(@RequestParam int customerId ,@RequestParam int tutorialId)
	{
		boolean a = service.subscribeTutorial(customerId,tutorialId);
		return new ResponseEntity<Boolean>(a, HttpStatus.OK);
	}
	
	
		
}
	


		