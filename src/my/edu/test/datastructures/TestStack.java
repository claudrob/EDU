package my.edu.test.datastructures;

import my.edu.datastructures.Stack;

public class TestStack {

    public static void main(String[] args) {
        Stack myStack = new Stack(4);

        myStack.getTop();
        myStack.getHeight();

        myStack.printStack();
    }

}
