package com.cs.payment;

import com.cs.interfaces.IPay;

public class BankCheck implements IPay {

    private double balance;

    public BankCheck(){
        this.balance = 1000;
    }

    public void spend(double amount){
        this.balance -= amount;
    }

    public void getCheckStatus(){
        System.out.println("The amount available is "+this.balance);
    }
}
