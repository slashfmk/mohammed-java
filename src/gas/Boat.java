package gas;

import java.text.DecimalFormat;

public class Boat implements IFuelTank {

    private int gasLevel;
    private int gazLimit;
    private String name;
    private int ratio;

    public Boat(String name){
        this.name = name;
        this.gasLevel = 0;
        this.gazLimit = 300;
        this.ratio = 60;
        }

        public int getGasLevel() {
            return gasLevel;
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


    public void fuelTank(int gallons) {
        if (this.gasLevel + gallons >= gazLimit) {
            System.out.println("This too much for your vehicle! You have enough gas");
        } else {
            this.gasLevel += gallons;
            System.out.println("This "+gallons+" has been added successfully!");
        }
    }

    public String toString () {
        return "Boat name "+this.name+" | gas level "+this.gasLevel;
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

}
