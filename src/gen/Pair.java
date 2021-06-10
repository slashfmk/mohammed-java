package gen;

import banking.payment.Card;

import java.util.*;

public class Pair <T> {

    private ArrayList <T> t;

    public Pair(){
        this.t = new ArrayList<T>();
    }


//    public T getT() {
//        return t;
//    }
//
//    public void setT(T t) {
//        this.t = t;
//    }

    public void add(T x){
        this.t.add(x);
    }

    public void show(){
        for(T z: this.t){
            System.out.println(z.toString());
        }
    }
}
