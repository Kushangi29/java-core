package com.learning.core.day3session6;

import java.util.Objects;

public class Car implements Comparable<Car> {
	
	private String name;
    private double price;
    
	public Car(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return " [name=" + name + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return Objects.equals(name, other.name)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
	}
	// Comparing name
	/* @Override
	    public int compareTo(Car other) {
	        return this.name.compareTo(other.name);
	    }*/
// Comparing Price for reverse order
	/* @Override
	    public int compareTo(Car other) {
	        return this.price == other.price ? 0 : (this.price < other.price ? 1 : -1);
	    }*/
	
  // Comparing price for least and high price
	
	@Override
    public int compareTo(Car other) {
        return Double.compare(this.price, other.price);
    }
}
