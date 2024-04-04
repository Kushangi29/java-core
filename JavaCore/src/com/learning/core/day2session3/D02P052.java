package com.learning.core.day2session3;

import java.util.Scanner;

public class D02P052 {

	public D02P052() {
		// TODO Auto-generated constructor stub
	}
	
	public static String getLastNVowels(String str, int n) {
        StringBuilder result = new StringBuilder();
        int count = 0;
        for (int i = str.length() - 1; i >= 0 && count < n; i--) {
            char ch = Character.toLowerCase(str.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                result.insert(0, ch);
                count++;
            }
        }
        return result.toString();
    }

    public static int countLastNVowels(String str, int n) {
        int count = 0;
        for (int i = str.length() - 1; i >= 0 && count < n; i--) {
            char ch = Character.toLowerCase(str.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return (count == n) ? count : -1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        System.out.println("Enter the number of vowels to count from the end: ");
        int n = scanner.nextInt();

        int vowelCount = countLastNVowels(input, n);

        if (vowelCount == -1) {
            System.out.println("Mismatch in Vowel Count");
        } else {
            System.out.println("Last " + n + " vowels from the end: " + getLastNVowels(input, n));
        }

	}

}
