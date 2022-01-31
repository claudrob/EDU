package my.edu.oop;

public abstract class Vehicle {

    double speed;

    void go(){
        System.out.println("This vehicle is moving");
    }

    void stop(){
        System.out.println("This vehicle stopped");
    }

    abstract void  goFast();



}
