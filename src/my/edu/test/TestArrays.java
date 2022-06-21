package my.edu.test;

import my.edu.oop.Person;

public class TestArrays {

    public static void main(String[] args) {

        int  ages [] = new int[3];
        System.out.println("ages = " + ages);

        ages[0] = 18;
        ages[1] = 16;
        ages[2] = 13;

        System.out.println("ages '0' = " + ages [0]);
        System.out.println("ages '0' = " + ages [1]);
        System.out.println("ages '0' = " + ages [2]);

        for (int i = 0; i < ages.length; i++)
            System.out.println("i = " + i + ", value = " + ages[i]);



        Person [] persons = new Person[3];

        persons[0] = new Person("Claud", 49);
        persons[1] = new Person("Diana", 42);
        persons[2] = new Person("Ethan", 18);

        for(int j = 0; j < persons.length; j++)
            System.out.println("j = " + j + ", " + persons[j]) ;

        String fruit [] = {"Orange", "Apple", "Banana"};

        for(int i = 0; i < fruit.length; i++){
            System.out.println("i = " + i + ", " + fruit[i]);
        }


    }
}
