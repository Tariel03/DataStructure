package org.example.Leetcode.Graphs.AdjencyList.directed;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class HasPath {
    public static boolean  hasPathDFS(Map<Character, List<Character>> map, Character src, Character dest){
         if(src == dest) return true;
         for( Character neighbour: map.get(src)){
            if(hasPathDFS(map,neighbour,dest)) return true;
         }
         return false;

    }
    public static boolean  hasPathBFS(Map<Character, List<Character>> map, Character src, Character dest){
        if(src == dest) return true;
        Queue<Character> queue = new LinkedList<>();
        queue.add(src);
        while(!queue.isEmpty()){
            Character current = queue.poll();
            if(current == dest) return true;
            for(Character c: map.get(current)){
                queue.offer(c);
            }

        }
        return false;

    }

}
