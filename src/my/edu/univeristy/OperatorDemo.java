package my.edu.univeristy;

public class OperatorDemo {

    public static void main(String[] args) {

        int a = 3, b = 2;

        var result = a + b;

        System.out.println("Result sum: " + result);

        result = a - b;
        System.out.println("Result minus: " + result);

        result = a * b;
        System.out.println("Result * : " + result);

        result = a / b;
        System.out.println("Result Div : " + result);

        var result2 = 3.0 / b;
        System.out.println("Result Div : " + result2);

        result = a % b;

        System.out.println("Result Mod : " + result);

        if((a % 2) == 0)
            System.out.println("Even");
        else
            System.out.println("Uneven");


    }

}
