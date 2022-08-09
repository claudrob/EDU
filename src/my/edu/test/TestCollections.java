package my.edu.test;

import java.util.*;

public class TestCollections {

    public static void main(String[] args) {
        List myList = new ArrayList();
        myList.add("Monday");
        myList.add("Tuesday");
        myList.add("Wednesday");
        myList.add("Thursday");
        myList.add("Friday");
        myList.add("Saturday");
        myList.add("Saturday");
        myList.add("Sunday");
        myList.add("Sunday");
//        print(myList);

//        for (Object element : myList) {
//            System.out.println("element = " + element);
//        }
//
//        System.out.println("Printing with Lambda:");
//        myList.forEach(element -> {
//            System.out.println("element = " + element);
//        });

    Set mySet = new HashSet();
    mySet.add("Maandag");
    mySet.add("Dinsdag");
    mySet.add("Woensdag");
    mySet.add("Donderdag");
    mySet.add("Frydag");
    mySet.add("Saterdag");
    mySet.add("Saterdag");
    mySet.add("Sondag");
//    print(mySet);
        
        Map myMap = new HashMap();
        myMap.put("Value1", "Juan");
        myMap.put("Value2", "Diana");
        myMap.put("Value3", "Ethan");
        myMap.put("Value4", "Jared");
        myMap.put("Value5", "Liam");
        System.out.println("myMap = " + myMap);

        String element = (String)myMap.get("Value3");
        System.out.println("element = " + element);

        print(myMap.keySet());
        print(myMap.values());

    }

    public static void print(Collection collection) {
        System.out.println("\n Printing out collection: \n");
        for(Object element : collection){
            System.out.println("element = " + element);
        }

    }


}
