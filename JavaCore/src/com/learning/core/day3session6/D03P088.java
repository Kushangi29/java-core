package com.learning.core.day3session6;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class D03P088 {

	public D03P088() {
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
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter the name of the car to remove: ");
        String carNameToRemove = scanner.nextLine();

        Car carToRemove = null;
        for (Car car : cars.keySet()) {
            if (car.getName().equalsIgnoreCase(carNameToRemove)) {
                carToRemove = car;
                break;
            }
        }

        if (carToRemove != null) {
            String removedCar = cars.remove(carToRemove);
            System.out.println("Removed car: " + removedCar);
        } else {
            System.out.println("Car not found in the list.");
        }

        // Get the key-value mapping associated with the greatest key
        Map.Entry<Car, String> greatestEntry = ((TreeMap<Car, String>) cars).lastEntry();
        if (greatestEntry != null) {
            System.out.println("\nKey-value mapping associated with the greatest key:");
            System.out.println(greatestEntry.getKey() );
        } else {
            System.out.println("\nThe TreeMap is empty.");
        }

	}

}
