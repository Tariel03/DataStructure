package org.example.Leetcode.Graphs.AdjencyList.directed;

import java.util.*;

public class BFS {
    public static void main(String[] args) {
        Map<Character, List<Character>> map = new HashMap<>();
        map.put('a' , List.of('b','c'));
        map.put('b', List.of('d'));
        map.put('c', List.of('e'));
        map.put('d', List.of('f'));
        map.put('e', List.of());
        map.put('f', List.of());
        bfsWithQueue(map,'a');
//        bfsWithQueue(map,'a');

    }
    public static void bfsWithQueue(Map<Character, List<Character>> map, Character source){
        Queue<Character> q = new LinkedList<>();
        q.add(source);
        while (!q.isEmpty()){
            Character current = q.poll() ;
            System.out.println(current);
            for(Character neighbour: map.get(current)){
                q.offer(neighbour);
            }
        }
    }


}
