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
    
}
