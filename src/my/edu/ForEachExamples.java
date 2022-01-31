package my.edu;

import java.util.ArrayList;

public class ForEachExamples {

    public static void main(String[] args) {
        // for-each examples

//        String [] animals = {"cat", "dog", "rat", "bird"};

        ArrayList<String> animals = new ArrayList<>();
        animals.add("cat");
        animals.add("dog");
        animals.add("rat");
        animals.add("bird");

        for(String i : animals){
            System.out.println(i);
        }




    }

}
