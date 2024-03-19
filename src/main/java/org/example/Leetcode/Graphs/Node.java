package org.example.Leetcode.Graphs;

public class Node {
    private Character node;
    private int value;

    public Node(Character node, int value) {
        this.node = node;
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Character getNode() {
        return node;
    }

    public void setNode(Character node) {
        this.node = node;
    }
}
