package my.edu.test.cracking;

import my.edu.cracking.code.Question1_1;

public class TestQuestion1_1 {

    public static void main(String[] args) {
        String s1 = "abcdefg";
        String s2 = "hello";
        String s3 = "ethan";
        String s4 = "liam";
        String s5 = "diana";
        String s6 = "jared";


        boolean result1 = Question1_1.uniqueCharacters(s1);
        System.out.println(s1 + "; result1 = " + result1);

        boolean result2 = Question1_1.uniqueCharacters(s2);
        System.out.println(s2 + "; result2 = " + result2);

        boolean result3 = Question1_1.uniqueCharacters(s3);
        System.out.println(s3 + "; result3 = " + result3);

         boolean result4 = Question1_1.uniqueCharacters(s4);
        System.out.println(s4 + "; result4 = " + result4);


         boolean result5 = Question1_1.uniqueCharacters(s5);
        System.out.println(s5 + "; result5 = " + result5);

         boolean result6 = Question1_1.uniqueCharacters(s6);
        System.out.println(s6 + "; result6 = " + result6);

    }
}
