package my.edu;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) {
        try{
            FileWriter writer = new FileWriter("poem.txt");
            writer.write("Roses are red \n Violets are Blue \n Hoorah Hoorah Hoorah \n Rocking everywhere.");
            writer.append("\nA poem by Claud");
            writer.close();
        }
        catch (IOException exception){
            exception.printStackTrace();
        }


    }
}
