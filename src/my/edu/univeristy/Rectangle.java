package my.edu.univeristy;

import java.util.Scanner;

public class Rectangle {

    public static void main(String[] args) {

        int alto = 0;
        int ancho = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Proporciona el alto:");
        alto = Integer.parseInt(scanner.nextLine());

        System.out.println("Proporciona el ancho:");
        ancho = Integer.parseInt(scanner.nextLine());

        int area = alto * ancho;
        int perimetro = (alto + ancho) *2;

        System.out.println("Area: " + area);
        System.out.println("Perimetro: " + perimetro);


    }

}
