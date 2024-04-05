package com.learning.core.day3session5;

import java.util.HashSet;
import java.util.Scanner;

public class D03P073 {

	public D03P073() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Product> products = new HashSet<>();

        // Add predefined product information to HashSet
        products.add(new Product("P001", "Maruti 800"));
        products.add(new Product("P002", "Maruti Zen"));
        products.add(new Product("P003", "Maruti Dezire"));
        products.add(new Product("P004", "Maruti Alto"));

        // Search 
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the product id : ");
        String searchProductId = scanner.nextLine();
        System.out.print("Enter the product name : ");
        String searchProductName = scanner.nextLine();
        
        boolean found = false;
        
        for (Product product : products) {
            if (product.getProductId().equals(searchProductId) && product.getProductName().equals(searchProductName)) {
                found = true;
                break;
            }
        }

        // Display 
        if (found) {
            System.out.println("Product Found");
        } else {
            System.out.println("Product Not Found");
        }
	}

}
