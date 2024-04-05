package com.learning.core.day3session6;

import java.util.Map;
import java.util.TreeMap;

public class D03P086 {

	public D03P086() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Car, String> cars = new TreeMap<>();

        // Add 
        cars.put(new Car("Benz", 25000),"Benz" );
        cars.put(new Car("Honda", 28000),"Honda");
        cars.put(new Car("BMW", 45000), "BMW");
        cars.put(new Car("Audi", 50000), "Audi");
        
        System.out.println("Car Prices in Reverse Order:");
        for (Car car : cars.keySet()) {
            System.out.println(car);
        }
	}

}
