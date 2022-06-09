package my.edu.test;

import my.edu.univeristy.Employee;

public class EmployeeTest {

    public static void main(String[] args) {
        Employee employee = new Employee("Claud", 5000.00, false);
        employee.setName("Claud Robinson");
        System.out.println( employee);

        Employee employee2 = new Employee("Diana", 5000.00, false);
        employee2.setName("Diana Cruz");
        System.out.println( employee2);

        Employee employee3 = new Employee("Ethan", 5000.00, false);
        employee3.setName("Ethan Robinson");
        System.out.println( employee3);

        log(employee3);





    }

    public static void log(Employee employee){
        System.out.println("employee = " + employee);
    }

}
