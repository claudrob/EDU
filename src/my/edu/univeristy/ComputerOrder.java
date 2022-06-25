package my.edu.univeristy;

public class ComputerOrder {

    private final int orderID;
    private Computer computers[];
    private int computerCount;
    private final int MAX_COMPUTERS = 10;

    private static int orderCounter;

    public ComputerOrder(){

        orderID = ++ComputerOrder.orderCounter;
        computers = new Computer[MAX_COMPUTERS];
    }

    public void addComputer(Computer computer){
        if(this.computerCount < MAX_COMPUTERS){
            computers[this.computerCount++] = computer;
        }
        else
        {
            System.out.println("Max number of computers have been exceeded.");
        }
    }

    public void showOrder(){
        System.out.println("orderID = " + orderID);
        System.out.println("Computers in order");
        for(int i = 0; i < this.computers.length; i++){
            System.out.println("i = " + i + ": Computer: " + computers[i]);
        }
    }


}
