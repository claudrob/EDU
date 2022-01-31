package my.edu;

public class WrapperClassExamples {
    //wrapper
    //
    //
    // primitive //wrapper
    // boolean //Boolean
    // char -> Character
    // int -> Integer
    // double -> Double
    //
    // autoboxing = primitives to wrapper class
    // unboxing = reverse of autoboxing

    public static void main(String[] args) {
        Boolean a = true;
        Character b = '@';
        Integer c = 123;
        Double d = 3.14;
        String e = "Claud";

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        if(a == true){
            System.out.println("This is true");
        }

    }


}
