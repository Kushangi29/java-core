package com.learning.core.day2session4;

public class BankAccount {
	
	private int accNo;
    private String custName;
    private String accType;
    private float balance;

    public BankAccount(int accNo, String custName, String accType, float initialBalance) throws LowBalanceException, NegativeAmountException {
        this.accNo = accNo;
        this.custName = custName;
        this.accType = accType;
        

        if (accType.equals("Saving") && initialBalance < 1000) {
            throw new LowBalanceException("Low Balance");
        } else if (accType.equals("Current") && initialBalance < 5000) {
            throw new LowBalanceException("Low Balance");
        }

        if (initialBalance < 0) {
            throw new NegativeAmountException("Negative Amount");
        }

        
    }

    public void deposit(float amt) throws NegativeAmountException {
        if (amt < 0) {
            throw new NegativeAmountException("Negative Amount");
        }
        balance += amt;
    }

    public float getBalance() throws LowBalanceException {
        if (balance < 1000 && accType.equals("Saving")) {
            throw new LowBalanceException("Low Balance");
        } else if (balance < 5000 && accType.equals("Current")) {
            throw new LowBalanceException("Low Balance");
        }
        return balance;
    }

}
