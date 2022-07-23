package my.edu.coursera;

import my.edu.oop.package1.A;

public class CaesarBreaker {

    public static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static void main(String[] args) {

        System.out.println(CaesarCipher.encryptTwoKeys("Top ncmy qkff vi vguv vbg ycpx", 26 - 2,26 - 20));
        testDecrypt();
        testHalfOfString();
        testGetKey();
        testDecryptTwoKeys();


    }

    public static int getKey(String s){
        int [] letters = countLetters(s);
        int maxDex = maxIndex(letters);
        System.out.println("maxIndex = " + maxDex + "Letter: " + ALPHABET.charAt(maxDex));
        int decryptKey = maxDex - 4;
        if(maxDex < 4){
            decryptKey = 26 - (4-maxDex);
        }
       return decryptKey;
    }

    public static int[] countLetters(String s){
        int [] result = new int[26];
        for (int i = 0; i < s.length(); i++){
            if(Character.isLetter(s.charAt(i))){
                // find index
                int index = ALPHABET.indexOf(Character.toUpperCase(s.charAt(i)));
                if(index >= 0 || index < result.length)
                    result[index]++;

            }
        }
        return result;
    }

    public static int maxIndex(int [] letters){

        int indexMax = 0;
        for(int i = 0; i < letters.length; i++){
            if(letters[i] > letters[indexMax]){
                indexMax = i;
            }
        }
        return indexMax;
    }

    public static String decrypt(String encrypted, int key){
        String result = CaesarCipher.encrypt(encrypted, 26 - key);
        return  result;
    }

    public static String decrypt(String encrypted){
        int [] frequency = countLetters(encrypted);
        int maxDex = maxIndex(frequency);
        int decryptKey = maxDex - 4;
        if(maxDex < 4){
            decryptKey = 26 - (4-maxDex);
        }

        String result = CaesarCipher.encrypt(encrypted, 26 - decryptKey);
        return  result;
    }



    public static String halfOfString(String message, int start){
        StringBuffer sb = new StringBuffer();
        for(int i = start; i < message.length(); i += 2){
            if(i < message.length()){
                sb.append(message.charAt(i));
            }
        }
        return sb.toString();
    }

    public static String decryptTwoKeys(String encrypted){
        System.out.println("decryptTwoKeys()");
        String decrypted = "";
        int key1;
        int key2;

        String s1 = halfOfString(encrypted, 0);
        String s2 = halfOfString(encrypted, 1);

        key1 = getKey(s1);
        key2 = getKey(s2);

        System.out.println("Decrypt key1 = " + key1);
        System.out.println("Decrypt key2 = " + key2);

        decrypted = CaesarCipher.encryptTwoKeys(encrypted, 26 - key1, 26 - key2);
        System.out.println("decrypted = " + decrypted);


        return decrypted;
    }

    public static void testDecrypt(){

        int key = 15;
        String encryptedMessage = "Pi cddc qt xc iwt rdcutgtcrt gddb lxiw ndjg wpi dc udg p hjgegxht epgin. NTAA ADJS!";
        String result = decrypt(encryptedMessage, key);
        System.out.println("result = " + result);

    }

    public static void testHalfOfString(){
        System.out.println("Test Half of String:  Qbkm Zgis");
        System.out.println(halfOfString("Qbkm Zgis", 0) );
        System.out.println(halfOfString("Qbkm Zgis", 1) );
    }

    public static void testGetKey(){
        System.out.println("Running: testGetKey()");
        int key = getKey("Just a test string with lots of eeeeeeeeeeeeeeeees");
        System.out.println("key = " + key);

    }


    public static void testDecryptTwoKeys(){
        System.out.println("testDecryptTwoKeys()");
        System.out.println("Czojq Ivdzle");
        System.out.println(decryptTwoKeys("Czojq Ivdzle"));

        System.out.println("testDecryptTwoKeys()");
        System.out.println("Akag tjw Xibhr awoa aoee xakex znxag xwko");
        System.out.println(decryptTwoKeys("Akag tjw Xibhr awoa aoee xakex znxag xwko"));

        System.out.println("testDecryptTwoKeys(): Top ncmy qkff vi vguv vbg ycpx");
        System.out.println(decryptTwoKeys( "Top ncmy qkff vi vguv vbg ycpx"));


        System.out.println("TEST DECRYPT TWO KEYS: Aal uttx hm aal Qtct Fhljha pl Wbdl. Pvxvxlx! \n" +
                decryptTwoKeys( "Aal uttx hm aal Qtct Fhljha pl Wbdl. Pvxvxlx!"));

    }

}
