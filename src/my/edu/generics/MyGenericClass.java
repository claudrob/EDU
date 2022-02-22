package my.edu.generics;

public class MyGenericClass <Thing extends Number, Thing2 extends Number>{

    Thing x;
    Thing2 y;

    public MyGenericClass(Thing x, Thing2 y){
        this.x = x;
        this.y = y;
    }

    public Thing2 getValue(){
        return y;
    }

}
