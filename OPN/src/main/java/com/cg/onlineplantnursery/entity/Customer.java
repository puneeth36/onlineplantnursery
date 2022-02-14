package com.cg.onlineplantnursery.entity;

import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;



@Entity
public class Customer {
	private Integer customerId;
	@NotNull(message = "cutomer name should not be null")
	private String customerName;
	@Email
	private String customerEmail;
	private String username;
	private String password;
	
	
	@Embedded
	private Address address;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(
			name="Customer_Tutorial_Info",
			joinColumns=@JoinColumn(name="customerdetails"),
			inverseJoinColumns=@JoinColumn(name="tutorialdetails"))
	private List<Tutorial> tutorials;
	
	
	
	public Customer(List<Tutorial> tutorials) {
		super();
		this.tutorials = tutorials;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerEmail="
				+ customerEmail + ", username=" + username + ", password=" + password + ", address=" + address + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(address, customerEmail, customerId, customerName, password, username);
	}
	
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(address, other.address) && Objects.equals(customerEmail, other.customerEmail)
				&& Objects.equals(customerId, other.customerId) && Objects.equals(customerName, other.customerName)
				&& Objects.equals(password, other.password) && Objects.equals(username, other.username);
	}
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public void setTutorials(List<Tutorial> tutorials) {
		// TODO Auto-generated method stub
		this.tutorials = tutorials;
		
	}
	public List<Tutorial> getTutorials() {
		// TODO Auto-generated method stub
		return tutorials;
	}
	
	
}



