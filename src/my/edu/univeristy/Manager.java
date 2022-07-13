package my.edu.univeristy;

public class Manager extends Employee{

    private String department;

    public Manager(String name, double salary, String department){
        super(name, salary);
        this.department = department;
    }

    @Override
    public String getDetails(){
        return super.getDetails() + ", Department: " + this.department;
    }


    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
