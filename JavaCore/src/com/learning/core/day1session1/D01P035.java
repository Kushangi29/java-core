package com.learning.core.day1session1;

import java.util.Scanner;

public class D01P035 {

	public D01P035() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		 System.out.print("Enter the input: ");
	        int n = scanner.nextInt();
	        long factorial = 1;
	        for(int i = 1; i <= n; ++i)
	        {
	        	// factorial = factorial * i;
	        	factorial *= i;
	        }
        System.out.printf("Factorial of %d = %d", n, factorial);
	}

}
