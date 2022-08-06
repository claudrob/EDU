package edu.duke.vigenere;

import java.util.*;
import edu.duke.*;

public class VigenereBreaker {

    /**
     *
     * @param message -> the encrypted message
     * @param whichSlice -> the index the slice should start from
     * @param totalSlices -> indicating the length of the key
     * @return
     */
    public String sliceString(String message, int whichSlice, int totalSlices) {
        //REPLACE WITH YOUR CODE
        StringBuilder sb = new StringBuilder();
        int stringLength = message.length();
        for(int i = whichSlice; i < message.length(); i = i + totalSlices){
            if(i < message.length())
                sb.append(message.charAt(i));
        }
        return sb.toString();
    }

    public int[] tryKeyLength(String encrypted, int klength, char mostCommon) {
        int[] key = new int[klength];
        //WRITE YOUR CODE HERE
        CaesarCracker caesarCracker = new CaesarCracker(mostCommon);
        for(int i = 0; i < klength; i++){
            String s = sliceString(encrypted, i, klength);
            key[i] =  caesarCracker.getKey(s);
        }
        return key;
    }

    public void breakVigenere () {
        //WRITE YOUR CODE HERE
        FileResource fileResource = new FileResource();
        String encryptedStrFromFile = fileResource.asString();
        int [] key = tryKeyLength(encryptedStrFromFile, 4, 'e');
        VigenereCipher vigenereCipher = new VigenereCipher(key);
        String decrypted = vigenereCipher.decrypt(encryptedStrFromFile);
        System.out.println("decrypted = " + decrypted);

    }

    public void breakVigenereWithDictionary() {

        FileResource fileResource = new FileResource();
        String encryptedStrFromFile = fileResource.asString();

        FileResource dictionaryFileResource = new FileResource("data/English");
        HashSet<String> dictionary = readDictionary(dictionaryFileResource);


//        int [] key = tryKeyLength(encryptedStrFromFile, 4, 'e');
//        VigenereCipher vigenereCipher = new VigenereCipher(key);
//        String decrypted = vigenereCipher.decrypt(encryptedStrFromFile);

        String decrypted = breakForLanguage(encryptedStrFromFile,dictionary);
        System.out.println("decrypted = " + decrypted);

    }

    public HashSet<String> readDictionary(FileResource fileResource){
        HashSet<String>  dictionaryHS = new HashSet<String>();
        Iterable<String> dictionaryWords = fileResource.lines();
        for (String word : dictionaryWords){
            dictionaryHS.add(word.toLowerCase().trim());
        }
        return dictionaryHS;
    }

    public int countWords(String message, HashSet<String> dictionary){
        int count = 0;
        String[] words = message.split("\\W+");
        System.out.println("Total words = " + words.length);
        for(String word : words){
            if (dictionary.contains(word.toLowerCase().trim())){
                count++;
            }
        }

        return count;

    }

    public String breakForLanguage(String encrypted, HashSet<String> dictionary){
        System.out.println("Starting BreakForLanguage: Number of words in dictionary: " + dictionary.size());

        int theKeyLength = 0;
        int theNumberOfWords = 0;
        int [] theKey = {0};
        String decryptedMessage = "";
        VigenereCipher vigenereCipher = null;

        for (int i = 38; i <= 40; i++){
             int [] key = tryKeyLength(encrypted, i, 'e');
             vigenereCipher = new VigenereCipher(key);
            String decrypted = vigenereCipher.decrypt(encrypted);


            int wordCount = countWords(decrypted, dictionary);

            System.out.println("i = " + i);
            System.out.println("wordCount = " + wordCount);
//            System.out.println("decrypted = " + decrypted);

            if (wordCount > theNumberOfWords){
                theNumberOfWords = wordCount;
                theKeyLength = i;
                theKey = key;
            }

//            System.out.println("decrypted = " + decrypted);

        }
        vigenereCipher = new VigenereCipher(theKey);
        decryptedMessage = vigenereCipher.decrypt(encrypted);
        System.out.println("breakForLanguage:");
        System.out.println("theNumberOfWords = " + theNumberOfWords);
        System.out.println("theKeyLength = " + theKeyLength);
        System.out.println("The Key:");
        for (int val: theKey){
            System.out.println("val = " + val);
        }
        return decryptedMessage;
    }



}
