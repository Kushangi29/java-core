package com.learning.core.day3session6;

import java.util.Objects;

public class Book implements Comparable<Book> {
	
	private int bookId;
    private String title;
    private double price;
    private String dateOfPublication;
    private String author;
    
    
	public Book(int bookId, String title, double price, String dateOfPublication, String author) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.price = price;
		this.dateOfPublication = dateOfPublication;
		this.author = author;
	}


	public int getBookId() {
		return bookId;
	}


	public String getTitle() {
		return title;
	}


	public double getPrice() {
		return price;
	}


	public String getDateOfPublication() {
		return dateOfPublication;
	}


	public String getAuthor() {
		return author;
	}


	@Override
	public String toString() {
		return  bookId + " "  + title + " " +  price + " " + dateOfPublication + " "  + author ;
	}


	@Override
	public int hashCode() {
		return Objects.hash(author, bookId, dateOfPublication, price, title);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if(bookId != other.bookId) {
			return false;
		}
		return true;
	}
	// For comparing id
	/*@Override
   public int compareTo(Book other) {
        return Integer.compare(this.bookId, other.bookId);
    }*/
	
	// for comparing author
	@Override
    public int compareTo(Book other) {
        return this.author.compareTo( other.author);
    }
	
	
    
    
	

}
