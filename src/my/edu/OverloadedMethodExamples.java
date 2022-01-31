package my.edu;

public class OverloadedMethodExamples {
    // overloaded methods

    public static void main(String[] args) {

        double x = add(1.0,2.1, 4.3, 5.4);
        System.out.println("X = " + x);



    }

    static int add(int a , int b){
        System.out.println("Overloaded method 1");
        return a + b;
    }

    static int add(int a , int b, int c){
        System.out.println("Overloaded method 2");
        return a + b + c;
    }

    static int add(int a , int b, int c, int d){
        System.out.println("Overloaded method 3");
        return a + b + c + d;
    }

    static double add(double a , double b, double c, double d){
        System.out.println("Overloaded method 4");
        return a + b + c + d;
    }

}
