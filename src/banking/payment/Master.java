package banking.payment;

public class Master extends Card {

    public static int masterCount = 0;

    public Master(String name)
    {
        super(name, "Master");
        masterCount++;
    }

    public void slogan(){
        System.out.println("Master is the best of bests ");
    }
}
