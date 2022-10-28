package my.edu.test.datastructures;

import my.edu.datastructures.DoublyLinkedList;
import my.edu.datastructures.Node;

public class TestDoublyLinkedList {

    private static DoublyLinkedList myDLL;

    public static void main(String[] args) {


        createNewDLL(1);
        testAppend();
        testRemoveLast();
        testPrepend();
        testRemoveFirst();
        testGet();
        testSet();
        testInsert();
        testRemove();

    }

    public static void testRemoveLast(){
        System.out.println("Testing: removedLast()");
        Node removed = myDLL.removeLast();
        System.out.println("Removed = " + removed);
        printOutDLL();
        removed = myDLL.removeLast();
        System.out.println("Removed = " + removed);
        printOutDLL();
        removed = myDLL.removeLast();
        System.out.println("Removed = " + removed);
        printOutDLL();
        removed = myDLL.removeLast();
        System.out.println("Removed = " + removed);
        printOutDLL();

        removed = myDLL.removeLast();
        System.out.println("Removed = " + removed);
        printOutDLL();

    }

    private static void testPrepend(){
        System.out.println("Testing: PREPend()");
        myDLL.prepend(5);
        myDLL.prepend(6);
        myDLL.prepend(7);
        myDLL.prepend(8);
        printOutDLL();
    }

    private static void testRemoveFirst(){
        System.out.println("Test: Remove First! --> DLL Before");
        printOutDLL();
        System.out.println("Removed: " + myDLL.removeFirst());
//        System.out.println("Removed: " + myDLL.removeFirst());
//        System.out.println("Removed: " + myDLL.removeFirst());
//        System.out.println("Removed: " + myDLL.removeFirst());
//        System.out.println("Removed: " + myDLL.removeFirst());
        printOutDLL();
    }


    private static void testInsert(){
        System.out.println("Test: INSERT");

        myDLL.insert(11, 250);
        myDLL.insert(0, 200);
        myDLL.insert(4, 220);
        myDLL.insert(8, 240);


        printOutDLL();


    }

    private static void testRemove(){
        System.out.println("Test: Remove(index)");

        System.out.println("Removed: " + myDLL.remove(15));
        System.out.println("Removed: " + myDLL.remove(14));
        System.out.println("Removed: " + myDLL.remove(8));
        System.out.println("Removed: " + myDLL.remove(0));


        printOutDLL();


    }

    private static void testGet(){
        System.out.println("Test: GET");

        myDLL.prepend(8);
        myDLL.prepend(9);
        myDLL.prepend(10);
        myDLL.append(4);
        myDLL.append(3);
        myDLL.append(2);
        myDLL.append(1);
        myDLL.append(0);

        printOutDLL();
        for(int i = 0; i < 10; i++){
            System.out.println("i  = " + i  + ": " +  myDLL.get(i));
        }

    }

    public static void testSet(){
        System.out.println("Starting Test for \"Set\"");

        for(int i = 0; i <= 10; i++){
            myDLL.set(i, (i + 1) * 10);
        }
        printOutDLL();
    }



    private static void testAppend(){
        System.out.println("Testing: append()");
        myDLL.append(2);
        myDLL.append(3);
        myDLL.append(4);
        printOutDLL();


    }

    private static void createNewDLL(int value) {
        myDLL = new DoublyLinkedList(value);

        printOutDLL();
    }

    private static void printOutDLL() {
        myDLL.getHead();
        myDLL.getTail();
        myDLL.getLength();
        myDLL.printList();
    }


}
