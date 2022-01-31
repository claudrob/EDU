package my.edu;

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {

        // ArrayList

        ArrayList<String>  food = new ArrayList<String>();
        food.add("Pizza");
        food.add("Hamburger");
        food.add ("HotDog");

        food.set(0, "Sushi");
        food.remove(2);
//        food.clear();

        for(int i = 0; i < food.size(); i++){

            System.out.println(food.get(i));

        }

    }
}
