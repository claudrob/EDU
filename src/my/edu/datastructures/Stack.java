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


    public void push(int value){
        Node newNode = new Node(value);
        if(height == 0){
            top = newNode;
        }else {
            newNode.next = top;
            top = newNode;
        }
        height++;
    }

    public Node pop(){
        if(height == 0) return null;

        Node temp = top;
        top = top.next;
        temp.next = null;

        height--;
//        if(height == 0){
//            top = null;
//        }
        return temp;
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
