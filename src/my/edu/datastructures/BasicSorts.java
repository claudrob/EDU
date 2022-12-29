package my.edu.datastructures;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BasicSorts {


    public static void main(String [] args){
        int [] unSorted = {4, 2, 6, 5, 1, 3};
        System.out.println("Print array BEFORE sorting!");
        System.out.println(Arrays.toString(unSorted));

//        bubbleSort(unSorted);
//        selectionSort(unSorted);
        insertionSort(unSorted);

        System.out.println("Print array AFTER sorting!");
        System.out.println(Arrays.toString(unSorted));
//        printArray(unSorted);

    }


    public static void insertionSort(int [] array){
        for(int i = 1; i < array.length; i++){
            int temp = array[i];
            int j = i - 1;
            while (j > -1 && temp < array[j]){
                array[j + 1] = array[j];
                array[j] = temp;
                j--;
            }
        }

    }



    public static void selectionSort(int [] array){

        for(int i = 0; i < array.length; i++){

            int minIndex = i;

            for(int j = i + 1; j < array.length; j++) {

                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            if(i != minIndex){
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }

    }


    public static void bubbleSort(int [] array){
        for(int i = array.length - 1; i > 0; i--){
            for (int j = 0; j < i; j++){
                if(array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                }

            }

        }

    }


    public static void printArray(int[] array){
        System.out.println("Printing out Array");
        for(int x : array)
            System.out.println(x);
    }



}
