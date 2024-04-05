package com.learning.core.day3session6;

import java.util.Hashtable;

public class D03P0811 {

	public D03P0811() {
		// TODO Auto-generated constructor stub
	}
	
	public static void addEmployeeIfNotExist(Hashtable<Integer, Employee> employees, Employee newEmployee) {
        if (!employees.containsKey(newEmployee.getId())) {
            employees.put(newEmployee.getId(), newEmployee);
            System.out.println("Added new employee: " + newEmployee);
        } else {
            System.out.println("Employee with ID " + newEmployee.getId() + " already exists.");
        }
	}
        
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer, Employee> employees = new Hashtable<>();

        // Add predefined employee information to Hashtable
        employees.put(1001, new Employee(1001, "John Mathew", "IT", "Software Engineer"));
        employees.put(1002, new Employee(1002, "Kush Dharmik", "HR", "HR Manager"));
        employees.put(1003, new Employee(1003, "Ravi Verma", "Finance", "Accountant"));
        employees.put(1004, new Employee(1004, "Jim Brown", "Marketing", "Marketing Specialist"));
        
        addEmployeeIfNotExist(employees, new Employee(1005, "Dhruv Malik", "Finance", "Financial Analyst"));
        addEmployeeIfNotExist(employees, new Employee(1006, "Esha Jain", "HR", "Recruiter"));

        // Display updated employee details
        System.out.println("Updated Employee Details:");
        for (Employee employee : employees.values()) {
            System.out.println(employee);
        }
	}

}
