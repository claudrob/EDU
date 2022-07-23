package my.edu.coursera;

public class CaesarCipher {

    public static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static void main(String[] args) {
//        String s = encrypt("FIRST LEGION ATTACK EAST FLANK!", 23);
//        System.out.println("s = " + s);
        testCaesar();

        System.out.println("Encrypt with two keys:");
        System.out.println("Original String: First Legion key1=23, key2=17");
        System.out.println(encryptTwoKeys("First Legion", 23, 17));
        System.out.println("Original String: At noon be in the conference room with your hat on for a surprise party. YELL LOUD! key1=8, key2=21");
        System.out.println(encryptTwoKeys("At noon be in the conference room with your hat on for a surprise party. YELL LOUD!", 8, 21));


        System.out.println("Test: key1=21 and key2=8");
        System.out.println("Can you imagine life WITHOUT the internet AND computers in your pocket?");
        System.out.println(encryptTwoKeys("Can you imagine life WITHOUT the internet AND computers in your pocket?", 21, 8));

        System.out.println("TEST2: Hfs cpwewloj loks cd Hoto kyg Cyy., 14, 24");
        System.out.println(encryptTwoKeys("Hfs cpwewloj loks cd Hoto kyg Cyy.", 26 - 14, 26 - 24));

    }



    public static String encrypt(String input, int key){
        if(input == null){
            return "";
        }

        StringBuilder result = new StringBuilder();
        StringBuilder encryptedAlphabet = new StringBuilder(ALPHABET.substring(key) + ALPHABET.substring(0, key));
//        System.out.println("encryptedAlphabet = " + encryptedAlphabet);

        int charIndex = 0;

        for (int i = 0; i < input.length(); i++){
            charIndex = ALPHABET.indexOf(Character.toUpperCase(input.charAt(i)));
            boolean lowercase = Character.isLowerCase(input.charAt(i));
            if(charIndex != -1){
//                result.append(encryptedAlphabet.charAt(charIndex));
                if(lowercase){
                    result.append(Character.toLowerCase(encryptedAlphabet.charAt(charIndex)));

                }else{
                    result.append(encryptedAlphabet.charAt(charIndex));

                }

            }
            else{

                result.append(input.charAt(i));


            }
        }

        return result.toString();

    }

    public static void testCaesar(){
//        FileResource fr = new FileResource();
//        String message = fr.asString();
//        String message = "FIRST LEGION ATTACK EAST FLANK!";
//        String message = "First Legion";
//        String message = "At noon be in the conference room with your hat on for a surprise party. YELL LOUD!";
        String message = "Can you imagine life WITHOUT the internet AND computers in your pocket?";
        System.out.println("testCeaser: Message: " + message);

        int key = 15;
        String encrypted = encrypt(message, key);
        System.out.println("key is " + key + "\n" + encrypted);
    }

    public static String encryptTwoKeys(String input, int key1, int key2){
        if(input == null){
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < input.length(); i++){
            if(i%2 == 0){
                sb.append(encrypt(Character.toString( input.charAt(i)), key1));
            }
            else {
                sb.append(encrypt(Character.toString( input.charAt(i)), key2));

            }

        }
        return sb.toString();
    }


}
