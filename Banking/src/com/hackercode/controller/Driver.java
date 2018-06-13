package com.hackercode.controller;
import com.hackercode.utilities.CheckingAccount;
import com.hackercode.UserDefinedException.InsufficientFundsException;



public class Driver {
    public static void main(String args[]) {
        CheckingAccount c = new CheckingAccount(101);
        System.out.println("Depositing Rs 5000");
        c.Deposit(5000);
        try {
            System.out.println("Withdrawing Rs.1000");
            c.withdraw(1000);
            System.out.println("Withdrawing Rs.5000");
            c.withdraw(5000);

        } catch (InsufficientFundsException e) {
            System.out.println("Sorry Insufficient Balance, You are short of :Rs." + e.getAmount());
        }
        }
}
