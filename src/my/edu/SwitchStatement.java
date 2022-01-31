package my.edu;

import java.util.Locale;

public class SwitchStatement {

    public static void main(String [] args){

       //example1();
        exampleTwo();

    }

    public static void  exampleTwo(){
        // Switch Statements

        String day = "Pizza";

        switch (day) {
            case "Sunday":
                System.out.println("It is Sunday");
                break;
            case "Monday":
                System.out.println("It is Monday");
                break;
            case "Tuesday":
                System.out.println("It is Tuesday");
                break;
            case "Wednesday":
                System.out.println("It is Wednesday");
                break;
            case "Thursday":
                System.out.println("It is Thursday");
                break;
            case "Friday":
                System.out.println("It is Friday");
                break;
            case "Saturday":
                System.out.println("It is Saturday");
            default:
                System.out.println("That is not a day " + day);

        }








    }




    public static void example1(){
        //Switch Statements
        String gender = "female";

        if(gender.equals("FEMALE")){

        }else if (gender.equals("MALE")){

        }else if (gender.equals("PREFER_NOT_SAY")){

        }else {

        }

        //switch

        switch (gender.toUpperCase()){
            case "FEMALE":
                System.out.println("Female!!");
                break;
            case "MALE":
                System.out.println("Male!");
                break;
            case "PREFER_NOT_SAY":
                System.out.println("Prefer not say");
                break;
            default:
                System.out.println("Not known");
        }

    }


}
