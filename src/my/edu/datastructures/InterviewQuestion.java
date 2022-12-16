package my.edu.datastructures;

import java.util.HashMap;

public class InterviewQuestion {

    public static void main (String args[]){
        int [] array1 = {2, 4 , 5};
        int [] array2 = {1, 3 , 5};

        System.out.println("Result -> duplicateValue:  " + duplicateValue(array1, array2));
        System.out.println("Result ->  itemInCommon: " + itemInCommon(array1, array2));

    }

    public static boolean duplicateValue(int [] array1, int [] array2){
        int steps = 0;
        for(int i = 0; i < array1.length; i++){
            steps++;
            for(int j = 0; j < array2.length; j++){
                steps++;
                if(array1[i] == array2[j]){
                    System.out.println("Duplicate Value: " + array1[i] + ", Steps: " + steps);
                    return true;
                }
            }
        }
        System.out.println("Steps: " + steps);
        return false;
    }

     public static boolean itemInCommon(int [] array1, int [] array2){
        int steps = 0;
        HashMap<Integer, Boolean> hashTable = new HashMap<>();
        for(int i = 0; i < array1.length; i++){
            hashTable.put(array1[i], true);
        }

        for(int j : array2){
            if(hashTable.get(j) != null){
                return true;
            }
        }
        System.out.println("Steps: " + steps);
        return false;
    }



}
