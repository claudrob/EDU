package my.edu.datastructures;

import my.edu.oop.package1.A;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
     public Node root;

     public boolean insert(int value){
          //1. Create new node
          Node newNode = new Node(value);

          // Edge case - empty tree.
          if(root == null){
               root = newNode;
               return true;
          }
          //Var to move through tree
          Node temp = root;

          // loop through the BST to find correct location.
          while (true){
               // Edge case -> Node already in tree. Cannot insert duplicates.
               if(newNode.value == temp.value) return false;

               //If < left else > right
               //LEFT
               if(newNode.value < temp.value){
                    // if null insert newNode else move to next
                    if(temp.left == null){
                         temp.left = newNode;
                         return true;
                    }
                    else{
                         temp = temp.left;
                    }
               }else{//RIGHT
                    // if null insert newNode else move to next
                    if(temp.right == null){
                         temp.right = newNode;
                         return true;
                    }else{
                         temp = temp.right;
                    }
               }
          }
     }


     public boolean contains(int value){
//          if(root == null) return false;
          Node temp = root;

          while(temp != null){
               if(value < temp.value){
                    temp = temp.left;
               }else if(value > temp.value){
                    temp = temp.right;
               }
               else if(value == temp.value)
                    return true;
          }

          return false;
     }

     public ArrayList<Integer> BFS(){
          Node currentNode = this.root;
          Queue<Node> queue = new LinkedList<>();
          ArrayList<Integer> results = new ArrayList<>();
          queue.add(currentNode);

          while(queue.size() > 0){
               currentNode = queue.remove();
               results.add(currentNode.value);

               if(currentNode.left != null){
                    queue.add(currentNode.left);

               }
               if(currentNode.right != null){
                    queue.add(currentNode.right);
               }
          }

          return results;
     }


     public ArrayList<Integer> DFSPreOrder(){
          ArrayList<Integer> results = new ArrayList<>();

          class Traverse{
               Traverse(Node currentNode){
                    results.add(currentNode.value);
                    if(currentNode.left != null ){
                         new Traverse(currentNode.left);
                    }
                    if(currentNode.right != null){
                         new Traverse(currentNode.right);
                    }
               }

          }
          new Traverse(root);

          return results;
     }

     public ArrayList<Integer> DSFPostOrder(){
          ArrayList<Integer> results = new ArrayList<>();

          class Traverse{
               Traverse(Node currentNode){
                    if(currentNode.left != null){
                         new Traverse(currentNode.left);
                    }
                    if(currentNode.right != null){
                         new Traverse(currentNode.right);
                    }
                    results.add(currentNode.value);
               }
          }
          new Traverse(root);
          return results;
     }
     public ArrayList<Integer> DSFInOrder(){
          ArrayList<Integer> results = new ArrayList<>();

          class Traverse{
               Traverse(Node currentNode){
                    if(currentNode.left != null){
                         new Traverse(currentNode.left);
                    }
                    results.add(currentNode.value);

                    if(currentNode.right != null){
                         new Traverse(currentNode.right);
                    }
               }
          }
          new Traverse(root);
          return results;
     }

}
