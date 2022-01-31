package my.edu.oop;

public class SuperExamle {

    public static void main(String[] args) {
        Hero hero1 = new Hero("Batman", 42, "$$$");

        Hero hero2 = new Hero("Superman", 43, "Everything");

        printHero(hero1);
        printHero(hero2);

    }

    private static void printHero(Hero hero1) {
        System.out.println("Printing Hero:");
        System.out.println(hero1);
//        System.out.println(hero1.age);
//        System.out.println(hero1.power);
    }
}
