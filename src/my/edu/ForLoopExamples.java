package my.edu;

import java.util.Arrays;
import java.util.Scanner;

public class ForLoopExamples<members> {

    public static void main(String args []){

//        example1();
//        example2();
        exampleNestedLoop();
    }

    private static void exampleNestedLoop(){
        Scanner scanner = new Scanner(System.in);
        int rows = 0;
        int columns = 0;
        String symbol = "";

        System.out.println("Enter # of rows");
        rows = scanner.nextInt();
        System.out.println("Enter # of columns");
        columns = scanner.nextInt();
        System.out.println("Enter the symbol to use:");
        symbol = scanner.next();

        for (int i = 1; i <= rows; i++){
            System.out.println();
            for (int j = 1; j <= columns; j++){
                System.out.print(symbol);
            }

        }

    }

    private static void example2() {
        //for loop
        for(int i = 0; i <= 10; i++){

            System.out.println(("i = " + i));

        }
        System.out.println("Happy Loop!");


    }

    private static void example1() {
        // for loops
        int [] numbers3 = {2, 0, 1, 4, 100, 4, 90, 78, 77};

        System.out.println("Enhanced For Loop");
        for(int number : numbers3){
            System.out.println(number);
        }

        System.out.println("Legacy for loop");

        for(int x = 0; x < numbers3.length; x++){
            System.out.println(numbers3[x]);
        }

        String [] members = {"Bob", "Anna" , "Ali"};


        for (int i = 0; i < numbers3.length; i++) {

        }


        Arrays.stream(numbers3).forEach(System.out::println);
        Arrays.stream(members).forEach(System.out::println);

        for(String str : members){
            if(str.equals("Anna"))
                continue;

            System.out.println(str);
        }
    }


}
