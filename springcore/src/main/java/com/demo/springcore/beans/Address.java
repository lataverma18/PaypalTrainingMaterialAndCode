package com.demo.springcore.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("empAddress")
@PropertySource("data.properties")
//@Profile("dev,default")
public class Address {
	private String address;
	private String city;
	private String state;
	private String zipcode;
	public String getAddress() {
		return address;
	}
	@Value("${employee.address.add}")
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	@Value("${employee.address.city}")
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	@Value("${employee.address.state}")
	public void setState(String state) {
		this.state = state;
	}
	public String getZipcode() {
		return zipcode;
	}
	@Value("${employee.address.zipcode}")
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	@Override
	public String toString() {
		return "Address [address=" + address + ", city=" + city + ", state=" + state + ", zipcode=" + zipcode + "]";
	}
	
}
