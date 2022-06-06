package my.edu.univeristy;

public class TypeBooleanDemo {

    public static void main(String[] args) {

        boolean varBoolean = false;
        System.out.println("Var Boolean " + varBoolean);

        if(varBoolean){
            System.out.println("Branch True");
        }
        else {

            System.out.println("Branch False");
        }

        var age = 10;
        var isAdult = age >= 18;

        System.out.println("is Adult = " + isAdult);

        if(isAdult){
            System.out.println("Adult");
        }
        else{
            System.out.println("Kid");
        }

    }

}
