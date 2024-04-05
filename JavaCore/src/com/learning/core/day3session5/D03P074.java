package com.learning.core.day3session5;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class D03P074 {

	public D03P074() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Product> products = new HashSet<>();

        // Add product
        products.add(new Product("P001", "Maruti 800"));
        products.add(new Product("P002", "Maruti Zen"));
        products.add(new Product("P003", "Maruti Dezire"));
        products.add(new Product("P004", "Maruti Alto"));

        // Remove 
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the product id : ");
        String removeProductId = scanner.nextLine();
        
        
        
        Iterator<Product> iterator = products.iterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            if (product.getProductId().equals(removeProductId)) {
                iterator.remove();
                break;
            }
        }

        // Display 
        System.out.println("Updated Product Details:");
        for (Product product : products) {
            System.out.println(product);
        }
	}

}
