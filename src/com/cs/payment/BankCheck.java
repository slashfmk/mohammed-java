package com.cs.payment;
import com.cs.interfaces.IPay;

import java.util.Random;

public class BankCheck implements IPay {

    private double balance;

    public BankCheck(){
        this.balance = 1000;
    }

    public boolean spend(double amount){

        boolean success = false;

       if(this.balance > amount) {
           this.balance -= amount;
           success = true;
       }

       return success;
    }

    @Override
    public int getNumber() {
        Random rand = new Random();
        return rand.nextInt(999999) + 340000;
    }

    @Override
    public String getType() {
        return "Bank Check";
    }

    public void getCheckStatus(){
        System.out.println("The amount available is "+this.balance);
    }
}
