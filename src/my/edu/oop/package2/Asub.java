package my.edu.oop.package2;

import my.edu.oop.package1.A;

public class Asub extends A {


    public static void main(String[] args) {


        C c = new C();
        System.out.println(c.defaultMessage);

        Asub asub = new Asub();
        System.out.println(asub.protectedMessage);
    }


}
