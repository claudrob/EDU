package my.edu.test;

import my.edu.datastructures.LinkedList;
import my.edu.datastructures.Node;

public class TestLinkedList {

    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(4);
        System.out.println("Before append");
        printOutLinkedListDetail(myLinkedList);


//        myLinkedList.append(6);

//        myLinkedList.append(8);
//        myLinkedList.append(10);

        System.out.println("AFTER append");
        printOutLinkedListDetail(myLinkedList);

        System.out.println("AFTER Remove Last");

        Node removedNode =  myLinkedList.removeLast();
        System.out.println("removedNode = " + removedNode.value);
        printOutLinkedListDetail(myLinkedList);

    }

    private static void printOutLinkedListDetail(LinkedList myLinkedList) {
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();

        myLinkedList.printList();
    }

}
