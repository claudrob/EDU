package my.edu.oop;

public class Car extends  Vehicle{

    int wheels = 4;
    int doors = 4;

    String name;
    private String make = "Chevrolet";
    private String model = "Corvette";
    private int year = 2020;
    String color = "red";
    double price = 50_000.00;

    Car(){
        this.name = "Honda";
    }


    Car(String name){
        this.name = name;
    }

    public Car(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public Car(Car car){
        this.copy(car);

    }

    public void drive(){
        System.out.println("You are driving the car");
    }

    public void brake(){
        System.out.println("You stepped on the breaks");

    }

    @Override
//    public String toString() {
//        return "Car{" +
//                "make='" + make + '\'' +
//                ", model='" + model + '\'' +
//                ", year=" + year +
//                ", color='" + color + '\'' +
//                ", price=" + price +
//                '}';
//    }

//    @Override
    public void goFast(){
        System.out.println("Fast car ...");
    }

    public String getModel(){return this.model;}

    public String getMake(){return this.make;}

    public int getYear(){return this.year;}


    public void setYear(int year) {
        this.year = year;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void copy(Car x){
        this.setModel(x.getModel());
        this.setMake(x.getMake());
        this.setYear(x.getYear());

    }

    @Override
    public void go(){
        System.out.println("*The car begins moving *");
    }

}
