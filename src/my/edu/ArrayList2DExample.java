package my.edu;
import java.util.*;

public class ArrayList2DExample {

    public static void main(String[] args) {

        ArrayList<ArrayList<String>> groceryList = new ArrayList<>();

        ArrayList<String> bakeryList = new ArrayList<>();
        bakeryList.add("Pasta");
        bakeryList.add("Garlic bread");
        bakeryList.add(("Donuts"));
        groceryList.add(bakeryList);

        System.out.println(bakeryList.get(0));

        ArrayList<String> produceList = new ArrayList<>();
        produceList.add("tomatoes");
        produceList.add("zucchini");
        produceList.add(("peppers"));

        groceryList.add(produceList);

        ArrayList<String> drinkList = new ArrayList<>();
        drinkList.add("soda");
        drinkList.add("coffee");
        drinkList.add(("tea"));

        groceryList.add(drinkList);

        System.out.println(groceryList);
        System.out.println(groceryList.get(0).get(0));
        System.out.println(groceryList.get(2).get(1));


    }
}
