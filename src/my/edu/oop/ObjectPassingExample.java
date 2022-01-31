package my.edu.oop;

public class ObjectPassingExample {

    public static void main(String[] args) {
        Garage garage = new Garage();

        Car car = new Car("Honda");
        Car car1 = new Car("BMW");

        garage.park(car);
        garage.park(car1);

    }

}
