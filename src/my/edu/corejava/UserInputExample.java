package my.edu.corejava;

import java.util.Scanner;


public class UserInputExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scanner.nextLine();

        System.out.println("Hi there " + name + "!");


        System.out.println("How old are you?");
        int age = scanner.nextInt();
        System.out.println(name + ", you are " + age + " years old.");
        scanner.nextLine();

        System.out.println("What is your favorite food");
        String food = scanner.nextLine();
        System.out.println("You love \"" + food + "\"");

    }


}
