package com.learning.core.day2session3;

import java.util.Scanner;

public class D02P054 {

	public D02P054() {
		// TODO Auto-generated constructor stub
	}
	
	public static int deletion(String input,int i, int j) {
		if(i >= j) {
        	return 0;
        }
		
		if (input.charAt(i) == input.charAt(j)) {
            return deletion(input, i + 1, j - 1);
        }
		
		return 1 + Math.min(deletion(input, i, j - 1), deletion(input, i + 1, j));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();
        
        int len = input.length();
        System.out.println(deletion(input, 0, len-1));
        

	}

}
