package edu.duke.vigenere;

import edu.duke.FileResource;

public class TesterForCaesarCipher {

    public static void main(String [] args){
        TesterForCaesarCipher tester = new TesterForCaesarCipher();
//        tester.testCaesarCipher();
//        tester.testCaesarCracker();
//        tester.testViginereCipher();
//        tester.testSliceString();
//        tester.testTryKeyLength();
//        tester.testBreakVigenere();
//        tester.testBreakVigenereWithDictionary();
        tester.testBreakVigenereForAllLanguages();
    }

    public void testCaesarCipher(){
        String fileName = "data/titus-small.txt";
        FileResource fileResource = new FileResource(fileName);
        Iterable<String> data = fileResource.lines();
        CaesarCipher caesarCipher = new CaesarCipher(4);
        for(String line : data){
            String encrypted = caesarCipher.encrypt(line);
            System.out.println("encrypted = " + encrypted);
            String decrypted = caesarCipher.decrypt(encrypted);
            System.out.println("decrypted = " + decrypted);

        }
    }

    public void testCaesarCracker(){

//        String fileName = "data/titus-small_key5.txt";
        String fileName = "data/oslusiadas_key17.txt";
        FileResource fileResource = new FileResource(fileName);
        Iterable<String> data = fileResource.lines();
        CaesarCracker caesarCracker = new CaesarCracker('a');
        for (String line : data){
            String result = caesarCracker.decrypt(line);
            System.out.println("result = " + result);
        }

    }


    public void testViginereCipher(){
        System.out.println("***testViginereCipher()***");
        String fileName = "data/titus-small.txt";
        FileResource fileResource = new FileResource(fileName);
        Iterable<String> data = fileResource.lines();
        int [] key = {17, 14, 12, 4};
        VigenereCipher vigenereCipher = new VigenereCipher(key);
        for(String line : data){
            String encrypted = vigenereCipher.encrypt(line);
            System.out.println("encrypted = " + encrypted);
            String decrypted = vigenereCipher.decrypt(encrypted);
            System.out.println("decrypted = " + decrypted);

        }
    }

    public void testSliceString(){
        VigenereBreaker vigenereBreaker = new VigenereBreaker();
        System.out.println("sliceString(abcdefghijklm, 0, 3): " + vigenereBreaker.sliceString("abcdefghijklm", 0, 3));
        System.out.println("sliceString(abcdefghijklm, 1, 3): " + vigenereBreaker.sliceString("abcdefghijklm", 1, 3) );
        System.out.println("sliceString(abcdefghijklm, 2, 3): " + vigenereBreaker.sliceString("abcdefghijklm", 2, 3) );
        System.out.println("sliceString(abcdefghijklm, 0, 4): " + vigenereBreaker.sliceString("abcdefghijklm", 0, 4) );
        System.out.println("sliceString(abcdefghijklm, 1, 4): " + vigenereBreaker.sliceString("abcdefghijklm", 1, 4) );
        System.out.println("sliceString(abcdefghijklm, 2, 4): " + vigenereBreaker.sliceString("abcdefghijklm", 2, 4) );
        System.out.println("sliceString(abcdefghijklm, 3, 4): " + vigenereBreaker.sliceString("abcdefghijklm", 3, 4) );
        System.out.println("sliceString(abcdefghijklm, 0, 5): " + vigenereBreaker.sliceString("abcdefghijklm", 0, 5) );
        System.out.println("sliceString(abcdefghijklm, 1, 5): " + vigenereBreaker.sliceString("abcdefghijklm", 1, 5) );
        System.out.println("sliceString(abcdefghijklm, 2, 5): " + vigenereBreaker.sliceString("abcdefghijklm", 2, 5) );
        System.out.println("sliceString(abcdefghijklm, 3, 5): " + vigenereBreaker.sliceString("abcdefghijklm", 3, 5) );
        System.out.println("sliceString(abcdefghijklm, 4, 5): " + vigenereBreaker.sliceString("abcdefghijklm", 4, 5) );
    }

    public void testTryKeyLength(){

        String fileName = "data/secretmessage1.txt";
        FileResource fileResource = new FileResource(fileName);

        String encryptedStr = fileResource.asString();
        VigenereBreaker vigenereBreaker = new VigenereBreaker();
        int [] key = vigenereBreaker.tryKeyLength(encryptedStr, 4, 'e');

        for(int theKey:key)
        System.out.println("key = " + theKey);
    }

    public void testBreakVigenere(){
        VigenereBreaker vigenereBreaker = new VigenereBreaker();
        vigenereBreaker.breakVigenere();
    }

    public void testBreakVigenereWithDictionary(){
        VigenereBreaker vigenereBreaker = new VigenereBreaker();
        vigenereBreaker.breakVigenereWithDictionary ();
    }

    public void testBreakVigenereForAllLanguages(){
        VigenereBreaker vigenereBreaker = new VigenereBreaker();
        vigenereBreaker.breakVigenereWithManyDictionaries();
    }


    //msg.split("\\W")

}
