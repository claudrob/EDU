package my.edu.codesignal;

public class CodeSignalExercise {


    public static void main(String [] args){
        int [] testData = {3, 6, -2, -5, 7, 3};
        int [] testData2 = {-23, 4, -3, 8, -12};
        System.out.println("testData = " + testData);

//        System.out.println("Test data 1: " + solution(testData));

        System.out.println("Test data 2: " + solution(testData2));

    }



    /*
    Given an array of integers, find the pair of adjacent elements that has the largest
    product and return that product.
        Example:
For inputArray = [3, 6, -2, -5, 7, 3], the output should be
solution(inputArray) = 21.
     */

    public static int  solution(int[] inputArray) {

        int product = Integer.MIN_VALUE;

        for(int i = 0; i < inputArray.length - 1; i++){

            int total = inputArray[i] * inputArray[i + 1];

            System.out.println(inputArray[i] + " * " + inputArray[i + 1] + " = " + total);

            if(total > product){
                product = total;
            }
        }

        return product;

    }

}
