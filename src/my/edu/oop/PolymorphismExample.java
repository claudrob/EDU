package my.edu.oop;

import my.edu.oop.package1.B;

public class PolymorphismExample {

    public static void main(String[] args) {
        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        Boat boat = new Boat();

        Vehicle [] racers = {car, bicycle, boat};

        for(Vehicle x : racers){
            x.go();
        }

    }

}
