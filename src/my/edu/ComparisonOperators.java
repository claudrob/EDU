package my.edu;

public class ComparisonOperators {

    public static void main(String [] args){
        //Comparison Operators

        int khalidAge = 20;
        int mariamAge = 20;

        System.out.println("Khalid age:  " + (khalidAge));
        System.out.println("Mariam age:  " + (mariamAge));

        System.out.println("is Khalid older than mariam: " + (khalidAge > mariamAge));
        System.out.println("is Khalid older than mariam: >= " + (khalidAge >= mariamAge));

        System.out.println("is Khalid younger than mariam: " + (khalidAge < mariamAge));
        System.out.println("is Khalid older than mariam: <= " + (khalidAge <= mariamAge));

        System.out.println("is Khalid and mariam the same age: " + (khalidAge == mariamAge));
        System.out.println("are Khalid and mariam not the same age: != " + (khalidAge != mariamAge));

    }
}
