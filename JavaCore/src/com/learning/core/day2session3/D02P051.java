package com.learning.core.day2session3;

import java.util.Scanner;

public class D02P051 {

	public D02P051() {
		// TODO Auto-generated constructor stub
	}
	
	//method to check palindrome
	public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter a string: ");
	        String input = scanner.nextLine();
	        
	        //Length of String
	        System.out.println("Length of the string: " + input.length());
	        
	        // Convert string in uppercase
	        String upperCaseInput = input.toUpperCase();
	        System.out.println("Uppercase string: " + upperCaseInput);
	        
	        
	        
	        if (isPalindrome(input)) {
	            System.out.println("It is a Palindrome");
	        } else {
	            System.out.println("It is not a Palindrome");
	        }

	}

}
