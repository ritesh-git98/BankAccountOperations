package com.hackercode.UserDefinedException;

public class InsufficientFundsException extends Exception{
    private double balance;
    public InsufficientFundsException(double balance){
        this.balance=balance;
    }


    public double getAmount() {
        return balance;
    }

}
