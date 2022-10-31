package my.edu.datastructures;

public class Stack {


    //    private Node bottom;
    private int height;
    private Node top;

    public Stack(int value){
        Node newNode = new Node(value);
        top = newNode;
        height = 1;

    }

    public Node pop(){
        //Todo
        return new Node(0);
    }

    public void push(int value){

    }

    public void printStack(){
        Node temp = top;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getTop(){
        if(top == null){
            System.out.println("Top: " + top);
        }else{
            System.out.println("Top:" + top.value);
        }
    }

    public void getHeight(){
        System.out.println("Height:" + height);
    }


}
