package my.edu.cracking.code;

public class Question1_1 {

    public static boolean uniqueCharacters(String s){
        boolean result = true;

        if(s == null){
            return false;
        }

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            for(int j = 0; j < s.length(); j++){
                // same char
                if(i == j)
                    continue;

                if(c == s.charAt(j)){
                    result = false;
                    System.out.println("Duplicated Char = " + c);

                }
            }
        }

        return result;
    }

    public static String reverseString(String str){
        if(str == null){
            return null;
        }
        StringBuffer sb = new StringBuffer();
        for(int i = str.length() - 1; i >= 0; i--){
            sb.append(str.charAt(i));
        }
         return sb.toString();
    }

}
