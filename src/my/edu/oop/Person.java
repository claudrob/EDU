package my.edu.oop;

public class Person {

    String name;
    int age;

    Person(){

    }

    public Person(String name){
        this.name = name;
    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;

    }

    public String toString(){
        return this.name + "\t" + this.age;
    }
}
