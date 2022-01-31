package my.edu.oop;

public class Person {

    String name;
    int age;

    Person(){

    }
    Person(String name, int age){
        this.name = name;
        this.age = age;

    }

    public String toString(){
        return this.name + "\n" + this.age + "\n";
    }
}
