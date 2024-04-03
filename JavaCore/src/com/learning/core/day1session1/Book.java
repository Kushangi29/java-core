package com.learning.core.day1session1;

public class Book {
	
	private String bookTitle;
    private double bookPrice;


	public Book(String bookTitle, double bookPrice) {
		// TODO Auto-generated constructor stub
		this.bookTitle = bookTitle;
        this.bookPrice = bookPrice;
	}


	public String getBookTitle() {
		return bookTitle;
	}


	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}


	public double getBookPrice() {
		return bookPrice;
	}


	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}
	

}
