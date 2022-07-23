package my.edu.coursera;

public class WordPlay {


    public static void main(String[] args) {
        System.out.println("a == " + isVowel('a'));
        System.out.println("F == " + isVowel('F'));
        System.out.println(replaceVowels("Hello World", '*'));
        System.out.println(emphasize("dna ctgaaactga", 'a') );
        System.out.println(emphasize("Mary Bella Abracadabra", 'a') );

    }


    public static boolean isVowel(char ch){
        char chTemp = Character.toLowerCase(ch);

        if(chTemp == 'a' || chTemp == 'e' || chTemp == 'i' || chTemp == 'o' || chTemp == 'u' ){
            return true;
        }
        return false;
    }

    public static String replaceVowels(String phrase, char ch){
        if(phrase == null){
            return "";
        }
        StringBuilder sb = new StringBuilder(phrase);
        for(int i = 0; i < sb.length(); i++){
            if(isVowel(sb.charAt(i))){
                sb.setCharAt(i, ch);
            }
        }
        return sb.toString();
    }

    public static String emphasize(String phrase, char ch){
        if(phrase == null){
            return "";
        }
        StringBuilder sb = new StringBuilder(phrase);
        for(int i = 0; i < sb.length(); i++){
            if(Character.toLowerCase(sb.charAt(i)) == ch){

                if(((i + 1)% 2) == 0){
                    //even
                    sb.setCharAt(i, '+');

                }
                else {
                    sb.setCharAt(i, '*');
                }
            }
        }
        return sb.toString();
    }

}
