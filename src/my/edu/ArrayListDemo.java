package my.edu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {

        String [] nums = {"one", "two", "three"};

        List <String> myList = Arrays.asList(nums);

        ArrayList <String> words = new ArrayList<String>(myList);

        System.out.println("Print myList");
        for(String s : myList){
            System.out.println(s);
        }

        System.out.println("Print words");
        for(String s : words){
            System.out.println(s);
        }



    }

}
