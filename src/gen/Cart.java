package gen;

import java.util.ArrayList;

public class Cart {

    private ArrayList<NumberItem> items;

    public Cart(){
        this.items = new ArrayList<>();
    }

    public void add(NumberItem i){
        this.items.add(i);
    }

    public double getTotal(){
        double sum = 0;

        for(NumberItem x: this.items){
            sum +=  x.getI().intValue() * (int) x.getS().getPrice();
        }

        return sum;
    }
}
