package my.edu.test;

public class VarArgsTest {

    public static void main(String[] args) {

        printNumbers(3, 5, 8);
        printNumbers(3, 5, 8, 10);
        variousParameters("Claud", 1, 3 , 8 , 9);


    }

    private static void variousParameters(String name, int ... numbers){

        System.out.println("name = " + name);
        printNumbers(numbers);


    }


    private static void printNumbers(int ... numbers){
        for (int i = 0; i < numbers.length; i++){
            System.out.println("numbers " + i + ": " + numbers[i]);
        }

    }

}


