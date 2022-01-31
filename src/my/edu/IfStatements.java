package my.edu;

public class IfStatements {

    public static void main(String [] args) {
        //If statements
        int age = 75;

        if (age >= 18 && age <= 74) {
            System.out.println("Hooray - Adult!");
        }else if (age>= 16  && age < 18){
            System.out.println("I am almost an Adult.");
        }else if (age >= 75){
            System.out.println("You are BOOMER");
        }

        String message = age >= 18 ?
                "Hooray - Adult" :
                "I am NOT an adult";
        System.out.println(message);

//        if (age >= 18) {
//            System.out.println("Hooray - Adult!");
//        }else if (age>= 16  && age < 18){
//            System.out.println("I am almost an Adult.");
//        }else{
//            System.out.println("I am not an adult.");
//        }

       // moreIfStatements();
    }

    public static void moreIfStatements(){

        int age = 18;
        if(age >= 18){
            System.out.println("You're an adult.");
        }

    }


}
