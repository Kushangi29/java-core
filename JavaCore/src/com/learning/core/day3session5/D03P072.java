package com.learning.core.day3session5;

import java.util.HashSet;

public class D03P072 {

	public D03P072() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Product> products = new HashSet<>();
		
		products.add(new Product("P001", "Maruti 800"));
        products.add(new Product("P002", "Maruti Zen"));
        products.add(new Product("P003", "Maruti Dezire"));
        products.add(new Product("P004", "Maruti Alto "));
       
        
        System.out.println("Product Details:");
        for (Product product : products) {
            System.out.println(product);
        }

	}

}
