package com.learning.core.day1session1;

import java.util.Scanner;

public class D01P041 {

	public D01P041() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two numbers in the range from 1 to 40:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        
        System.out.print("Enter five numbers in the range from 1 to 40: ");
        int[] array = new int[5];
        for (int i = 0; i < 5; i++) {
            array[i] = scanner.nextInt();
        }
        
        boolean find_num1 = false;
        boolean find_num2 = false;
        for (int i = 0; i < 5; i++) {
            if (array[i] == num1) {
                find_num1 = true;
            }
            if (array[i] == num2) {
                find_num2 = true;
            }
        }
        
        if(find_num1 && find_num2 ) {
        	System.out.println("Its Bingo");
        }
        else {
        	System.out.println("Not Found");
        }
	}

}
