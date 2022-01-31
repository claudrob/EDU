package my.edu;

import java.io.File;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) {

        try {
            String currentPath = new File(".").getCanonicalPath();
            System.out.println("Current dir: " + currentPath);
        }catch (IOException ex){
            System.out.println("Exception reading from file: " );
            ex.printStackTrace();
        }
        String currentDir = System.getProperty("user.dir");
        System.out.println("Current dir using System: " + currentDir);

        File file = new File("secret_message.txt");

//        File file = new File("C:\\Users\\cxrobin\\Desktop\\secret_message.txt");
//        File file = new File("C:/Users/cxrobin/Desktop/secret_message.txt");

        if(file.exists()){
            System.out.println("This files exist! :O!");
            System.out.println("Path of file: " + file.getPath());
            System.out.println("Path of Absolute file: " + file.getAbsolutePath());
            System.out.println(file.isFile());
        }
        else{
            System.out.println("This file doesn't exist :(");
        }


    }
}
