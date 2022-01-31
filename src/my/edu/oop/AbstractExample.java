package my.edu.oop;

public class AbstractExample {

    public static void main(String[] args) {

//        Vehicle vehicle = new Vehicle();
        Vehicle vehicle1 = new Car();
        Car car = new Car();

        System.out.println(vehicle1);
        System.out.println(car);
        car.goFast();

    }

}
