package my.edu.test;

public class AutoBoxingTest {

    public static void main(String[] args) {

        /*
        int - Integer
        long - Long
        float - Float
        double - Double
        boolean - Boolean
        byte - Byte
        short - Short
        char - Character
         */

        int integer = 10;
        Integer integer1 = 10;
        System.out.println("integer1 = " + integer1);
        System.out.println("integer1 = " + integer1.toString());
        System.out.println("integer1 double = " + integer1.doubleValue());

        int integer2 = integer1;
        System.out.println("integer2 = " + integer2);

    }

}
