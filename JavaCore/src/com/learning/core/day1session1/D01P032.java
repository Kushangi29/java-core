package com.learning.core.day1session1;

import java.util.Scanner;

public class D01P032 {

	public D01P032() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 to 7: ");
        int weekDay = scanner.nextInt();

        String weekdayName;
        if (weekDay == 1) {
            weekdayName = "Sunday";
        } else if (weekDay == 2) {
            weekdayName = "Monday";
        } else if (weekDay == 3) {
            weekdayName = "Tuesday";
        } else if (weekDay == 4) {
            weekdayName = "Wednesday";
        } else if (weekDay == 5) {
            weekdayName = "Thursday";
        } else if (weekDay == 6) {
            weekdayName = "Friday";
        } else if (weekDay == 7) {
            weekdayName = "Saturday";
        } else {
            weekdayName = "Invalid Input";
        }

        System.out.println(weekdayName);
	}

}
