package my.edu.univeristy;

public class PrimitivesUNI {

    public static void main(String args[]){
        // Comments
        /*
        *  Integer: byte, short, int, float
         */

        byte numberByte = (byte)129;

        System.out.println("byte value: " + numberByte) ;
        System.out.println("minimum byte value: " + Byte.MIN_VALUE) ;
        System.out.println("maximum byte value: " + Byte.MAX_VALUE) ;

        short numberShort = (short)32768;
        System.out.println("Number Short = " + numberShort);
        System.out.println("Max Number Short = " + Short.MAX_VALUE);
        System.out.println("Min Number Short = " + Short.MIN_VALUE);

        int intNumber = (int)2147483648L;
        System.out.println("Number Int = " + intNumber);
        System.out.println("Max Number Int = " + Integer.MAX_VALUE);
        System.out.println("Min Number Int = " + Integer.MIN_VALUE);

        long longNumber = 9223372036854775807L;
        System.out.println("Number Long = " + longNumber);
        System.out.println("Max Number Int = " + Long.MAX_VALUE);
        System.out.println("Min Number Int = " + Long.MIN_VALUE);


    }


}
