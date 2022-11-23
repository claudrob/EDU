package my.edu.datastructures;

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

}
