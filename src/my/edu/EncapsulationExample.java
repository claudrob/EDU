package my.edu;

import my.edu.oop.Car;

public class EncapsulationExample {
    public static void main(String[] args) {
        Car car = new Car("Chevrolet", "Comaro",  2021);

        System.out.println("Creating car: ");
        printCarDetails(car);

        System.out.println("Setting variables");

        car.setYear(2002);
        car.setMake("Honda");
        car.setModel("Accord");

        printCarDetails(car);


    }

    private static void printCarDetails(Car car) {
        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());
    }
}
