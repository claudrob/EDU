package my.edu.univeristy;

public class GenericClass<T> {

    T object;

    public GenericClass(T object){
        this.object = object;
    }

    public void getType(){
        System.out.println("The type is: " + object.getClass().getSimpleName());
    }

}
