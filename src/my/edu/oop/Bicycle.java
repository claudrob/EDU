package my.edu.oop;

public class Bicycle extends Vehicle{

    int wheels = 2;
    int pedals = 2;

    @Override
    void goFast() {
        System.out.println("Bicycle going at high speed.");
    }

    @Override
    public void go(){
        System.out.println("*The bicycle begins moving *");
    }
}
