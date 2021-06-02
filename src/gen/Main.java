package gen;
import banking.payment.*;
import banking.store.Item;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        NumberItem<Integer, Item> x = new NumberItem<>(4, new Item("Sugar", 34));
        NumberItem<Integer, Item> y = new NumberItem<>(2, new Item("Milk", 67));


        Cart cart = new Cart();

        cart.add(x);
        cart.add(y);

        System.out.println(cart.getTotal());


        //x.getS().getStatus();



    }

}
