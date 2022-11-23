package my.edu.test.datastructures;

import my.edu.datastructures.BinarySearchTree;

public class TestBinarySearchTree {

    public static void main(String[] args) {
        BinarySearchTree myBST = new BinarySearchTree();

        System.out.println("root = " + myBST.root);

        myBST.insert(47);
        myBST.insert(21);
        myBST.insert(76);
        myBST.insert(18);
        myBST.insert(52);
        myBST.insert(82);

        myBST.insert(27);

        System.out.println("myBST = " + myBST.root.left.right.value);
        System.out.println("Contains 47 = " + myBST.contains(47));
        System.out.println("Contains 21 = " + myBST.contains(21));
        System.out.println("Contains 76 = " + myBST.contains(76));
        System.out.println("Contains 18 = " + myBST.contains(18));
        System.out.println("Contains 52 = " + myBST.contains(52));
        System.out.println("Contains 82 = " + myBST.contains(82));
        System.out.println("Contains 27 = " + myBST.contains(27));

        System.out.println("Contains 17 = " + myBST.contains(17));
        System.out.println("Contains 33 = " + myBST.contains(33));
        System.out.println("Contains 44 = " + myBST.contains(44));
        System.out.println("Contains 55 = " + myBST.contains(55));
        System.out.println("Contains 66 = " + myBST.contains(66));
        System.out.println("Contains 88 = " + myBST.contains(88));
    }

}
