package com.learning.core.day2session3;

import java.util.Scanner;

public class D02P053 {

	public D02P053() {
		// TODO Auto-generated constructor stub
	}
	
	private static void printAllSubstrings(String input) {
         
        for (int i = 0; i <= input.length(); i++) 
        {
            for (int j = i+1; j <= input.length(); j++) 
            {
                System.out.println(input.substring(i,j));
            }
        }
    }

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();
        
        printAllSubstrings(input);
        
        
	}

}
