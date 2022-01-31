package my.edu.corejava;

public class VariableExamples {
    /****************
     * Primitives:
     * ---------------
     * boolean: 1 bit; true / false
     * byte: 1 byte; -128 to 127
     * short: 2 bytes; -32,768 to 32,767
     * int: 4 bytes; 2 billion to 2 billion
     * long: 8 bytes; -9 quintillion to 9 quintillion
     * float: 4 bytes; fractional number up to 6-7 digits e.g. 3.141592f
     * double: 8 bytes; fractional number up to 15 digits e.g. 3.14159265
     * char: 2 bytes; single char/letter/ASCII; e.g. 'f'
     * String: Sequence of chars; e.g. "I love Pizza".
     * ----------------------------------------------------------------------
     */

    public static void main(String[] args) {

        // declare var
        int x;
        // assign
        x = 15;
        // initialization.
        int y = 16;
        float z = 3.14f;
        boolean a = true;
        char c = 'c';
        String str = "This is a string";

        // printing out vars

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
        System.out.println(c);
        System.out.println(str);

        // swap vars

        String x1 = "Pizza";
        String x2 = "Cheese";
        String tmp = "";

        System.out.println("E.g. Swapping vars e.g.:");
        System.out.println("x1: " + x1);
        System.out.println("x2: " + x2);

        tmp = x2;
        x2 = x1;
        x1 = tmp;


        System.out.println("Vars swapped:");
        System.out.println("x1: " + x1);
        System.out.println("x2: " + x2);



    }






}
