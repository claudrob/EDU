package edu.duke.vigenere;

import java.util.*;
import edu.duke.*;

public class VigenereBreaker {


    public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

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

    public void breakVigenereWithManyDictionaries() {

        HashMap<String, HashSet<String>> languages = new HashMap<String, HashSet<String>>();

        FileResource dictionaryFileResource = new FileResource("data/English");
        HashSet<String> englishDictionary = readDictionary(dictionaryFileResource);
        languages.put("English", englishDictionary);

        dictionaryFileResource = new FileResource("data/Dutch");
        HashSet<String> dutchDictionary = readDictionary(dictionaryFileResource);
        languages.put("Dutch", dutchDictionary);

        dictionaryFileResource = new FileResource("data/Danish");
        HashSet<String> danishDictionary = readDictionary(dictionaryFileResource);
        languages.put("Danish", danishDictionary);

        dictionaryFileResource = new FileResource("data/French");
        HashSet<String> frenchDictionary = readDictionary(dictionaryFileResource);
        languages.put("French", frenchDictionary);

        dictionaryFileResource = new FileResource("data/German");
        HashSet<String> germanDictionary = readDictionary(dictionaryFileResource);
        languages.put("German", germanDictionary);

        dictionaryFileResource = new FileResource("data/Italian");
        HashSet<String> italianDictionary = readDictionary(dictionaryFileResource);
        languages.put("Italian", italianDictionary);



        FileResource fileResource = new FileResource();
        String encryptedStrFromFile = fileResource.asString();



//        int [] key = tryKeyLength(encryptedStrFromFile, 4, 'e');
//        VigenereCipher vigenereCipher = new VigenereCipher(key);
//        String decrypted = vigenereCipher.decrypt(encryptedStrFromFile);

//        String decrypted = breakForLanguage(encryptedStrFromFile,englishDictionary);
        String decrypted = breakForAllLangs(encryptedStrFromFile,languages);

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
//        System.out.println("Total words in message = " + words.length);
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
        char commonChar = mostCommonCharIn(dictionary);
        System.out.println("commonChar = " + commonChar);

        for (int i = 1; i <= 100; i++){
             int [] key = tryKeyLength(encrypted, i, commonChar);
             vigenereCipher = new VigenereCipher(key);
            String decrypted = vigenereCipher.decrypt(encrypted);


            int wordCount = countWords(decrypted, dictionary);

//            System.out.println("i = " + i);
//            System.out.println("wordCount = " + wordCount);
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
        System.out.println("the Number Of Words matching in dictionary = " + theNumberOfWords);
        System.out.println("theKeyLength = " + theKeyLength);
        System.out.println("The Key:");
        for (int val: theKey){
            System.out.println("val = " + val);
        }
        return decryptedMessage;
    }





    public char mostCommonCharIn (HashSet<String> dictionary){

        StringBuilder input = new StringBuilder();
        Iterator<String> words = dictionary.iterator();

        for (Iterator<String> it = words; it.hasNext(); ) {
            String s = it.next();
            input.append(s);
        }

        CaesarCracker caesarCracker = new CaesarCracker();
        int[] freqs = caesarCracker.countLetters(input.toString());
        int maxDex = caesarCracker.maxIndex(freqs);
        char theChar = ALPHABET.charAt(maxDex);
        System.out.println("theChar = " + theChar);
        return theChar;

    }

    public String breakForAllLangs(String encrypted, HashMap<String, HashSet<String>> languages){

        String topLanguage = "";
        int topNumberOfHits = 0;
        String theDecryptedMessage = "";

        for(String language : languages.keySet()){
            HashSet<String> languageDictionary = languages.get(language);
            String decrypted = breakForLanguage(encrypted, languageDictionary);
            int numberOfWords = countWords(decrypted, languageDictionary);

            if(numberOfWords > topNumberOfHits){
                topNumberOfHits = numberOfWords;
                topLanguage = language;
            }

        }

        System.out.println("topNumberOf matching words = " + topNumberOfHits);
        System.out.println("topLanguage = " + topLanguage);
        HashSet<String> languageDictionary = languages.get(topLanguage);
        theDecryptedMessage  = breakForLanguage(encrypted, languageDictionary);
        int numberOfWords = countWords(theDecryptedMessage, languageDictionary);
        return theDecryptedMessage;

    }


}
