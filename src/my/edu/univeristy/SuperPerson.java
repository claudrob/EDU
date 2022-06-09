package my.edu.univeristy;

public class SuperPerson {
    protected String name;
    protected char gender;
    protected int age;
    protected String address;

    public SuperPerson(){

    }

    public SuperPerson(String name){
        this.name = name;
    }

    public SuperPerson(String name, char gender, int age, String address) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "SuperPerson{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
