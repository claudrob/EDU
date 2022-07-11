package my.edu.univeristy.paquete1;

//import my.edu.univeristy.paquete1.Class1;
import my.edu.univeristy.paquete1.ChildClass;

public class TestAccessorModifyers {

    public static void main(String[] args) {
        System.out.println("TEST: TestAccessorModifyers");
        Class1 class1 = new Class1("Public");
        Class1 class2 = new Class1("Public");
        System.out.println("class2 = " + class2);
//        System.out.println("class1 = " + class2.privateAttribute);
        class2.publicMethod();

        ChildClass childClass = new ChildClass();
        System.out.println("childClass = " + childClass);
        childClass.defaultMethod();
        System.out.println(childClass.defaultAttribute);

    }
}
