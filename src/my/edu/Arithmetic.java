package my.edu;

public class Arithmetic {

    public static void main(String[] args){

        int ten = 10;
        int two = 2;
        int addition = ten + two;
        System.out.println("ten + two = " + (ten + two));
        System.out.println("ten - two = " + (ten - two));
        System.out.println("ten * two = " + (ten * two));
        System.out.println("ten % two = " + (ten % two));

        System.out.println("ten % 3 = " + (ten % 3));

        //() -> java.util.Math
        System.out.println("Absolute -10 " + Math.abs(-10));
        System.out.println("Max 6 and 10 " + Math.max(6, 10));

        System.out.println("Min 6 and 10 " + Math.min(6, 10));

        System.out.println("Pow " + (int)Math.pow(6, 10));
        System.out.println("SQRT " + (int) Math.sqrt(25));
        System.out.println("PI " + Math.PI);

    }

}
