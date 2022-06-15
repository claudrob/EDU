package my.edu.test;

import my.edu.univeristy.Persona;

public class KeyWordFinalTest {
    public static void main(String[] args) {

        final int myVar = 10;
        System.out.println("myVar = " + myVar);
//        myVar = 15;
        System.out.println("myVar = " + myVar);

        final Persona persona1 = new Persona();
//        persona1 = new Persona();

        persona1.setName("Diana");
        persona1.setSurname("Cruz");
        System.out.println("persona1 = " + persona1);
        persona1.setName("Claud");
        persona1.setSurname("Robinson");
        System.out.println("persona1 = " + persona1);


    }
}
