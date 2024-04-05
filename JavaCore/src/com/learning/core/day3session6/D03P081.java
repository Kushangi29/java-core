package com.learning.core.day3session6;

import java.util.HashMap;

public class D03P081 {

	public D03P081() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, String> phoneBook = new HashMap<>();

        // Add 
        phoneBook.put("Amal", "9987654634");
        phoneBook.put("Manvitha", "9876543210");
        phoneBook.put("Joseph", "9456783453");
        phoneBook.put("Smith", "7890123456");
        phoneBook.put("Kathe", "8563212974");

        // phone book details
        System.out.println("Phone Book Details:");
        for (String name : phoneBook.keySet()) {
            String phoneNumber = phoneBook.get(name);
            System.out.println("Name: " + name + " "+ " Phone Number: " + phoneNumber);
        }

	}

}
