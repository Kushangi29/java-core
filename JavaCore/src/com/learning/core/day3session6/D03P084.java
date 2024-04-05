package com.learning.core.day3session6;

import java.util.TreeSet;

public class D03P084 {

	public D03P084() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		TreeSet<Book> books = new TreeSet<>();

        // Add 
        books.add(new Book(1001, "Java Programming", 350.00, "15/01/2022", "John Smith"));
        books.add(new Book(1002, "Data Structures and Algorithms", 495.00, "20/12/2021", "Kush Dharmik"));
        books.add(new Book(1003, "Introduction to Machine Learning", 550.00, "10/02/2023", "Labh Sinha"));
        books.add(new Book(1004, "Database Management Systems", 3550.00, "05/03/2022", "Riya Singh "));
        books.add(new Book(1005, "Software Engineering Principles", 1850.00, "01/04/2022", "David Brown"));

     // Print 
        System.out.println("Book Details sorted by author names:");
        for (Book book : books) {
            System.out.println(book);
        }
	}

}
