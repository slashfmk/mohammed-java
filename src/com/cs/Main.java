package com.cs;

import com.cs.interfaces.IPay;
import com.cs.payment.BankCheck;
import com.cs.payment.Card;
import com.cs.payment.Master;
import com.cs.payment.Visa;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Visa mohammed = new Visa("mohammed mohammed");

        BankCheck check = new BankCheck();

        Master jarvis = new Master("Jarvis");

        mohammed.deposit(1200);
        jarvis.deposit(600);


        charge(jarvis, 230);
        charge(mohammed, 250);
        charge(check, 460);

        mohammed.getStatus();
        jarvis.getStatus();
        check.getCheckStatus();


    }

    public static void charge(IPay c, double amount){
        c.spend(amount);
    }

    public static void getInfo(Card c){
        c.slogan();
    }
}
