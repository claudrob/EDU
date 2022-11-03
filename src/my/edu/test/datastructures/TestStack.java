package my.edu.test.datastructures;

import my.edu.datastructures.Stack;

public class TestStack {

    private static Stack myStack;

    public static void main(String[] args) {
        testStackCreation();
        testPush();
        testPop();
    }

    private static void testPush(){
        System.out.println("------------testPush------------");
        myStack.push(3);
        myStack.push(2);
        myStack.push(1);
        myStack.push(0);
        printStackDetails();

    }


    private static void testPop(){
        System.out.println("------------test POP ------------");
        System.out.println("POP: " + myStack.pop());
        System.out.println("POP: " + myStack.pop());
        System.out.println("POP: " + myStack.pop());
        System.out.println("POP: " + myStack.pop());
        System.out.println("POP: " + myStack.pop());
        System.out.println("POP: " + myStack.pop());
        printStackDetails();
    }


    private static void testStackCreation() {
        myStack = new Stack(4);

        printStackDetails();
    }

    private static void printStackDetails() {
        myStack.getTop();
        myStack.getHeight();

        myStack.printStack();
    }

}
