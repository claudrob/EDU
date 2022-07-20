package my.edu.test;

import my.edu.univeristy.IAccessData;
import my.edu.univeristy.ImplementationMySQL;
import my.edu.univeristy.ImplementationOracle;

public class TestInterfaces {

    public static void main(String[] args) {
        IAccessData data  = new ImplementationOracle();
        printOut(data);

        data = new ImplementationMySQL();
        printOut(data);
    }

    public static void printOut(IAccessData data){
        data.list();
    }
}
