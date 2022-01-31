package my.edu;

import java.util.Locale;

public class StringExamples {

    public static void main(String[] args) {
        //String
        String name = "Claud";

        String name2 = "   Claud    ";

        boolean result = name.equalsIgnoreCase("claud");
        int strLength = name.length();
        char myChar = name.charAt(0);
        int indexOf = name.indexOf("a");

        System.out.println(name);
        System.out.println(result);
        System.out.println(myChar);
        System.out.println(myChar);
        System.out.println(indexOf);
        System.out.println(name.toUpperCase(Locale.ROOT));
        System.out.println(name.toLowerCase(Locale.ROOT));
        System.out.println(name2.trim());
        System.out.println(name.replace("a", "o"));

    }

}
