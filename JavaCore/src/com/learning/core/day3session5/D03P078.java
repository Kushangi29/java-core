package com.learning.core.day3session5;

import java.util.TreeSet;

public class D03P078 {

	public D03P078() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Person> persons = new TreeSet<>();

        // Add 
	 	persons.add(new Person(101, "John", 20, 50000));
        persons.add(new Person(102, "Bob", 28, 60000));
        persons.add(new Person(103, "Kush", 24, 70000));
        persons.add(new Person(104, "David", 22, 45000));
        persons.add(new Person(105, "Labh", 27, 55000));
        persons.add(new Person(106, "Ravi", 26, 52000));
        
        double totalSalary = 0;
        for (Person person : persons) {
            totalSalary += person.getSalary();
        }

        // Print 
        System.out.println("Sum of all salaries: " + totalSalary);
	}

}
