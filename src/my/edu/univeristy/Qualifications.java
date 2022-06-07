package my.edu.univeristy;

import java.util.Scanner;

public class Qualifications {

    public static void main(String [] args){

        double score = 0;
        String result = "Desconocido";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Proporciona un valor entre 0 y 10:");
        score = Double.parseDouble(scanner.nextLine());

        if(score >= 9 && score <= 10){
            result = "A";
        }
        else if(score >= 8 && score < 9){
            result = "B";
        }
        else if(score >= 7 && score < 8){
            result = "C";
        }
        else if(score >= 6 && score < 7){
            result = "D";
        }
        else if(score >= 0 && score < 6){
            result = "F";
        }
        else{
            result = "Valor desconocido";
        }
        System.out.println("result = " + result);

    }
}
