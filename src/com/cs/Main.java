package com.cs;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int n = 4;

        Visa mohammed = new Visa("mohammed mohammed");

        Master jarvis = new Master("Jarvis");

        getInfo(mohammed);
        getInfo(jarvis);

      //  casher.paybill(mohammed);

       // Card yan = new Card("yannick", 555, "Master");

       // mohammed.getStatus();
       // mohammed.companyStatus();

//        mohammed.deposit(500.23);
//        mohammed.getStatus();
//        mohammed.changePassword();
//        mohammed.spend(200);
//        mohammed.getStatus();

      //  System.out.println(mohammed.type);

    }

    public static void getInfo(Card c){
        c.slogan();
    }
}
