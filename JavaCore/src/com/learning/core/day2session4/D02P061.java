package com.learning.core.day2session4;

import java.util.Scanner;

public class D02P061 {

	public D02P061() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter account number:");
        int accNo = scanner.nextInt();
        scanner.nextLine(); 
        System.out.println("Enter customer name:");
        String custName = scanner.nextLine();
        System.out.println("Enter account type (Saving/Current):");
        String accType = scanner.nextLine();
        System.out.println("Enter initial balance:");
        float initialBalance = scanner.nextFloat();

        try {
            BankAccount account = new BankAccount(accNo, custName, accType, initialBalance);
            System.out.println("Account created successfully!");

            System.out.println("Enter amount to deposit:");
            float depositAmt = scanner.nextFloat();
            account.deposit(depositAmt);

            float balance = account.getBalance();
            System.out.println("Current balance: " + balance);
        } catch (LowBalanceException e) {
            System.out.println( e.getMessage());
        } catch (NegativeAmountException e) {
            System.out.println( e.getMessage());
        }
        
	}

}
