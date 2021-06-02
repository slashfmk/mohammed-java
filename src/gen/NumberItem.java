package gen;

import banking.store.Item;

public class NumberItem <I extends Number, S extends Item> {

    private I number;
    private S name;

    public NumberItem(I n, S str){
            this.number = n;
            this.name = str;
    }

    public I getI(){
        return this.number;
    }

    public S getS(){
        return this.name;
    }

    public void setNumber(I n){
        this.number = n;
    }

//    public <I , S> getBoth(){
//        return
//    }
}
