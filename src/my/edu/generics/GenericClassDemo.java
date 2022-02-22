package my.edu.generics;

import java.util.ArrayList;
import java.util.HashMap;

public class GenericClassDemo {

    public static void main(String[] args) {
        MyIntegerClass myInt = new MyIntegerClass(1);
        MyDoubleClass myDouble = new MyDoubleClass(3.14);
        MyCharacterClass myChar = new MyCharacterClass('@');
        MyStringClass myString = new MyStringClass("Hello");

        System.out.println(myInt.getValue());
        System.out.println(myDouble.getValue());
        System.out.println(myChar.getValue());
        System.out.println(myString.getValue());

        MyGenericClass <Integer, Integer> myInt2 = new MyGenericClass(1, 9);
        MyGenericClass <Double, Double> myDouble2 = new MyGenericClass(3.14, 1.01);
//        MyGenericClass <Character, Character> myChar2 = new MyGenericClass('@', '$');
//        MyGenericClass <String, Character> myString2 = new MyGenericClass("Hello", '!');

        System.out.println("===============================");

        ArrayList<String> myFriends = new ArrayList<>();
//        HashMap<Integer, String>

        System.out.println(myInt2.getValue());
        System.out.println(myDouble2.getValue());
//        System.out.println(myChar2.getValue());
//        System.out.println(myString2.getValue());

    }


}
