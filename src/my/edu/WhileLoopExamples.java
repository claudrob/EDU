package my.edu;

import java.util.Scanner;

public class WhileLoopExamples {

    public static void main(String []args){

        example1();
        example2();

    }

    private static void example2(){
        Scanner scanner = new Scanner(System.in);
        String name = "";

        while(name.isEmpty()){
            System.out.println("Enter you name: ");
            name = scanner.nextLine();
        }

        while(name.isEmpty()){
            System.out.println("Enter you name: ");
            name = scanner.nextLine();
        }


        System.out.println("Hello " +  name);
    }

    private static void example1() {
        //While
        int x = 0;

        while(x <= 10){
            System.out.println("Hello: " + (x++));
        }

        int count =21;
        do {
            System.out.println("Do while: " + (count++));
        }
        while (count <= 20);
    }


}
