package my.edu.oop;

public class Pizza {
    // overloaded constructors
    String bread;
    String sauce;
    String cheese;
    String topping;


    Pizza(String bread){
        this.bread = bread;
//        this.sauce = sauce;
//        this.cheese = cheese;
//        this.topping = topping;
    }

    Pizza(String bread, String sauce){
        this.bread = bread;
        this.sauce = sauce;
//        this.cheese = cheese;
//        this.topping = topping;
    }


    Pizza(String bread, String sauce, String cheese){
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
//        this.topping = topping;
    }


    Pizza(String bread, String sauce, String cheese, String topping){
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
        this.topping = topping;
    }


}
