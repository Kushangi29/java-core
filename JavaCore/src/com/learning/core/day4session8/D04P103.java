package com.learning.core.day4session8;

import java.util.Scanner;

public class D04P103 {
	 static boolean linearSearch(int arr[], int target) {
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] == target) {
	                return true; 
	            }
	        }
	        return false; 
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        System.out.print("Enter the element to search: ");
        int target = scanner.nextInt();
        
        if (linearSearch(arr, target)) {
            System.out.println("Element is Present");
        } else {
            System.out.println("Element is Not Present");
        }

	}

}
