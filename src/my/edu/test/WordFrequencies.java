package my.edu.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class WordFrequencies {

    public static void main(String[] args) {
        System.out.println("Testing WordFrequencies");
        WordFrequencies wordFrequencies = new WordFrequencies();
        wordFrequencies.tester();
    }


    private ArrayList<String> myWords;
    private ArrayList<Integer> myFreq;

    public WordFrequencies(){
        this.myWords = new ArrayList<String>();
        myFreq = new ArrayList<Integer>();

    }

    public void findUnique(){
        myFreq.clear();
        myWords.clear();

        // Select file
        String fileName = "likeit.txt";
//        String fileName = "testwordfreqs.txt";

        //Process file
        StringBuffer sb = new StringBuffer();

        try {
            FileReader reader = new FileReader(fileName);
            int data = reader.read();

            // Read data
            while (data != -1) {
//                System.out.print((char) data);
                if((char) data == '\n' ){
                    sb.append(' ');
                    data = reader.read();
                    continue;
                }

                // Skip
                if( (char) data == '\r'){

                    data = reader.read();
                }

                sb.append((char) data);

                data = reader.read();

            }
            reader.close();
//            System.out.println("\nStringBuffer: ");
//            System.out.println("sb = " + sb);
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        String[] words = sb.toString().split(" ");
        System.out.println("Word Array");
        System.out.println("Total number of words = " + words.length);

        for(String theWord : words){

            if(theWord.trim().equals(""))
                continue;
            if(this.myWords.contains(theWord.toLowerCase())){
                int index = this.myWords.indexOf(theWord.toLowerCase());
                if(index >= 0 && index < myFreq.size()){
                    int val = this.myFreq.get(index);
                    this.myFreq.set(index, ++val);
                }

            }
            else {
                this.myWords.add(theWord.toLowerCase());
                this.myFreq.add(1);
            }
        }


        System.out.println("Number of unique words = " + this.myWords.size());
        System.out.println("Number of unique indexes = " + this.myFreq.size());


    }


    public void tester(){
        findUnique();
        printWords();
        printMaxWord();

    }

    public void printWords(){
        for(int i = 0; i < this.myWords.size(); i++){

            int frequency = 0;
            if(i < this.myFreq.size())
                frequency = myFreq.get(i);

            System.out.println(frequency + " : " + this.myWords.get(i) + " ");
        }
    }

    public  int maxIndex(){

        int indexMax = 0;
        int maxValue = 0;
        for(int i = 0; i < this.myFreq.size(); i++){

            if(this.myFreq.get(i) > maxValue){
                indexMax = i;
                maxValue = this.myFreq.get(i);
            }
        }
        return indexMax;
    }

    public  void printMaxWord(){
        int indexOfMaxWord = maxIndex();
        System.out.println("The word that occurs most often and its count are:" + myWords.get(indexOfMaxWord) +
                " " + myFreq.get(myFreq.get(indexOfMaxWord)));
    }

}
