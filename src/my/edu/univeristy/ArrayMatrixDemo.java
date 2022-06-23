package my.edu.univeristy;

public class ArrayMatrixDemo {

    public static void main(String[] args) {

        int ages[][] = new int[3][2];
        System.out.println("ages = " + ages);

        ages[0][0] = 5;
        ages[0][1] = 7;
        ages[1][0] = 8;
        ages[1][1] = 9;
        ages[2][0] = 12;
        ages[2][1] = 14;

        for(int row = 0; row < ages.length; row++){
            for(int col = 0; col < ages[row].length; col++){
                System.out.println("row = " + row + ", col = " + col + ", ages = " + ages[row][col]);
            }
        }

        String fruit[][] = {{"Orange", "Lemon"},{"Strawberries", "Blue berries"}};

        for(int row = 0; row < fruit.length; row++){
            for(int col = 0; col < fruit[row].length; col++ )
                System.out.println("row = " + row + ", col = " + col + ", fruit = " + fruit[row][col]);
        }

        Persona personas [][] = new Persona[3][2];
        personas[0][0] = new Persona("Diana");
        personas[0][1] = new Persona("Claud");
        personas[1][0] = new Persona("Liam");
        personas[1][1] = new Persona("Jared");
        personas[2][0] = new Persona("Ethan");
        personas[2][0] = new Persona("Rex");

        printArray(personas);

    }

    public static void printArray(Object matrix[][]){
        for(int row = 0; row < matrix.length; row++){
            for(int col = 0; col < matrix[row].length; col++ )
                System.out.println("row = " + row + ", col = " + col + ", matrix = " + matrix[row][col]);
        }
    }


}
