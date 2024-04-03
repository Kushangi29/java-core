package com.learning.core.day1session1;

import java.util.Scanner;

public class D01P034 {

	public D01P034() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		 System.out.print("Enter the input: ");
	        int n = scanner.nextInt();

	        for (int i = 1; i <= n; i++) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print(i);
	            }
	            System.out.println();
	        }
	}

}
