package my.edu.univeristy;

public class TestPerson {

    public static void main(String[] args) {
        Persona p1 = new Persona();
        p1.name = "Claud";
        p1.surname = "Robinson";
        p1.displayDetails();
        Persona p2 = new Persona();
        System.out.println(p1);
        System.out.println(p2);

        p2.displayDetails();
        p2.name = "Juan";
        p2.surname = "Perez";

        p2.displayDetails();
    }

}
