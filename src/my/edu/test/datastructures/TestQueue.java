package my.edu.test.datastructures;

import my.edu.datastructures.Queue;

public class TestQueue {

    private static Queue myQueue;

    public static void main(String[] args) {
        testConstructor();
        testEnqueue();
        testDequeue();
    }

    private static void testConstructor() {
        myQueue = new Queue(7);
        printQueueDetails();
    }

    private static void testEnqueue(){
        System.out.println("------------------ Testing ENQUEUE ------------------");
        myQueue.enqueue(8);
        myQueue.enqueue(9);
        myQueue.enqueue(10);
        myQueue.enqueue(11);
        printQueueDetails();
    }

    private static void testDequeue(){
        System.out.println("------------------ Testing DE - QUEUE ------------------");
        System.out.println("DE-Queue: " + myQueue.dequeue());
        System.out.println("DE-Queue: " + myQueue.dequeue());
        System.out.println("DE-Queue: " + myQueue.dequeue());
        System.out.println("DE-Queue: " + myQueue.dequeue());
        System.out.println("DE-Queue: " + myQueue.dequeue());
        System.out.println("DE-Queue: " + myQueue.dequeue());
        printQueueDetails();
    }

    private static void printQueueDetails() {
        myQueue.getFirst();
        myQueue.getLast();
        myQueue.getLength();
        myQueue.printQueue();
    }

}
