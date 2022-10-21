package my.edu.datastructures;

public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

    public LinkedList(int value) {
        // create new Node
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void append(int value) {
        // create new Node
        // add node to end
        //move tail
        Node newNode = new Node(value);

//        if(head == null && tail == null){
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;

    }

    public void prepend(int value) {
        // create new Node
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        length++;

    }


    public Node removeFirst() {
        if (length == 0) return null;

        Node tmpNode = head;
        head = head.next;
        tmpNode.next = null;
        length--;
//        if(length == 1){
//            tail = head;
//        }
        if (length == 0) {
            tail = null;
        }
        return tmpNode;
    }

    public Node removeLast() {

        if (length == 0) {
            return null;
        }

        Node tmpNode = head;
        Node preNode = head;


        if (length == 1) {
//            tmpNode = head;
            head = null;
            tail = null;
            length--;
            return tmpNode;
        } else {

            // find the second last
            while (tmpNode.next != null) {

                preNode = tmpNode;
                tmpNode = tmpNode.next;
            }
            tail = preNode;
            tail.next = null;
            length--;
        }
        return tmpNode;
    }

    public Node get(int index) {
        if (length < 0 || index >= length) {
            return null;
        }
        Node tmpNode = head;
        int counter = 0;
        // can use For loop
        while (tmpNode != null && counter < index) {
            counter++;
            tmpNode = tmpNode.next;

        }
        return tmpNode;

    }

//    public boolean set(int index, int value){
//        if(index < 0 || index >= length){
//            return false;
//        }
//        Node temp = head;
//
//        for(int i = 0; i < index; i++){
//            temp = temp.next;
//        }
//        temp.value = value;
//        return true;
//    }

    public boolean set(int index, int value) {
        Node temp = get(index);
        boolean result = false;
        if (temp != null) {
            temp.value = value;
            result = true;
        }
        return result;
    }


    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public boolean insert(int index, int value) {
        if (index < 0 || index > length) return false;
        if (index == 0) {
            prepend(value);
            return true;
        }
        if (index == length) {
            append(value);
            return true;

        }
        Node newNode = new Node(value);
        Node tempNode = get(index - 1);

        newNode.next = tempNode.next;
        tempNode.next = newNode;
        length++;
        return true;
    }

    public Node remove(int index){
        if(index < 0 || index >= length) return null;
        if(index == 0){
            return removeFirst();
        }
        if(index == (length - 1)){
            return removeLast();
        }
        Node previous = get(index - 1);
        Node temp = previous.next;

        previous.next = temp.next;
        temp.next = null;
        length--;
        return temp;
    }

    public void getHead() {
        if (head == null) {
            System.out.println("Head: null");
        } else {
            System.out.println("Head: " + head.value);

        }
    }

    public void getTail() {
        if (tail == null) {
            System.out.println("Tail: null");
        } else {

            System.out.println("Tail: " + tail.value);
        }
    }

    public void reverse(){
        Node temp = head;
        head = tail;
        tail = temp;

        Node after = temp.next;
        Node before = null;

        for(int i = 0; i < length; i++){
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }


    }

    public void getLength() {
        System.out.println("Length: " + length);
    }
}
