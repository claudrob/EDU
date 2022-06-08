package my.edu.oop;

import my.edu.univeristy.Persona;

public class PassByReferenceDemo {

    public static void main(String[] args) {
        Persona p1 = new Persona();
        p1.name = "Claud";
        p1.surname = "Robinson";
        System.out.println("p1 = " + p1.name);
        System.out.println("p1 = " + p1.surname);

        Persona p2 = changeValue(p1);
        Persona p3 = changeValue(null);


        System.out.println("p1 = " + p1.name);
        System.out.println("p1 = " + p1.surname);

        System.out.println(("Persona 2"));
        System.out.println("p1 = " + p2.name);
        System.out.println("p1 = " + p2.surname);


    }

    public static Persona changeValue(Persona persona){
        System.out.println("changeValue: ");
        if(persona == null){
            System.out.println("Persona == null");
            return null;
        }
        persona.name = "Juan";
        persona.surname = "Perez";
        System.out.println("persona = " + persona.name);
        System.out.println("persona = " + persona.surname);
        return persona;

    }


}
