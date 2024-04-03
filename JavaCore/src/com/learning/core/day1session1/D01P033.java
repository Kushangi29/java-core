package com.learning.core.day1session1;

import java.util.Scanner;

public class D01P033 {

	public D01P033() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the percentage obtained: ");
	        int percentage = scanner.nextInt();

	        char grade;

	        if (percentage >= 60) {
	            grade = 'A';
	        } else if (percentage >= 45) {
	            grade = 'B';
	        } else if (percentage >= 35) {
	            grade = 'C';
	        } else {
	            grade = 'F';
	        }

	        switch (grade) {
	            case 'A':
	                System.out.println("A Grade");
	                break;
	            case 'B':
	                System.out.println("B Grade");
	                break;
	            case 'C':
	                System.out.println("C Grade");
	                break;
	            case 'F':
	                System.out.println("Fail");
	                break;
	            default:
	                System.out.println("Invalid percentage");

	        }
	}

}
