package com.learning.core.day2session3;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class D02P058 {

	public D02P058() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter the string:");
	        String input = scanner.nextLine();

	        boolean canBeSplit = canSplitIntoFourDistinctStrings(input);

	        if (canBeSplit) {
	            System.out.println("Yes");
	        } else {
	            System.out.println("No");
	        }
	    }

	    private static boolean canSplitIntoFourDistinctStrings(String input) {
	        if (input.length() < 4) {
	            return false;
	        }

	        Set<Character> characters = new HashSet<>();
	        for (char c : input.toCharArray()) {
	            characters.add(c);
	        }

	        return characters.size() >= 4;
	}

}
