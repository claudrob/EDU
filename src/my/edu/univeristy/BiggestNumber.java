package my.edu.univeristy;

import java.util.Scanner;

public class BiggestNumber {

    public static void main(String[] args) {
        int numero1 = 0;
        int numero2 = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Proporciona el numero1: ");
        numero1 = Integer.parseInt(scanner.nextLine());

        System.out.println("Proporciona el numero2: ");
        numero2 = Integer.parseInt(scanner.nextLine());

        if(numero1 > numero2){
            System.out.println("El numero mayor es: " + numero1);
        }else {
            System.out.println("El numero mayor es: " + numero2);

        }

    }

}
