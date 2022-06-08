package my.edu.univeristy;

public class TestArithmetic {

    public static void main(String[] args) {
        var a = 10;
        var b = 2;

        Arithmetic arithmetic = new Arithmetic(33, 74);
        arithmetic.sum();

        Arithmetic arithmetic2 = new Arithmetic(50, 100);
        arithmetic2.sum();
        int result = arithmetic2.sumWithReturn();

        System.out.println("Result: " + result);

        int result2 = arithmetic2.sumWithArgs(101, 502);
        System.out.println("result2 = " + result2);




    }

}
