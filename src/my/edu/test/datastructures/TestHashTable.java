package my.edu.test.datastructures;

import my.edu.datastructures.HashTable;

import java.util.ArrayList;

public class TestHashTable {

    public static void main(String [] args){
        HashTable hashTable = new HashTable();
        hashTable.set("paint", 20);
        hashTable.set("nails", 100);
        hashTable.set("tile", 50);
        hashTable.set("lumber", 80);

        hashTable.set("bolts", 200);
        hashTable.set("screws", 140);



        hashTable.printTable();
        System.out.println("Testing Get:");
        System.out.println("Testing Get: lumber = " + hashTable.get("lumber"));
        System.out.println("Testing Get: nails = " + hashTable.get("nails"));
        System.out.println("Testing Get: tile = " + hashTable.get("tile"));
        System.out.println("Testing Get: bolts = " + hashTable.get("bolts"));
        System.out.println("Testing Get: screws = " + hashTable.get("screws"));
        System.out.println("Testing Get: hammers = " + hashTable.get("hammers"));

        ArrayList<String> keys = hashTable.keys();
        System.out.println("keys = " + keys);

    }
}
