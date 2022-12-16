package my.edu.test.datastructures;

import my.edu.datastructures.Graph;

public class TestGraph {

    public static  void main(String [] args){
        Graph myGraph = new Graph();

        myGraph.addVertex("A");
        myGraph.addVertex("B");
        myGraph.addVertex("C");

        myGraph.addEdge("A", "B");
        myGraph.addEdge("A", "C");
        myGraph.addEdge("B", "C");


        System.out.println("Before Remove");

        myGraph.printGraph();
        myGraph.removeEdge("A", "B");
        System.out.println("After Remove");
        myGraph.printGraph();

    }

}
