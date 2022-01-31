package my.edu;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) {

        try {
            FileReader reader = new FileReader("art.txt");
            int data = reader.read();
            while(data != -1){
                System.out.print((char) data);
                data = reader.read();

            }
            reader.close();
        }
        catch (FileNotFoundException exception){
            exception.printStackTrace();
        }
        catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
