package my.edu.test.datastructures;

import my.edu.datastructures.DoublyLinkedList;

public class TestDoublyLinkedList {

    public static void main(String[] args) {
        DoublyLinkedList myDLL = new DoublyLinkedList(7);

        myDLL.getHead();
        myDLL.getTail();
        myDLL.getLength();
        myDLL.printList();
    }
}
