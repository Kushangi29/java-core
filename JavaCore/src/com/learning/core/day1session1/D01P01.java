package com.learning.core.day1session1;

public class D01P01 extends Book {
	
	public D01P01(String bookTitle, double bookPrice) {
		super(bookTitle, bookPrice);
		// TODO Auto-generated constructor stub
	}
	public static  Book createBooks(String title, double price) {
        return new Book(title, price);
    }
	
	public static void showBooks(Book book) {
        System.out.println("Book Title: " + book.getBookTitle() + ", Price:" + book.getBookPrice());
    }
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book mybook = D01P01.createBooks("Java Programming", 350.00);
		D01P01.showBooks(mybook);
	}

}
