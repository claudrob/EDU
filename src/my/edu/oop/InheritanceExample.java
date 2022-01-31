package my.edu.oop;

public class InheritanceExample {
    public static void main(String[] args) {

        System.out.println("Car class");
        Car car = new Car();

        car.go();

        car.stop();
        System.out.println(car.speed);
        System.out.println(car.doors);

        System.out.println("Bicycle: ");
        Bicycle bike = new Bicycle();
        bike.go();
        bike.stop();
        System.out.println(bike.speed);
        System.out.println(bike.pedals);


    }

}
