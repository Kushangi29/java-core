package com.learning.core.day3session5;

import java.util.ArrayList;
import java.util.Scanner;

public class D03P071 {
	
	private static void addStudents(ArrayList<String> studentList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student names :");
        String[] student_names = scanner.nextLine().split(" ");
        for (String name : student_names) {
            studentList.add(name);
        }
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> studentList = new ArrayList<>();

       
        addStudents(studentList);

       
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of student to search: ");
        String name = scanner.nextLine();

       
        if (studentList.contains(name)) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
	}

}
