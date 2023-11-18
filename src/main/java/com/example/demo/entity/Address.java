package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
 
@Entity
public class Address {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long addressId;
	private String state;
	private String city;
	public Address() {
	}
 
	public Address(String state, String city) {
		this.state = state;
		this.city = city;
	}
 
	public Long getAddressId() {
		return addressId;
	}
 
	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}
 
	public String getState() {
		return state;
	}
 
	public void setState(String state) {
		this.state = state;
	}
 
	public String getCity() {
		return city;
	}
 
	public void setCity(String city) {
		this.city = city;
	}
 
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", state=" + state + ", city=" + city + "]";
	}
}