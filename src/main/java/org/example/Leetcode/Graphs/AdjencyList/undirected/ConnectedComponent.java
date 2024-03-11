package org.example.Leetcode.Graphs.AdjencyList.undirected;

import java.util.*;

public class ConnectedComponent {
    public static void main(String[] args) {
        Map<Character, List<Character>> graph = new HashMap<>();
        graph.put('0', List.of('8', '1', '5'));
        graph.put('1', List.of('0'));
        graph.put('5', List.of('0', '8' ));
        graph.put('8', List.of('0', '5' ));
        graph.put('2', List.of('3', '4' ));
        graph.put('3', List.of('2', '4' ));
        graph.put('4', List.of('3', '2' ));
        System.out.println(countConnectedComponents(graph));

    }
    public static int countConnectedComponents(Map<Character, List<Character>> graph){
        Set<Character> visited = new HashSet<>();
        int counter = 0;
        for(Character c : graph.keySet()){
            if(explore(graph,c, visited)){
                counter++;
            }

        }
        return counter;
    }
    private static  boolean explore(Map<Character, List<Character>> graph,Character current, Set<Character> visited){
        if(visited.contains(current)) return false;
        visited.add(current);
        for(Character neighbor : graph.get(current)){
            explore(graph, neighbor, visited);
        }
        return true;

    }
}
