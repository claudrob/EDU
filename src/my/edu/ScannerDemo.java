package my.edu;

import java.util.Scanner;

public class ScannerDemo {

    public static void main(String [] args){
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter two whole numbers");
        System.out.println("seperated by one or more spaces");

        int x = 0;
        int y = 0;
        x = keyboard.nextInt();
        y = keyboard.nextInt();

        System.out.println("You entered " + x + " and " + y);

        System.out.println("Next enter two numbers. ");

        System.out.println("A decimal point is OK ");


        double d1 = 0, d2 = 0;
        d1 =  keyboard.nextDouble();
        d2 =  keyboard.nextDouble();
        System.out.println("You entered " + d1 + " and " + d2);


        System.out.println("Enter two words: ");
        String s1, s2, s3;
        s1 = keyboard.next();
        s2 = keyboard.next();
        s3 = keyboard.nextLine();

        System.out.println("You entered \"" + s1 + "\" and \"" + s2 + "\"");

        System.out.print("Next enter a line of text: ");
        String s4;
        s4 = keyboard.nextLine();

        System.out.println("You entered \"" + s4 + "\"");



    }

}
