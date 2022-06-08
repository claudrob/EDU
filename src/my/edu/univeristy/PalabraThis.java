package my.edu.univeristy;

public class PalabraThis {

    public static void main(String[] args) {
        Human human = new Human("Claud", "Robinson");
        System.out.println(human);
        System.out.println("human = " + human.name);
        System.out.println("human = " + human.surname);

    }
}

class Human{
    String name;
    String surname;

    Human(String name, String surname){
        super();
        this.name = name;
        this.surname = surname;
        System.out.println("Constructor this: " + this);
        Printer printer = new Printer();
        printer.print(this);
    }
}

class Printer{

    public Printer(){
        super();
    }

    public void print(Human human){
        System.out.println("Printer: " + human);
        System.out.println("Printer: This Opbject: " + this);

    }
}