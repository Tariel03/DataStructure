package org.example.Leetcode.Graphs.AdjencyList.undirected;

import org.example.Leetcode.Graphs.Node;

import java.util.*;

public class ShortestPath {
    public static void main(String[] args) {
        List<List<Character>> edges =
                List.of(List.of('w', 'x'), List.of('x', 'y'), List.of('z', 'y')
                , List.of('z', 'v'), List.of('w', 'v'));
        System.out.println(buildGraph(edges));
        System.out.println((shortestPath(edges, 'w', 'z')));

    }
    public static int shortestPath(List<List<Character>> edges, Character nodeA, Character nodeB) {
        Map<Character, List<Character>> graph = buildGraph(edges);
        Queue<Node> queue = new LinkedList<>();
        Set<Character> visited = new HashSet<>();
        queue.add(new Node(nodeA, 0));
        visited.add(nodeA);

        while (!queue.isEmpty()) {
            Node node = queue.poll();
            if (node.getNode() == nodeB)
                return node.getValue();

            for (Character neighbor : graph.get(node.getNode())) {
                if (!visited.contains(neighbor)) {
                    queue.add(new Node(neighbor, node.getValue() + 1));
                    visited.add(neighbor);
                }
            }
        }

        // If nodeB is not reachable from nodeA
        return -1;
    }
    public static Map<Character , List<Character>> buildGraph(List<List<Character>> edges){
        Map<Character , List<Character>> graph = new HashMap<>();
        for(List<Character> edge : edges){
            Character a = edge.get(0);
            Character b = edge.get(1);
            if(!graph.containsKey(a)){
                graph.put(a, new ArrayList<>());
            }
            if(!graph.containsKey(b)){
                graph.put(b, new ArrayList<>());
            }
            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        return graph;
    }
}
