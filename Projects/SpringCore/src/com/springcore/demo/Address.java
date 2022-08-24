package com.springcore.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	private String address;
	private String city;
	private String state;
	private int zipcode;
	public Address(@Value("E-455/49") String address, @Value("Gurugram") String city, @Value("Haryana") String state, @Value("122001") int zipcode) {
		super();
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}
	public String getAddress() {
		return address;
	}
	public String getCity() {
		return city;
	}
	public String getState() {
		return state;
	}
	public int getZipcode() {
		return zipcode;
	}
}
