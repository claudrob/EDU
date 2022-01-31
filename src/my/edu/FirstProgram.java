package my.edu;

import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;


public class FirstProgram {

    public static void main(String[] args) {

        //
        /*

         */

        char theChar = 'A';


        int number = 100;
        double numberDouble = 100.01;
        String helloStr = "Hello out there";

        java.time.LocalDate now = java.time.LocalDate.now();

        // byte: -128 to 127
        byte theByte = 125;

        //-32,768 - 32,767
        short theShort = 32000;

        // -2,147,483,648 - 2,147,483,647
        int theInt = 2_000_000;

        //long
        long theLong = 7878383432L;

        float pi = 3.14F;

        double doublePI = 3.1415;

        boolean isAdult = true;

        System.out.println("Hello out there");

        System.out.println("CHar is = " + theChar);
        System.out.println("I will add two numbers for you.");
        System.out.println("Enter two whole two numbers on a line and hit enter.");


        int n1, n2;
        n1 = 11;
        n2 = 12;


        Scanner keyboard = new Scanner(System.in);
        n1 = keyboard.nextInt();
        n2 = keyboard.nextInt();

        System.out.println("The sum of the two numbers is = " + (n1 + n2) );

        System.out.println("What is your name?");

        Scanner scanner = new Scanner(System.in);
        String nameInput = scanner.nextLine();

        System.out.println("Hello: " + nameInput);


        System.out.println("Print variables:");
        System.out.println("theBye = " + theByte);
        System.out.println("theInt = " + theInt) ;
        System.out.println("theLong = " + theLong);
        System.out.println("PI = " + pi);
        System.out.println("double PI = " + doublePI);

        // Reference Types
        String name = new String("Claud");
        int age = 48;

        System.out.println("Name: " + name);
        System.out.println("Name: Uppercase " + name.toUpperCase());
        System.out.println("Name: Lowercase " + name.toLowerCase());
        System.out.println("name char at 2: " + name.charAt(2));
        System.out.println("name contains at \"a\": " + name.contains("a"));

        System.out.println("Month: " + now.getMonth());

        int a = 10;
        int b = a;
        a = 100;

        System.out.println("a = " + a + " -> b = " + b);

        Person alex = new Person("Alex");
        Person mariam = alex;

        System.out.println("Before changing alex");
        System.out.println("Alex = " + alex.name + ", mariam = " + mariam.name);

        //alex.name = "Alexander";
        mariam.name = "mariam";

        System.out.println("After changing mariam");
        System.out.println("Alex = " + alex.name + ", mariam = " + mariam.name);



    }

    static class Person {
        String name;

        Person(String name){
            this.name = name;
        }
    }


}
