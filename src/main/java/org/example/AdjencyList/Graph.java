package org.example.AdjencyList;

import javax.swing.plaf.nimbus.NimbusStyle;
import java.util.ArrayList;
import java.util.LinkedList;

public class Graph {
    ArrayList<LinkedList<Node>>  arrayList;
    public Graph(){
        arrayList = new ArrayList<>();
    }
    public void addNode(Node node){
        LinkedList<Node>currentList  = new LinkedList<>();
        currentList.add(node);
        arrayList.add(currentList);

    }
    public void addEdge(int src, int dest){
        LinkedList<Node>currentList  = arrayList.get(src);
        Node dstNode = arrayList.get(dest).get(0);
         currentList.add(dstNode);

    }
    public boolean checkEdge(int src, int dest){
        LinkedList<Node>currentList  = arrayList.get(src);
        Node dstNode = arrayList.get(dest).get(0);
        for (Node n :currentList) {
            if(n == dstNode){
                return true;
            }
        }
        return false;
        
    }
    public void print(){
        for (LinkedList<Node> ll:arrayList
             ) {
            for (Node node: ll) {
                System.out.print(node.data + " -> ");
            }
            System.out.println();

        }
    }

}
