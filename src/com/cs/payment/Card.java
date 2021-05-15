package com.cs.payment;

import com.cs.interfaces.IPay;

import java.util.*;

public abstract class Card implements IPay {

    // attributes
    protected int number;
    protected String name;
    protected int exp_year;
    protected int cvv;
    protected int password;
    protected String type;
    protected Random random;
    protected double balance;

    protected Scanner scanner;

    // constructor
    public Card(String name, String type) {
        this.random = new Random();
        this.name = name;
        this.exp_year = random.nextInt(3000) + 2000;
        this.cvv = random.nextInt(999) + 100;
        this.password = 0;
        this.balance = 0;
        this.number = this.random.nextInt(999999999) + 123344445;
        this.type = type;
        this.scanner = new Scanner(System.in);
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void spend(double amount) {
        int userPwd;
        System.out.println("Please enter your password ");
        userPwd = scanner.nextInt();

        if (this.checkPassword(userPwd)) {

            if (this.balance >= amount) {
                this.balance -= amount;
            } else {
                System.out.println("You don't have enough money");
            }
        } else {
            System.out.println("Wrong password entered!!!!");
        }

    }

    public boolean changePassword() {
        int userCurrentPwd;
        boolean success = false;

        System.out.println("Please enter your current password ");
        userCurrentPwd = this.scanner.nextInt();


        if (this.checkPassword(userCurrentPwd)) {
            System.out.println("Please enter your new password ");
            int userNewPwd = this.scanner.nextInt();
            if (userNewPwd <= 9999 && userNewPwd >= 1000) {
                this.password = userNewPwd;
                success = true;
            } else {
                System.out.println("Password must range between 1000 and 9999");
            }
        } else {
            System.out.println("Wrong current password");
        }

        return success;
    }

    protected boolean checkPassword(int pwd) {
        return this.password == pwd;
    }

    public abstract void slogan();

    public void getStatus() {
        System.out.println("Name: " + this.name + " | Balance: " + this.balance + " | #: " + this.number + " | " + this.type);
    }


}
