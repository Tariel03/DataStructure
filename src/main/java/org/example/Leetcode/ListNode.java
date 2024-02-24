package org.example.Leetcode;

public class ListNode {
    int val;
    ListNode next;
    public ListNode(int val, ListNode next){
        this.val = val;
        this.next = next;
    }
    public ListNode(int val){
        this.val = val;
        this.next = null;
    }
    ListNode() {}

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                '}';
    }
}
