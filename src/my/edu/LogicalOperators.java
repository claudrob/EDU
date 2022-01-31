package my.edu;

import java.util.Scanner;

public class LogicalOperators {

    public static void main(String [] args){
//        example1();
        example2();
        example3();
    }




    private static void example3(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("You are playing a game! Press q or Q to quit.");
        String response = scanner.next();
        if(!response.equals("q") && !response.equals("Q")){
            System.out.println("You are still playing the game!");
        }else
        {
            System.out.println("You quit the game");

        }


    }

    private static void example2(){
        // Logical ops
        // &&
        // OR
        // ! NOT

        int temp = 25;
        if(temp > 30){

            System.out.println("It is hot outside.");

        }else if(temp >= 20 && temp <= 30){

            System.out.println("It is warm outside");

        }else{
            System.out.println("It is cold outside.");
        }




    }

    private static void example1() {
        // Logical operators
        boolean isAdult = false;
        boolean isStudent = false;

        boolean isMember = true;

        System.out.println("isAdult && isStudent = " + ((!isAdult || isStudent) && !isMember));

        System.out.println("isAdult == true: " + (isAdult));

        String name = "Mark";
        System.out.println((10 > 8 || 2 <= 2) &&
                isAdult &&
                name.contains("M"));
    }

}
