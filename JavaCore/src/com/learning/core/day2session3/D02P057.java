package com.learning.core.day2session3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class D02P057 {

	public D02P057() {
		// TODO Auto-generated constructor stub
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	       
	        System.out.println("Enter a strings :");
	        String input = scanner.nextLine();

	        
	        String[] words = input.split("\\s+");

	      
	        String patternString = "^x.*y$"; 

	       
	        Pattern pattern = Pattern.compile(patternString);

	        
	        List<String> matchedStrings = new ArrayList<>();

	        
	        for (String word : words) {
	            Matcher matcher = pattern.matcher(word);
	            if (matcher.matches()) {
	                matchedStrings.add(word);
	            }
	        }

	       
	        System.out.println("Output:");
	        for (String matchedString : matchedStrings) {
	            System.out.print(matchedString + " ");
	        }


	}

}
