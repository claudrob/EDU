package my.edu.univeristy;

import my.edu.univeristy.exceptions.OperationException;

public class Arimetica {

    public static int division(int numerator, int denominator) {
        if(denominator == 0){
            throw new OperationException("Dividing by zero");
        }
        return numerator / denominator;
    }

}
