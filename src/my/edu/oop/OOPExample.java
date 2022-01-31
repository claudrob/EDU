package my.edu.oop;

public class OOPExample {

    public static void main(String[] args) {

        example1();

//        example2();
//        example3();
        example4();
    }


    private static void example4(){
        Pizza pizza = new Pizza("Thick Crust", "tomato", "mozzarella", "peperoni");


        System.out.println("Here are the ingredients to your pizza");

        System.out.println(pizza.bread);
        System.out.println(pizza.cheese);
        System.out.println(pizza.sauce);
        System.out.println(pizza.topping);
    }

    private static void example3(){
        DiceRoller diceRoller = new DiceRoller();
        diceRoller.roll();
    }

    private static void example2() {
        System.out.println("Create a human!");
        Human human = new Human("Claud", 48, 82);
        Human human2 = new Human("Diana", 41, 54);

        System.out.println(human);
        System.out.println(human2);


    }

        private static void example1() {
        Car myCar1 = new Car();
        myCar1.drive();
        myCar1.brake();
        System.out.println(myCar1.price);
            System.out.println(myCar1);

        Car myCar2 = new Car();


        myCar2.drive();
        myCar2.brake();
            System.out.println(myCar2);
        System.out.println(myCar2.price);
        System.out.println(myCar2.getMake());
    }
}
