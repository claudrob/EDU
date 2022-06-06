package my.edu.univeristy;

import java.util.Scanner;

public class PrimitivesTypesDemo {

    public static void main(String[] args) {
        //Convert String types to int.

        var age = Integer.parseInt("20");
//        var age = "20";
        System.out.println("Age: " + (age + 1));

        var valuePI = Double.parseDouble(("3.1416"));
        System.out.println("valuePI: " + valuePI);

        var console = new Scanner(System.in);
        System.out.println("Enter your age: ");
        age  = Integer.parseInt(console.nextLine());

        System.out.println("Age: " + (age + 1));
    }

}
