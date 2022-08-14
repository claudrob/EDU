package my.edu.codesignal;

public class TestPalindrome {

    public static void main(String[] args) {
        String test1 = "aabaa";
        String test2 = "abac";
        String test3 = "a";

        System.out.println(test1 + " = " + solution(test1));
        System.out.println(test2 + " = " + solution(test2));
        System.out.println(test3 + " = " + solution(test3));

    }


    public static  boolean solution(String inputString) {
        boolean result = true;

        for(int i = 0; i < (inputString.length()/2); i++  ){
            char start = inputString.charAt(i);
            char end = inputString.charAt((inputString.length() - 1) - i);
            System.out.println("start = " + start);
            System.out.println("end = " + end);

            if( start != end){
                result = false;
            }

        }

        return result;

    }
}
