package com.cs.store;

import java.util.ArrayList;

public class Cart {

    private ArrayList<Item> items;

    public Cart() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public double total() {
        double totalPrice = 0;

        for (Item i : this.items) {
            totalPrice += i.getPrice();
        }

        return totalPrice;
    }

    public void getDetails (){
        for (Item i : this.items) {
            System.out.println(i.getName()+" : "+i.getPrice());
        }
        System.out.println("Total price: "+this.total());
    }

    public void clear(){
        this.items.clear();
    }

}
