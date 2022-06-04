package my.edu.univeristy;

import java.util.Scanner;

public class ScannerDemo {

    public static void main(String[] args) {
        System.out.println("Enter your name: ");
        Scanner scanner = new Scanner(System.in);

        var user = scanner.nextLine();
        System.out.println("Hello " + user);

        var title = scanner.nextLine();
        System.out.println("Result: " + title + " " + user);
    }


}
