package gas;

import java.sql.SQLOutput;

public class Pump {

    private int availableGaz;

    public Pump(int gallons) {
        this.availableGaz = gallons;
    }

    public void fuelEngine(IFuelTank auto, int gallons) {
        if(this.availableGaz > gallons){
            auto.fuelTank(gallons);
            this.availableGaz -= gallons;
            System.out.println("We have pumped "+gallons+" into "+auto.toString());
            this.availableGas();

        } else {
            System.out.println("Not enough gaz to pump");
        }

    }
    private void availableGas(){
        System.out.println("We have "+this.availableGaz+" gallons in pump");
    }

}
