package my.edu.leetcode;

import java.math.BigInteger;

public class Solution {

    public static  ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        String strValue1 = "";
        String strValue2 = "";
        ListNode result = null;
        long val1 =0;
        long  val2 = 0;
        long resultNumber = 0;
        BigInteger bigInteger1;
        BigInteger bigInteger2;

        //value 1
        strValue1 = l1.val + strValue1;
        while (l1.next != null ){
            ListNode tmp = l1.next;
            strValue1 = tmp.val + strValue1;
            l1.next = tmp.next;
        }


        // value 2
        strValue2 = l2.val + strValue2;
        while (l2.next != null ){
            ListNode tmp = l2.next;
            strValue2 = tmp.val + strValue2;
            l2.next = tmp.next;
        }

        bigInteger1 = new BigInteger(strValue1);
//        val1 = Long.parseLong(strValue1);
        System.out.println("val1 = " + bigInteger1.toString());

        bigInteger2 = new BigInteger(strValue2);
//        val2 = Long.parseLong(strValue2);
        System.out.println("val2 = " + bigInteger2.toString());

//        resultNumber = val1 + val2;
        BigInteger resultBI = bigInteger1.add(bigInteger2);
        System.out.println("resultNumber = " + resultBI.toString());

        //result
//        String resultStr = Long.toString(resultNumber);
        String resultStr = resultBI.toString();
        System.out.println("resultStr = " + resultStr);

        for(int i = 0; i < resultStr.length() ;  i++){
//            System.out.println("i = " + i);
//            System.out.println("resultStr.charAt(i) = " + resultStr.charAt(i ));
            result = new ListNode(Integer.parseInt(resultStr.charAt(i ) + "") , result);

        }
        return result;

    }

    public static  void printListNode(ListNode listNode){
        System.out.println("printListNode");
        int val = listNode.val;
        System.out.println("val = " + val);
        while(listNode.next != null){
            listNode = listNode.next;
            val = listNode.val;

            System.out.println("val = " + val);

        }

    }

    public static void main(String[] args) {

        ListNode listNode1 = new ListNode(3);
        ListNode listNode2 = new ListNode(4, listNode1);
        ListNode listNode3 = new ListNode(2, listNode2);
        System.out.println("Input 1: ");
        printListNode(listNode3);

        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(6, listNode4);
        ListNode listNode6 = new ListNode(5, listNode5);
        System.out.println("Input 2: ");
        printListNode(listNode6);

        ListNode solution = addTwoNumbers(listNode3, listNode6);

        System.out.println("Solution");
        printListNode(solution);



//        listNode1.next = new ListNode(4);
//        listNode1 = listNode1.next;
//        listNode1.next = new ListNode(3);


    }

}
