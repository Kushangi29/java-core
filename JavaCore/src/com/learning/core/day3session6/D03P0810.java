package com.learning.core.day3session6;

import java.util.Hashtable;
import java.util.Scanner;

public class D03P0810 {

	public D03P0810() {
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
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter employee id to search: ");
        int searchId = scanner.nextInt();

        // Search for the specific employee
        Employee employee = employees.get(searchId);

        // Print the details if found, else print "Employee not found"
        if (employee != null) {
            System.out.println("Employee found: " + employee);
        } else {
            System.out.println("Employee not found");
        }

	}

}
