package com.cs.payment;

import com.cs.payment.Card;

public class Visa extends Card {

    public Visa(String name){
        super(name, "visa");
    }

    public void slogan(){
        System.out.println("this is a great visa company");
    }
}
