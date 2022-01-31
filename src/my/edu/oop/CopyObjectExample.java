package my.edu.oop;

import my.edu.oop.Car;

public class CopyObjectExample {
    public static void main(String[] args) {

        Car car = new Car("Chevrolet", "Comaro",  2021);

        System.out.println("Creating car: ");
        printCarDetails(car);

        System.out.println("Setting variables");

        Car car2 = new Car();
        car2.setYear(2002);
        car2.setMake("Honda");
        car2.setModel("Accord");
        printCarDetails(car2);

        System.out.println("Copy car to car2");
        car2.copy(car);
        printCarDetails(car2);

        System.out.println("Using the copy constructor");
        Car car3 = new Car(car);
        printCarDetails(car3);




    }

    private static void printCarDetails(Car car) {

        System.out.println(car);
        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());
    }
}
