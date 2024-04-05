package com.learning.core.day3session6;

import java.util.Hashtable;

public class D03P089 {

	public D03P089() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer, Employee> employees = new Hashtable<>();

        // Add predefined employee information to Hashtable
        employees.put(1001, new Employee(1001, "John Mathew", "IT", "Software Engineer"));
        employees.put(1002, new Employee(1002, "Kush Dharmik", "HR", "HR Manager"));
        employees.put(1003, new Employee(1003, "Ravi Verma", "Finance", "Accountant"));
        employees.put(1004, new Employee(1004, "Jim Brown", "Marketing", "Marketing Specialist"));

        // Verify whether the Hashtable is empty or not
        boolean isEmpty = employees.isEmpty();
        System.out.println(isEmpty);
	}

}
