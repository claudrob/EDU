package my.edu;

import java.util.Scanner;
import java.util.Random;

public class MathExamples {
    public static void main(String [] args){

        double x = 3.14;
        double y = -10;
        double a = 16;

        double z = Math.abs(y);
        double z1 = Math.max(x, y);
        System.out.println(z);

        System.out.println("Max: " + x + ", " + y);
        System.out.println(z1);

        double x2 = Math.min(x, y);

        System.out.println("Mix: " + x + ", " + y);
        System.out.println(x2);

        double x3 = Math.sqrt(a);
        System.out.println("SQRT: " + x3);

        //new MathExamples().inputTest();
        new MathExamples().randomValues();




    }

    public void inputTest(){
        System.out.println("inputTest(): ");
        double k,l,m;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side x: ");
        k = scanner.nextDouble();
        System.out.println("Enter side y: ");
        l = scanner.nextDouble();
        m = Math.sqrt((k*k) + (l*l));
        System.out.println("The hypotenuse : " + m);
        scanner.close();

    }

    public void randomValues(){
        Random random = new Random();
        int x = random.nextInt(6) + 1;
        double y = random.nextDouble();
        boolean z = random.nextBoolean();

        System.out.println("Random x: " + x);
        System.out.println("Random y: " + y);
        System.out.println("Random z: " + z);
    }


}
