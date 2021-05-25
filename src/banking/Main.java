package banking;

import banking.payment.*;
import banking.store.*;


public class Main {

    public static void main(String[] args) {
	// write your code here

        Visa mohammed = new Visa("mohammed mohammed");
        mohammed.deposit(120);
        BankCheck check = new BankCheck();
        Master jarvis = new Master("Jarvis");

        //items
        Item item1 = new Item("Sugar", 7);
        Item item2 = new Item("Flour", 9.5);
        Item item3 = new Item("Samsung TV 65inches 4k", 870);

        // cart
        Cart cart = new Cart();
        Cashier cashier = new Cashier();
        // charge
        cart.addItem(item1);
        cart.addItem(item2);
       // cart.addItem(item3);
        cart.getDetails();

        mohammed.getStatus();
        cashier.Charge(mohammed, cart);
        mohammed.getStatus();
        cashier.getFullInfos();

//        check.getCheckStatus();
//        cashier.Charge(check, cart);
//        check.getCheckStatus();

    }



    public static void getSlogan(Card c)
    {
        c.slogan();
    }
}
