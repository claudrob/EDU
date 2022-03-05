package my.edu;

import java.io.Serializable;

public class User implements Serializable {
    public String name;
    public transient String password;

    public void sayHello(){
        System.out.println("Hello " + name);
    }

}
