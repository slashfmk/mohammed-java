package com.cs;

import java.util.Random;

public class Wallet {
    public int cardNumber;
    public String color;
    public String type;
    public int money;

    public Wallet(int cardNumber, String color, String type) {
        Random random = new Random();

        this.cardNumber = cardNumber;


    }

}
