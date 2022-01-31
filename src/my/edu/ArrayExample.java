package my.edu;

import java.util.Arrays;

public class ArrayExample {
    public static void main(String args []){

//        example1();
//        example2();

//        example3();
//    example4();
    example5();

    }

    private static void example5(){
        // 2D array
        String [][] cars = {
                {"Camaro", "Corvette","Silverado"},
                {"Mustang", "Ranger", "F-150"},
                {"Ferrari", "Lambo", "Tesla" }
        };

        cars[0][0] = "Camaro";
        cars[0][1] = "Corvette";
        cars[0][2] = "Silverado";

        cars[1][0] = "Mustang";
        cars[1][1] = "Ranger";
        cars[1][2] = "F-150";


        cars[2][0] = "Ferrari";
        cars[2][1] = "Lambo";
        cars[2][2] = "Tesla";

        for (int i = 0; i < cars.length; i++){
            System.out.println();
            for(int j = 0; j < cars[i].length; j++){
                System.out.print(cars[i][j] + ", ");
            }

        }


    }

    private static void example4(){
        // 2D array
        String [][] cars = new String[3][3];

        cars[0][0] = "Camaro";
        cars[0][1] = "Corvette";
        cars[0][2] = "Silverado";

        cars[1][0] = "Mustang";
        cars[1][1] = "Ranger";
        cars[1][2] = "F-150";


        cars[2][0] = "Ferrari";
        cars[2][1] = "Lambo";
        cars[2][2] = "Tesla";

        for (int i = 0; i < cars.length; i++){
            System.out.println();
            for(int j = 0; j < cars[i].length; j++){
                System.out.print(cars[i][j] + ", ");
            }

        }


    }

    private static void example3(){
        String [] cars = new String[3];
        cars [0] = "Camaro";
        cars [1] = "Corvette";
        cars [2] = "Tesla";

        System.out.println(cars[0]);
        System.out.println(cars[1]);

        for (int i = 0; i < cars.length; i++){
            System.out.println(cars[i]);
        }
    }


    private static void example2(){
        //arrays
        String [] cars = {"Camaro", "Corvette", "Tesla", "BMW"};

        cars[0] = "Mustang";

        System.out.println(cars[3]);

    }

    private static void example1() {
        // Arrays
        int zero = 0;
        int one = 1;

        int [] numbers = new int[3];
        boolean [] bools = new boolean[10];
        String [] myStrings = new String[10];

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(bools));
        System.out.println(Arrays.toString(myStrings));

        numbers[0] = 2;
        numbers[1] = 5;
        numbers[2] = 7;


        System.out.println(Arrays.toString(numbers));

        int [] numbers2 = {12, 13, 14, 100, 25};
        System.out.println("Numbers1: " + Arrays.toString(numbers2));
        System.out.println("Numbers1 length: " + numbers2.length);

        String [] names = {"Ali, Maria"};
        System.out.println(Arrays.toString(names));
        System.out.println("names. length: " + names.length);


        int oneHundred = numbers2[numbers2.length - 1];
        System.out.println("Number 4: " + oneHundred);


        int [] numbers3 = {2, 0, 1, 4, 100, 4, 90, 78, 77};

        int x = 0;
        x++;
        x = x + 2;
        x--;
        x += 5;

        System.out.println("X = " + x);
    }


}
