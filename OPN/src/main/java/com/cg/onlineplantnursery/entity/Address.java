package com.cg.onlineplantnursery.entity;

import java.util.Objects;

public class Address {
	private Integer addressId;
	private String houseNo;
	private String colony;
	private String city;
	private String state;
	private int pincode;
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", houseNo=" + houseNo + ", colony=" + colony + ", city=" + city
				+ ", state=" + state + ", pincode=" + pincode + "]";
	}
	public Integer getAddressId() {
		return addressId;
	}
	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}
	public String getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}
	public String getColony() {
		return colony;
	}
	public void setColony(String colony) {
		this.colony = colony;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public int hashCode() {
		return Objects.hash(addressId, city, colony, houseNo, pincode, state);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		return Objects.equals(addressId, other.addressId) && Objects.equals(city, other.city)
				&& Objects.equals(colony, other.colony) && Objects.equals(houseNo, other.houseNo)
				&& pincode == other.pincode && Objects.equals(state, other.state);
	}
	
	
}
