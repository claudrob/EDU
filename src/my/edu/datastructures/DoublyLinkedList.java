package my.edu.datastructures;

public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int length;

    public DoublyLinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printList(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getHead(){
        if(head == null){
            System.out.println("Head: " + null);
        }
        else{
            System.out.println("Head:" + head.value );
        }
    }

    public void getTail(){
        if(tail == null){
            System.out.println("Tail: " + tail);
        }
        else{
            System.out.println("Tail: " + tail.value);
        }
    }

    public void getLength(){
        System.out.println("length = " + length);
    }
}
