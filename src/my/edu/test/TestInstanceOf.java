package my.edu.test;

import my.edu.univeristy.Employee;
import my.edu.univeristy.Manager;

public class TestInstanceOf {

    public static void main(String[] args) {

        Employee employee = new Employee("Diana", 120000);
//        System.out.println(employee.getDetails());
        printOut(employee);
        determineType(employee);

        Manager manager = new Manager("Claud", 140000, "Development");
//        System.out.println(manager.getDetails());
        printOut(manager);
        determineType(manager);

        Employee employee2 = new Manager("Claud", 160000, "R&D");
        printOut(employee2);

        determineType(employee2 );

    }

    public static void determineType(Employee employee){
        if(employee instanceof Manager){
            System.out.println("Type Manager");
            Manager mgr = (Manager)employee;
            System.out.println("Department = " + mgr.getDepartment());
        }

        if(employee instanceof Employee){
            System.out.println("Type Employee");

        }

        if(employee instanceof Object){
            System.out.println("Type Object");
        }


    }

    public static void printOut(Employee employee){
        String details = employee.getDetails();
        System.out.println(details);

    }

}
