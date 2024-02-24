package org.example.AdjencyMatrix;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph(5);
        graph.addNode(new Node('A'));
        graph.addNode(new Node('B'));
        graph.addNode(new Node('C'));
        graph.addNode(new Node('D'));
        graph.addNode(new Node('E'));


        graph.addEdge(0,1);
        graph.addEdge(1,2);
        graph.addEdge(2,3);
        graph.addEdge(2,4);
        graph.addEdge(4,0);
        graph.addEdge(4,2);

        graph.print();


        System.out.println(graph.checkEdge(0,1));
        System.out.println(graph.checkEdge(0,2));


//        graph.depthFirstSearch(0);
        graph.breadthFirstSearch(3);

        System.out.println(Arrays.deepToString(graph.matrix));

    }
}
