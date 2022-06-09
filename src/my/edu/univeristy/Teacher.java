package my.edu.univeristy;

public class Teacher extends SuperPerson{

    private int employeeId;
    private double salary;
    private static int employeeCounter = 0;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Teacher(String name, double salary) {
        super(name);
        this.employeeId = ++Teacher.employeeCounter;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name=" + this.name +
                ", employeeId=" + employeeId +
                ", salary=" + salary +
                '}';
    }
}

