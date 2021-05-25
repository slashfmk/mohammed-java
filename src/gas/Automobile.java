package gas;

public abstract class Automobile {

    protected String color;
    protected String make;
    protected String type;
    protected int gasLevel;
    protected int gazLimit;
    protected int ratio;

    public Automobile(String color, String make, String type, int gasLevel, int gazLimit, int ratio) {
        this.color = color;
        this.make = make;
        this.type = type;
        this.gasLevel = gasLevel;
        this.gazLimit = gazLimit;
        this.ratio = ratio;
    }

    public int getGasLevel() {
        return gasLevel;
    }

    public void setGasLevel(int gasLevel) {
        this.gasLevel = gasLevel;
    }

    public boolean isTankEmpty() {
        return this.gasLevel <= 0;
    }

    protected boolean iSEnoughGaz(int miles){
        int result  = this.ratio * miles;
        return result < this.gasLevel;
    }

    public void run(int miles) {
        if(this.isTankEmpty()){
            System.out.println("no gaz in th tank, no way to drive!");
        } else {
            if(this.iSEnoughGaz(miles)){
                System.out.println("Trip has started");
            } else {
                System.out.println("Your tank is not empty, but doesn't have enough gaz");
            }
        }
    }

    public void fuelTank(int gallons) {
        if (this.gasLevel + gallons >= gazLimit) {
            System.out.println("This too much for your vehicle! You have enough gas");
        } else {
            this.gasLevel += gallons;
            System.out.println("This "+gallons+" has been added successfully!");
        }
    }

    public String toString() {
        return "Make: "+this.make+" | Color: "+this.color+" | Type: "+this.type+" | GasLimit: "+this.gazLimit+" | GasLevel: "+this.gasLevel;
    }


}
