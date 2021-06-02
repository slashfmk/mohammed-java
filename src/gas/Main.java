package gas;

public class Main {

    public static void main(String[] args) {

        Cars car = new Cars("Blue", "Toyota");
        Boat boat = new Boat("Titanic");


       // System.out.println(car.getGallonsFromMiles(300));
        //car.run(34);
        Pump pump1 = new Pump(1000);
        pump1.fuelEngine(boat,14);
        boat.run(34);
        //pump1.fuelEngine(car,14);

        System.out.println(boat.toString());
        //car.run(50);
//        System.out.println(car.toString());
//        car.run(57);
//        System.out.println(car.toString());
//        //System.out.println(car.getGallonsFromMiles(34));




    }
}
