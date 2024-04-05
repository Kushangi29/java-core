package com.learning.core.day3session5;

import java.util.TreeSet;

public class D03P077 {

	public D03P077() {
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
	        

	        // Print 
	        System.out.println("Names of persons in uppercase:");
	        for (Person person : persons) {
	            System.out.println(person.getName().toUpperCase());
	        }

	}

}
