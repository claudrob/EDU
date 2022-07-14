package my.edu.test;

import my.edu.univeristy.Employee;
import my.edu.univeristy.Writer;
import my.edu.univeristy.WritingType;

public class TestCastingObjects {
    public static void main(String[] args) {
        Employee employee;

        employee = new Employee("Claud", 140000);
        System.out.println("employee = " + employee);

        Employee employee1 = new Writer("Claud", 150000, WritingType.CLASIC);
        System.out.println("employee1 = " + employee1);

        System.out.println(employee.getDetails());
        System.out.println(employee1.getDetails());

        Writer writer = (Writer) employee1;
        System.out.println("WriterType = " + writer.getWritingType());
        System.out.println("writer = " + writer);

        Employee employee2 = writer;

    }

}
