package my.edu.test;

import my.edu.univeristy.GenericClass;

public class TestGenerics {

    public static void main(String[] args) {
        GenericClass<Integer> genericClass = new GenericClass<Integer>(15);
         genericClass.getType();

         GenericClass<String> genericClass2 = new GenericClass<String>("Hello!!");
         genericClass2.getType();




    }

}
