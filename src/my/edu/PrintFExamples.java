package my.edu;

public class PrintFExamples {

    public static void main(String[] args) {
        //printf
        // % [flags] [precision] [width] [conversion-character]]

        boolean myBoolean = true;
        char myChar = '@';
        String myString = "Claud";
        int myInt = 50;
        double myDouble = 1000;

        System.out.printf(" %d This is a format string:", 123);
        System.out.println();
        System.out.printf("%b", myBoolean);
        System.out.println();
        System.out.printf("%c", myChar);
        System.out.println();
        System.out.printf("%s", myString);
        System.out.println();
        System.out.printf("%d", myInt);
        System.out.println();
        System.out.printf("%f", myDouble);
        System.out.println();

        System.out.printf("Hello %-10s", myString);
        System.out.println();
        System.out.printf("You have this much money: %,.2f", myDouble);

    }

}
