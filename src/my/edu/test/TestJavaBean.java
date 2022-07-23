package my.edu.test;

import my.edu.univeristy.Persona;

public class TestJavaBean {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setSurname("Robinson");
        persona.setName("Claud");
        System.out.println(persona);
        System.out.println("Persona Name: " + persona.getName());
        System.out.println("Persona Surname: " + persona.getSurname());
    }
}
