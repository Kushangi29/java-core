package com.learning.core.day3session5;

public class Product {
	
	private String productId;
	private String productName;
	
	public Product(String productId, String productName) {
		super();
		this.productId = productId;
		this.productName = productName;
	}

	public String getProductId() {
		return productId;
	}

	public String getProductName() {
		return productName;
	}

	@Override
	public String toString() {
		return productId + " " + productName;
	}
	
	
	

}
