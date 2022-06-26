package my.edu.test;

import my.edu.univeristy.Persona;

public class ForEachTest {

    public static void main(String[] args) {
        int ages[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for(int age: ages){
            System.out.println("age = " + age);
        }


        Persona personas[] = {new Persona("Claud"), new Persona("Diana"), new Persona("Ethan"),
        new Persona("Liam"), new Persona("Jared")};

        for(Persona p: personas){
            System.out.println("p = " + p);
        }

    }
}
