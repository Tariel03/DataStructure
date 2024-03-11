package org.example.Leetcode.Graphs.AdjencyList.directed;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class DFS {

    public static void main(String[] args) {
        Map<Character, List<Character>> map = new HashMap<>();
        map.put('a' , List.of('b','c'));
        map.put('b', List.of('d'));
        map.put('c', List.of('e'));
        map.put('d', List.of('f'));
        map.put('e', List.of());
        map.put('f', List.of());
        dfsWithStack(map,'a');
        System.out.println();
        dfs(map, 'a');


    }

    public static void dfsWithStack(Map<Character, List<Character>> graph, Character source){
        Stack<Character> stack = new Stack<>();
        stack.push(source);
        while (!stack.isEmpty()){
           Character current =  stack.pop();
            System.out.println(current);
            for (Character neighbour : graph.get(current)){
                stack.push(neighbour);
            }

        }
    }
    public static void dfs(Map<Character, List<Character>> graph, Character source){
        System.out.println(source);
       for (Character neighbour : graph.get(source)){
           dfs(graph, neighbour);
       }
    }
}
