package org.example.Leetcode.Graphs.AdjencyList.undirected;

import java.util.*;

public class LargestComponent {
    public static void main(String[] args) {
        Map<Character, List<Character>> graph = new HashMap<>();
        graph.put('0', List.of('8', '1', '5'));
        graph.put('1', List.of('0'));
        graph.put('5', List.of('0', '8' ));
        graph.put('8', List.of('0', '5' ));
        graph.put('2', List.of('3', '4' ));
        graph.put('3', List.of('2', '4' ));
        graph.put('4', List.of('3', '2' ));
        System.out.println(largest(graph));
    }
    public static int largest(Map<Character, List<Character>> graph){
        int max = 0;
        Set<Character> visited = new HashSet<>();
        for(Character node : graph.keySet()){
            int a = findSize(graph,visited, node);
            if(a > max){
                max = a;
            }

        }
        return max;

    }
    public static int findSize(Map<Character, List<Character>> graph, Set<Character> visited,
                                     Character currentNode){
        if(visited.contains(currentNode)) return 0;
        visited.add(currentNode);
        int size  = 1;
        for(Character c : graph.get(currentNode)){
            size += findSize(graph, visited,  c);
        }
        return size;


    }
}
