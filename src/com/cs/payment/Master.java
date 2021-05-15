package com.cs.payment;

import com.cs.payment.Card;

public class Master extends Card {

    public Master(String name){
        super(name, "Master");
    }

    public void slogan(){
        System.out.println("Master is the best of bests ");
    }
}
