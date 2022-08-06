package my.edu.coursera;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CharactersInPlay {


    public static void main(String[] args) {
        CharactersInPlay charactersInPlay = new CharactersInPlay();
        charactersInPlay.tester();

    }

    private  ArrayList<String> charactersList;
    private  ArrayList<Integer> charactersFreqencies;

    public CharactersInPlay(){
        charactersList = new ArrayList<String>();
        charactersFreqencies = new ArrayList<Integer>();
    }

    public void update(String character){

        if(charactersList.contains(character)){

            int index = this.charactersList.indexOf(character);
            if(index >= 0 && index < this.charactersFreqencies.size()){
                int val = this.charactersFreqencies.get(index);
                this.charactersFreqencies.set(index, ++val);
            }
        }
        else {
            this.charactersList.add(character);
            this.charactersFreqencies.add(1);

        }

    }

    public void findAllCharacters(){
        // Select file
        String fileName = "errors.txt";
//        String fileName = "macbethSmall.txt";

        //Process file
        StringBuffer sb = new StringBuffer();

        try {
            FileReader reader = new FileReader(fileName);
            int data = reader.read();

            // Read data
            while (data != -1) {
//                System.out.print((char) data);

                if((char) data == '\n' ){
                    processLine(sb.toString());
                    sb = new StringBuffer();
                    data = reader.read();
                    continue;
                }

                // Skip
                if( (char) data == '\r'){

                    data = reader.read();
                    continue;
                }

                sb.append((char) data);

                data = reader.read();

            }
            reader.close();
            if(sb.length() > 0)
                processLine(sb.toString());
//            System.out.println("\nStringBuffer: ");
//            System.out.println("sb = " + sb);
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private void processLine(String line){
        if(line == null){
            return;
        }
//        System.out.println("Process Line " + line);
        if(line.contains(".")){
            String character = line.substring(0, line.indexOf("."));

//            System.out.println("Process Line " + character.trim());
            update(character.trim());
        }

    }

    public void tester(){
        System.out.println("Testing CharactersInPlay");
        findAllCharacters();
//        printCharacters();
        charactersWithNumParts(10, 15);

    }

    public void printCharacters() {
        for (int i = 0; i < this.charactersList.size(); i++) {

            int frequency = 0;
            if (i < this.charactersFreqencies.size())
                frequency = charactersFreqencies.get(i);

            if (frequency > 1)
                System.out.println(frequency + " : " + this.charactersList.get(i) + " ");
        }
    }


        public void charactersWithNumParts(int num1, int num2) {
            System.out.println("Characters with number parts");
        for (int i = 0; i < this.charactersList.size(); i++) {

            int frequency = 0;
            if (i < this.charactersFreqencies.size())
                frequency = charactersFreqencies.get(i);

            if (frequency >=  num1  && frequency <= num2)
                    System.out.println(frequency + " : " + this.charactersList.get(i) + " ");
        }
    }


}
