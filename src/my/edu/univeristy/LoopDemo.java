package my.edu.univeristy;

public class LoopDemo {

    public static void main(String[] args) {
        var counter = 0;

        while (counter < 3){
            System.out.println("counter = " + counter);
            counter++;
        }
        System.out.println("Finish");

//        counter = 0;
        System.out.println("Do While");
        do{
            System.out.println("counter = " + counter);
            counter++;

        }while(counter < 3);

        System.out.println("Finish Do While");


        int i = 0;
        for( i = 0; i <= 10; i++){
            if(i % 2 != 0)
                continue;
            if(i == 8)
                break;

            System.out.println("i = " + i);
        }
        System.out.println("Done!");
        System.out.println("i = " + i);

    }

}
