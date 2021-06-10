package gen;
import banking.store.Item;

public class NumberItem <I extends Number, S extends Item> {

    private I i;
    private S s;

    public NumberItem(I n, S str){
            this.i = n;
            this.s = str;
    }

    public I getI(){
        return this.i;
    }

    public S getS(){
        return this.s;
    }

    public void setI(I n){
        this.i = n;
    }

//    public <I , S> getBoth(){
//        return
//    }
}
