package my.edu.test;

import my.edu.univeristy.Client;
import my.edu.univeristy.Teacher;

import java.util.Date;

public class InheritanceTest {

    public static void main(String[] args) {
        Teacher teacher = new Teacher("Claud Robinson", 5000.0);
        System.out.println("teacher = " + teacher);

        Client client = new Client("Claud", 'M', 49, "Alanna Laurel 12", new Date(), false);
        System.out.println("client = " + client);
    }

}
