package com.learning.core.day1session1;

import java.util.Scanner;

public class D01P043 {

	public D01P043() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int N = scanner.nextInt();
        
        int[] arr = new int[N];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        
        int index = findFirstRepeatingIndex(arr);
        
        if (index != -1) {
            System.out.println(index);
        } else {
            System.out.println("Their is no repeating element in Array.");
        }
    }
    
    	public static int findFirstRepeatingIndex(int[] arr) {
        
    		for (int i = 0; i < arr.length; i++) {
	            
	            for (int j = i + 1; j < arr.length; j++) {
	                if (arr[i] == arr[j]) {
	                    return j;
	                }
	            }
	        }
	        return -1;
    	}
	}
