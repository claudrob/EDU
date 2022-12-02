package my.edu.datastructures;

public class Node {
    public int value;
    public Node next;
    public Node prev;

    //Binary Search Tree
    public Node left;
    public Node right;

    //HashTable
    public String key;

    public Node(int value){
        this.value = value;
    }

    public Node(String key, int value){
        this.key = key;
        this.value = value;
    }

    public String toString(){
        return "Value: " + value;
    }
}
