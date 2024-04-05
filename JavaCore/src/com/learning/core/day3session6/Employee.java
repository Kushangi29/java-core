package com.learning.core.day3session6;

import java.util.Objects;

public class Employee {

	private int id;
    private String name;
    private String department;
    private String designation;
    
	public Employee(int id, String name, String department, String designation) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.designation = designation;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDepartment() {
		return department;
	}

	public String getDesignation() {
		return designation;
	}

	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + ", department=" + department + ", designation=" + designation
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(department, designation, id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(department, other.department) && Objects.equals(designation, other.designation)
				&& id == other.id && Objects.equals(name, other.name);
	}
	
	
	
	
    
    

}
