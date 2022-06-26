package my.edu.test;

import my.edu.univeristy.Continents;
import my.edu.univeristy.Days;

public class EnumTest {
    public static void main(String[] args) {

        System.out.println("Day 1: " + Days.MONDAY);
        indicateDay(Days.MONDAY);
        indicateDay(Days.TUESDAY);


        System.out.println("Continent no. 4 : " + Continents.AMERICA);
        System.out.println("Continent no. 4 : Countries: " + Continents.AMERICA.getCountries());
        System.out.println("Continent no. 1 : " + Continents.AFRICA);
        System.out.println("Continent no. 1 Countries : " + Continents.AFRICA.getCountries());

    }

    private static void indicateDay(Days day){

        switch (day){
            case MONDAY:
                System.out.println("First day of the week");
                break;
            case TUESDAY:
                System.out.println("2nd Day of the week:");
                break;


        }

    }

}
