package com.learning.core.day2session4;

import java.util.Scanner;

public class D02P062 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);

        System.out.println("Enter player name:");
        String playerName = scanner.nextLine();
        System.out.println("Enter critic 1 rating:");
        float critic1 = scanner.nextFloat();
        System.out.println("Enter critic 2 rating:");
        float critic2 = scanner.nextFloat();
        System.out.println("Enter critic 3 rating:");
        float critic3 = scanner.nextFloat();

        CricketRating player1 = new CricketRating(playerName, critic1, critic2, critic3);
        player1.calculateAverageRating();

        try {
            player1.calculateCoins();
        } catch (NotEligibleException e) {
            System.out.println( e.getMessage());
            return;
        }

        player1.display();

	}

}
