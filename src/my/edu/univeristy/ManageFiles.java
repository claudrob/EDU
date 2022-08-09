package my.edu.univeristy;

import java.io.*;

public class ManageFiles {

    public static void createFile(String fileName){
        File file = new File(fileName);
        try {
                PrintWriter printWriter = new PrintWriter(file);
                printWriter.close();
            System.out.println("Created file: " + fileName);

        }catch (FileNotFoundException ex){
            ex.printStackTrace();
        }
    }

    public static void writeFile(String fileName, String message){
        File file = new File(fileName);
        try {
            PrintWriter printWriter = new PrintWriter(file);
            printWriter.println(message);
            printWriter.close();
            System.out.println("Created file: " + fileName);

        }catch (FileNotFoundException ex){
            ex.printStackTrace();
        }
    }

    public static void addToFile(String fileName, String message){
        File file = new File(fileName);
        try {
            PrintWriter printWriter = new PrintWriter(new FileWriter(file,true));
            printWriter.println(message);
            printWriter.close();
            System.out.println("Created file: " + fileName);

        }catch (FileNotFoundException ex){
            ex.printStackTrace();
        }
        catch (IOException ex){
            ex.printStackTrace();
        }
    }


    public static void readFile(String fileName){
        File file = new File(fileName);
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String input = bufferedReader.readLine();
            while(input != null){
                System.out.println("input = " + input);
                input = bufferedReader.readLine();
            }
            bufferedReader.close();


        }catch (FileNotFoundException ex){
            ex.printStackTrace();
        }
        catch (IOException ex){
            ex.printStackTrace();
        }
    }

}
