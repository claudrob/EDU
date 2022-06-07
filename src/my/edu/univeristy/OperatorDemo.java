package my.edu.univeristy;

public class OperatorDemo {

    public static void main(String[] args) {

//        basicOperations();

//        basicAssignmentOperations();

 //       unaryOperations();

//        equalOperators();
//        conditionalOperators();
//        ternaryOperator();
//        precedenceOfOperators();
//        controlFlow();
//        controlFlow2();
//        controlFlow3();
        controlFlow4();

    }


    private static void controlFlow4(){
        var month = 9;
        var season = "Not known";
        switch (month){
            case 1:
            case 2:
            case 12:
                season = "Winter";
                break;
           case 3:
            case 4:
            case 5:
                season = "Spring";
                break;
           case 6:
            case 7:
            case 8:
                season = "Summer";
                break;
           case 9:
            case 10:
            case 11:
                season = "Autumn";
                break;
            default:
                season = "Unknown";

        }
        System.out.println("season = " + season);
    }

    private static void controlFlow3(){

        var number = 3;
        var numberText = "Unknown";

        switch (number){
            case 1:
                numberText = "Number one";
                break;
            case 2:
                numberText = "Number two";
                break;
            case 3:
                numberText = "Number three";
                break;
            case 4:
                numberText = "Number four";
                break;
            default:
                numberText = "Not Found!";


        }
        System.out.println("numberText = " + numberText);

    }

    private static void controlFlow2(){

        var mes = 9;
        var estacion = "Desconocida";

        if(mes == 1 || mes == 2 || mes == 12){
            estacion = "Invierno";

        }
        else if(mes == 3 || mes == 4 || mes == 5) {
            estacion = "Primavera";
        }
        else if(mes == 6 || mes == 7 || mes == 8) {
            estacion = "Verano";
        }
        else if(mes == 9 || mes == 10 || mes == 11) {
            estacion = "Otonio";
        }
        System.out.println("estacion = " + estacion);

    }


    private static void controlFlow(){

        var condition = true;

        if(condition){
            System.out.println("Condition True");
        }

        else
        {
            System.out.println("Condition FALSE");

        }
        var number = 5;
        var numberText = "Number Unkwnown";

        if(number == 1){
            numberText = "Number one";
        }
        else if(number == 2){
            numberText = "Number two";

        }
        else if(number == 3){
            numberText = "Number three";

        }
        else if(number == 4){
            numberText = "Number four";

        }
        else{
            numberText = "Number not found";
        }



        System.out.println("numberText = " + numberText);

    }



    private static void precedenceOfOperators(){
        var x = 5;
        var y = 10;
        var z = ++x + y--;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);

        var result = 4 + 5 * 6 / 3;
        System.out.println("result = " + result);

        result = (4 + 5) * 6 / 3;
        System.out.println("result = " + result);

    }


    private static void ternaryOperator(){
        var result = (3 > 5) ? "Yes it is" : "No it is not";
        System.out.println("result = " + result);

        var number = 8;
        result = (number % 2) == 0 ? "Yes it is equal" : "Not Equal";
        System.out.println("result = " + result);
    }


    private static void conditionalOperators(){
        var a = 8;
        var minimum = 0;
        var maximum = 10;

        var result = a >= 0 && a <= 10;
        System.out.println("result = " + result);

        if(result){
            System.out.println("Inside the range");
        }else{
            System.out.println("Outside the range");
        }

        var vacation = false;
        var holiday = true;
        if(vacation || holiday){
            System.out.println("Can join the game");
        }
        else{
            System.out.println("Can NOT watch the game");
        }


    }


    private static void equalOperators(){

        var a = 3;
        var b = 2;

        var c = (a == b);
        System.out.println("c = " + c);

        var d = a != b;
        System.out.println("d = " + d);

        var chain = "Hola";
        var chain2 = "Adios";

        var e = chain == chain2; // compare references
        System.out.println("e = " + e);

        var f = chain.equals(chain2);
        System.out.println("f = " + f);

        var g = a >= b;
        System.out.println("g = " + g);

        if(a % 2 == 0)
            System.out.println("Equal number");
        else
            System.out.println("Unequal number");

        var age = 10;
        var adult = 18;
        if(age >= adult){
            System.out.println("Adult.");
        }else {
            System.out.println("Not Adult");
        }

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
