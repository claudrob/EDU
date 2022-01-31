package my.edu;

import java.util.Arrays;
import java.util.Locale;

public class MethodExamples {

    public static void main (String [] args){
        // Methods

        System.out.println("Testing method!");

        String brand = "Samsung";
        System.out.println(brand.toUpperCase());
        boolean startsWithS = brand.startsWith("S");
        System.out.println(brand.startsWith("S"));

        char [] letters = {'A', 'A', 'B', 'C', 'D', 'D', 'D'};

        int count = countOccurrences(letters, 'D');
        System.out.println("Letter A = " + count);




    }

    public static int countOccurrences(char [] myLetters, char searchLetter){
        System.out.println("Method countOccurrences was invoked ");
        System.out.println(Arrays.toString(myLetters));
        System.out.println(searchLetter);
        int count = 0;

        for(char c : myLetters){
            if(c == searchLetter){
                count++;
            }
        }


        return count;
    }

}
