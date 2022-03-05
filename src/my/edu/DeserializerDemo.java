package my.edu;

import java.io.*;

public class DeserializerDemo {

    public static void main(String[] args) {

        User user = null;

        FileInputStream fileIn = null;
        try {
            fileIn = new FileInputStream("C:\\Users\\claud\\IdeaProjects\\EDU\\UserInfo.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            user = (User) in.readObject();

            long serialVersionUID = ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID();
            System.out.println("serialVersionUID:" + serialVersionUID);
                    in.close();
            fileIn.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(user.name);
        System.out.println(user.password);
        user.sayHello();




    }

}
