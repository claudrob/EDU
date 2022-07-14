package my.edu.test;

import my.edu.univeristy.Employee;

public class TestObjectClass {
    public static void main(String[] args) {
        Employee employee = new Employee("Claud", 160000);
        Employee employee2 = new Employee("c      laud", 160000);

        if(employee.equals( employee2)){
            System.out.println("True: employee == employee2");
        }else
        {
            System.out.println("False: employee == employee2");

        }
        System.out.println("Hashcode employee2 = " + employee2.hashCode());
        System.out.println("Hashcode employee = " + employee.hashCode());

        if(employee.hashCode() == employee2.hashCode()){
            System.out.println("Hashcodes are equal");
        }else {

            System.out.println("Hashcodes are NOT equal");
        }


    }
}
