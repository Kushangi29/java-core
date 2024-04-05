package com.learning.core.day3session6;

import java.util.Objects;

public class PhoneBook {
	
	private String name;
    private String phoneNumber;
    
	public PhoneBook(String name, String phoneNumber) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	@Override
	public String toString() {
		return "[name=" + name + ", phoneNumber=" + phoneNumber + "]";
	}

	
    
	
    

}
