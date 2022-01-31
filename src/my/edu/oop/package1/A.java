package my.edu.oop.package1;

import my.edu.oop.package2.*;

public class A {
    protected String protectedMessage = "This is Protected";

    public static void main(String[] args) {


        C c = new C();
        System.out.println(c.publicMessage);
        B b = new B();
        System.out.println(b.privateMessage);
    }
}
