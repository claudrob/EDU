package my.edu.test.datastructures;

import my.edu.datastructures.LinkedList;
import my.edu.datastructures.Node;

public class TestLinkedList {

    public static void main(String[] args) {
//        testRemoveLast();
//        testPrepend();
//        testRemoveFirst();
        testGet();


    }

    private static void testGet(){
        LinkedList myLinkedList = new LinkedList(0);
        myLinkedList.append(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);

        System.out.println("Set index 2 to " + 9);
        myLinkedList.set(2, 9);
        System.out.println("Before Get ");
        printOutLinkedListDetail(myLinkedList);

        for(int i = 0; i <= 5; i++){
            Node tmp = myLinkedList.get(i);
            if(tmp != null){
                System.out.println(i + ": returned -> " + tmp.value);
            }
            else {
                System.out.println(i + ": returned -> " + tmp);

            }
        }

    }




    private static void testRemoveFirst() {
        LinkedList myLinkedList = new LinkedList(2);
        myLinkedList.append(1);
        myLinkedList.append(3);

        System.out.println("Before RemoveFirst");
        printOutLinkedListDetail(myLinkedList);


//        myLinkedList.append(10);

//        System.out.println("AFTER append");
//        printOutLinkedListDetail(myLinkedList);
//
//
        Node removedNode =  myLinkedList.removeFirst();
        System.out.println("removedNode = " + removedNode.value);
//        removedNode =  myLinkedList.removeFirst();
//        System.out.println("removedNode = " + removedNode.value);
//        removedNode =  myLinkedList.removeFirst();
//        System.out.println("removedNode = " + removedNode);


        System.out.println("AFTER Remove First");
        printOutLinkedListDetail(myLinkedList);
    }

    private static void testPrepend(){
        LinkedList myLinkedList = new LinkedList(2);
        myLinkedList.append(3);
//        myLinkedList.append(23);
//        myLinkedList.append(7);

        System.out.println("Before Prepend");
        printOutLinkedListDetail(myLinkedList);

        myLinkedList.prepend(1);
        System.out.println("AFTER Prepend of 4");
        printOutLinkedListDetail(myLinkedList);
    }

    private static void testRemoveLast() {
        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(2);

        System.out.println("Before append");
        printOutLinkedListDetail(myLinkedList);


//        myLinkedList.append(8);
//        myLinkedList.append(10);

//        System.out.println("AFTER append");
//        printOutLinkedListDetail(myLinkedList);
//
//
        Node removedNode =  myLinkedList.removeLast();
        System.out.println("removedNode = " + removedNode.value);
        removedNode =  myLinkedList.removeLast();
        System.out.println("removedNode = " + removedNode.value);
        removedNode =  myLinkedList.removeLast();
        System.out.println("removedNode = " + removedNode);


        System.out.println("AFTER Remove Last");
        printOutLinkedListDetail(myLinkedList);
    }

    private static void printOutLinkedListDetail(LinkedList myLinkedList) {
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();

        myLinkedList.printList();
    }

}