package com.learning.core.day3session5;

import java.util.Objects;

public class Person implements Comparable<Person> {
	
	private int id;
    private String name;
    private int age;
    private double salary;
    
    
	public Person(int id, String name, int age, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}


	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public int getAge() {
		return age;
	}


	public double getSalary() {
		return salary;
	}


	@Override
	public String toString() {
		return " [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(age, id, name, salary);
	}
	

	@Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        if (id != other.id)
            return false;
        return true;
    }



	@Override
    public int compareTo(Person other) {
        return Integer.compare(this.id, other.id);
    }
	
	
}
		
	
	
    
    


