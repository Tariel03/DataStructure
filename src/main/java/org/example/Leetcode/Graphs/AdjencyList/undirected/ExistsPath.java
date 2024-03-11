package org.example.Leetcode.Graphs.AdjencyList.undirected;

import java.util.*;

public class ExistsPath {
    public static void main(String[] args) {
        List<List<Character>> edges = List.of(
                List.of('i', 'j'), List.of('k', 'i'), List.of('m','k'),
                List.of('k', 'l'), List.of('o', 'n')
        );
        System.out.println(buildGraph(edges));

        System.out.println(existsPath(edges, 'k', 'l'));
    }
    public static boolean existsPath(List<List<Character>> edges, Character nodeA, Character nodeB){
        Map<Character, List<Character>> map = buildGraph(edges);
        return dfs(map,new HashSet<>(), nodeA, nodeB);


    }

    private static boolean dfs(Map<Character, List<Character>> map, Set<Character> visited, Character src, Character dest){
        if(src == dest) return true;
        if(visited.contains(src)) return false;
        visited.add(src);
        for(Character neighbour : map.get(src)){
                if(dfs(map,visited,  neighbour, dest)) return true;
        }
        return false;
    }
    private static Map<Character, List<Character>> buildGraph(List<List<Character>> edges){
        Map<Character, List<Character>> map = new HashMap<>();
        for(List<Character> edge : edges){
            Character a = edge.get(0);
            Character b = edge.get(1);
            if(!map.containsKey(a)) {
                map.put(a,new ArrayList<>());
            }
            if(!map.containsKey(b)){
                map.put(b, new ArrayList<>());
            }
            map.get(a).add(b);
            map.get(b).add(a);
        }
        return map;
    }

}
