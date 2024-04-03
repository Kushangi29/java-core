package com.learning.core.day1session1;

import java.util.Arrays;
import java.util.Scanner;

public class D01P044 {

	public D01P044() {
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
        
        System.out.print("Enter the value of k: ");
        int k = scanner.nextInt();
        
        int[] combination = new int[k];
        findCombinations(arr, k, 0, combination, 0);
	}
	
	public static void findCombinations(int[] arr, int k, int index, int[] combination, int start) {
        if (index == k) {
            System.out.println(Arrays.toString(combination));
            return;
        }

        for (int i = start; i < arr.length; i++) {
            combination[index] = arr[i];
            findCombinations(arr, k, index + 1, combination, i + 1);
        }
    }

}
