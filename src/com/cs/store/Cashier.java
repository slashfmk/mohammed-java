package com.cs.store;

import com.cs.interfaces.IPay;

import java.util.*;

public class Cashier {
    private int Id;
    private int proccessedTransaction;

    public Cashier() {
        Random random = new Random();
        this.Id = random.nextInt(9000) + 1000;
    }

    public void Charge(IPay card, Cart cart) {
        if (card.spend(cart.total())) {
            System.out.println("The transaction of $" + cart.total() + " was successful to the card with id #: " + card.getNumber() + " of type " + card.getType());
            this.proccessedTransaction++;
            cart.clear();
        } else {
            System.out.println("The transaction of $" + cart.total() + " failed to the card with id #: " + card.getNumber() + " of type " + card.getType());
        }
    }

    public void getFullInfos() {
        System.out.println("Cashier: " + this.Id + " | Processed transactions: " + this.proccessedTransaction);
    }

}
