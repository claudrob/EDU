package my.edu.coursera;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class WordLengths {

    public static void main(String[] args) {

        int [] counts = new int[31];
        String fileName = "manywords.txt";
//        String fileName = "lotsOfWords.txt";
//        String fileName = "smallHamlet.txt";
//        countWordLengths(fileName, counts);
        getKeysFromFile("mysteryTwoKeysQuiz.txt");

    }



    public static void countWordLengths(String fileName, int [] counts) {


        StringBuffer sb = new StringBuffer();

        try {
            FileReader reader = new FileReader(fileName);
            int data = reader.read();
            while (data != -1) {
                System.out.print((char) data);
                if((char) data == '\n' ){
                    sb.append(' ');
                    data = reader.read();
                    continue;
                }

                if( (char) data == '\r'){

                    data = reader.read();
                }

                sb.append((char) data);

                data = reader.read();

            }
            reader.close();
            System.out.println("\nStringBuffer: ");
            System.out.println("sb = " + sb);
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        String[] words = sb.toString().split(" ");
        System.out.println("Word Array");
        System.out.println("words = " + words);

//        for(String s: words){
//            System.out.println("s = " + s);
//        }
        for(int i = 0; i < words.length; i++){
            int length = words[i].length();
            if(words[i].length() > 0 && !Character.isLetter(words[i].charAt(0))){
                length--;
            }
            if(words[i].length() > 0 && !Character.isLetter(words[i].charAt(words[i].length()-1))){
                length--;
            }

            if(length > counts.length){
                counts[counts.length - 1]++;
            }
            else if(length >= 0){
                counts[length]++;
            }
        }

        for (int i = 0; i < counts.length; i++){
            System.out.println("counts " + i + ": = " + counts[i]);
        }

            
    }


    public static void getKeysFromFile(String fileName) {


        StringBuffer sb = new StringBuffer();

        try {
            FileReader reader = new FileReader(fileName);
            int data = reader.read();
            while (data != -1) {
                System.out.print((char) data);
                if((char) data == '\n' ){
                    sb.append(' ');
                    data = reader.read();
                    continue;
                }

                if( (char) data == '\r'){

                    data = reader.read();
                    continue;
                }

                sb.append((char) data);

                data = reader.read();

            }
            reader.close();
            System.out.println("\nStringBuffer: ");
            System.out.println("sb = " + sb);
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        System.out.println("CAESER BREAKER OF FILE: ");

        CaesarBreaker.decryptTwoKeys(sb.toString());



        }

    /*
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
     */


}
