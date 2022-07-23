package my.edu.test;

import my.edu.univeristy.Arimetica;
import my.edu.univeristy.Arithmetic;
import my.edu.univeristy.exceptions.OperationException;

public class TestExceptions {

    public static void main(String[] args) {

        int result = 0;

        try {
            result = Arimetica.division(10, 0);
        }catch (OperationException ex){
            ex.printStackTrace(System.out);
            System.out.println("Message: " + ex.getMessage());
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        finally {
            System.out.println("Finally - End division by zero");
        }
        System.out.println("result = " + result);
    }

}
