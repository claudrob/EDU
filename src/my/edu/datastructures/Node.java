package my.edu.datastructures;

public class Node {
    public int value;
    public Node next;
    public Node prev;

    public Node(int value){
        this.value = value;
    }

    public String toString(){
        return "Value: " + value;
    }
}
