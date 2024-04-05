package com.learning.core.day3session6;

import java.util.HashMap;
import java.util.Scanner;

public class D03P082 {

	public D03P082() {
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
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name : ");
        String searchName = scanner.nextLine();
        
        if (phoneBook.containsKey(searchName)) {
            String phoneNumber = phoneBook.get(searchName);
            System.out.println("Phone number for " + searchName + " is: " + phoneNumber);
        } else {
            System.out.println("Phone number for " + searchName + " not found.");
        }
	}

}
