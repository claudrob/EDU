package my.edu.oop;

public class Boat extends Vehicle{


    @Override
    public void go(){
        System.out.println("*The boat begins moving *");
    }

    void stop(){
        System.out.println("This vehicle stopped");
    }

     void  goFast(){
        System.out.println("Boat is going fast");
    }
}
