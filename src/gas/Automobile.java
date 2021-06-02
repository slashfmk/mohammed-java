package gas;

import java.text.DecimalFormat;

public abstract class Automobile implements IFuelTank {

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


    public boolean isTankEmpty() {
        return this.gasLevel <= 0;
    }


    public double getGallonsFromMiles (int miles){

        DecimalFormat df = new DecimalFormat("#.##");

        double r = (double) 1 / this.ratio;
        double result = (double) (miles * r * this.gazLimit / 100);

        return Double.parseDouble(df.format(result)) ;
    }

    public void run(int miles) {
        if(this.isTankEmpty()){
            System.out.println("no gaz in th tank, no way to drive!");
        } else {
                if(this.getGallonsFromMiles(miles) < this.gasLevel){
                    System.out.println("Trip has started");
                    this.gasLevel -= this.getGallonsFromMiles(miles);
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
