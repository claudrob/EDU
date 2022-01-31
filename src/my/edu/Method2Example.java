package my.edu;

public class Method2Example {

    public static void main(String[] args) {
        //methods

        String name = "Claud";
        int age = 21;

        hello(name, age);

        int x = 3;
        int y = 4;

        int result = sum(x, y);
        System.out.println("Result = " + result);
        System.out.println("result = " + sum(x, y));

    }

    public static void hello(String name, int age){

        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");

    }

    public static int sum(int x, int y){
        return x + y;
    }



}
