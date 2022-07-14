package my.edu.univeristy;

import java.util.Objects;

public class Employee {

    private int employeeID;
    private static int employeeCounter = 0;

    protected String name;
    protected double salary;
    private boolean eliminated;

    public Employee(String name, double salary){

        employeeID = ++Employee.employeeCounter;
        this.name = name;
        this.salary = salary;
        this.eliminated = false;
    }

    public Employee(String name, double salary, boolean eliminated){

        employeeID = ++Employee.employeeCounter;
        this.name = name;
        this.salary = salary;
        this.eliminated = eliminated;
    }

    public String  getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getSalary(){
        return this.salary;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public void setEliminated(boolean eliminated){
        this.eliminated = eliminated;
    }

    public boolean isEliminated(){
        return this.eliminated;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return
                //employeeID == employee.employeeID &&
                Double.compare(employee.salary, salary) == 0 && eliminated == employee.eliminated && name.equals(employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary, eliminated);
//        return Objects.hash(employeeID, name, salary, eliminated);
    }

    public String getDetails(){
        return "Name: " + this.name + ", salary: " + this.salary;
    }

    public String toString(){
        return "Employee [name: " + this.name +
                ", Emp ID: " + employeeID +
                ", Salary: " + salary +
                ", eliminated: " + eliminated +
                "]";
    }





}
