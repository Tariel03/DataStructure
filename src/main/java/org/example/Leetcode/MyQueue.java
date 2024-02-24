package org.example.Leetcode;


import java.util.Stack;

class MyQueue {
    Stack<Integer> stack;

    public MyQueue() {
        stack = new Stack<>();
    }

    public void push(int x) {
        stack.add(stack.size(),x);
    }

    public int pop() {
        return stack.remove(0);
    }

    public int peek() {
        int result = 0;
        for(int el: stack){
            result = el;
            break;
        }
        return result;
    }

    public boolean empty() {
        return stack.isEmpty();
    }
}
/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
