package my.edu.univeristy;

public class OperatorDemo {

    public static void main(String[] args) {

//        basicOperations();

//        basicAssignmentOperations();

        unaryOperations();




    }


    private static void unaryOperations(){

        var a = 3;
        var b = -a;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        var c = true;
        var d = !c;
        System.out.println("c == " + c);
        System.out.println("d == " + d);

        //increase
        var e = 3;
        var f = ++e;

        System.out.println("e == " + e);
        System.out.println("f == " + f);

        //increase
        var g = 5;
        var h = g++;

        System.out.println("g == " + g);
        System.out.println("h == " + h);

        var i = 2;
        var j = --i;
        System.out.println("i == " + i);
        System.out.println("j == " + j);

        var k = 5;
        var l = k--;
        System.out.println("k == " + k);
        System.out.println("l == " + l);
        System.out.println("l = " + l);
        System.out.println("i = " + i);

    }

    private static void basicAssignmentOperations() {

        int a = 3, b = 2;
        int c = a + 5 - b;

        System.out.println("c == " + c);

        a += 1; // a = a + 1
        System.out.println("a == " + a);

        a += 3; // a = a + 1
        System.out.println("a == " + a);

        a -= 2; // a = a + 1
        System.out.println("a == " + a);

        a *= 2; // a = a + 1
        System.out.println("a * == " + a);

        a /= 2; // a = a + 1
        System.out.println("a DIV == " + a);

        a %= 2; // a = a + 1
        System.out.println("a Mod == " + a);



    }


    private static void basicOperations() {
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
