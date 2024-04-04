package com.learning.core.day2session3;

import java.util.Scanner;

public class D02P059 {

	public D02P059() {
		// TODO Auto-generated constructor stub
	}
	
	private static String replaceSpaces(String input) {
        StringBuilder newString = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (c == ' ') {
                newString.append("%20");
            } else {
                newString.append(c);
            }
        }

        return newString.toString();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string:");
        String input = scanner.nextLine();
        
        String newString = replaceSpaces(input);
        System.out.println(newString);
	}

}
