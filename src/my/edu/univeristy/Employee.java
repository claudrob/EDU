package my.edu.univeristy;

public class Employee {

    private int employeeID;
    private static int employeeCounter = 0;

    private String name;
    private double salary;
    private boolean eliminated;

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

    public String toString(){
        return "Employee [name: " + this.name +
                ", Emp ID: " + employeeID +
                ", Salary: " + salary +
                ", eliminated: " + eliminated +
                "]";
    }

}
