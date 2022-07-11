package my.edu.univeristy.paquete1;

import my.edu.univeristy.paquete1.Class1;

public class ChildClass extends Class1 {

    String defaultAttribute = "Default Attribute";

    public ChildClass(){
        super("Public");
        this.defaultAttribute = "Protected Attribute";
    }

    void defaultMethod()
    {
        System.out.println("Default Method");
    }

}
