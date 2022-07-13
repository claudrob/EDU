package my.edu.test;

import my.edu.univeristy.Employee;
import my.edu.univeristy.Manager;

public class ManagerTest {

    public static void main(String[] args) {

        Employee employee = new Employee("Diana", 120000);
//        System.out.println(employee.getDetails());
        printOut(employee);

        Manager manager = new Manager("Claud", 140000, "Development");
//        System.out.println(manager.getDetails());
        printOut(manager);

        Employee employee2 = new Manager("Claud", 160000, "R&D");
        printOut(employee2);


    }

    public static void printOut(Employee employee){
        String details = employee.getDetails();
        System.out.println(details);

    }
}
