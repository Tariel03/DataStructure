package org.example.Leetcode;

import java.util.PriorityQueue;

//A heap is a specialized tree-based data structure that satisfies the heap property.
// The heap property can be of two types:
//
//1. **Min-Heap Property:**
//   - In a min-heap, for every node `i` other than the root, the value of `i` is
//   greater than or equal to the value of its parent.
//
//2. **Max-Heap Property:**
//   - In a max-heap, for every node `i` other than the root, the value of `i`
//   is less than or equal to the value of its parent.
//
//Heaps are commonly implemented as binary trees, specifically binary heaps,
// where each node has at most two children. Binary heaps are useful for efficiently
// implementing priority queues and heapsort.
//
//A priority queue is an abstract data type that provides a way to store elements
// with associated priorities and retrieve the element with the highest (or lowest) priority efficiently. Priority queues can be implemented using various data structures, and one common choice is a binary heap.
//
//Key operations on a priority queue implemented with a heap include:
//
//- **Insertion (enqueue):** Add an element with a specified priority to the queue.
//- **Deletion (dequeue):** Remove the element with the highest (or lowest) priority from the queue.
//- **Peek:** Retrieve the element with the highest (or lowest) priority without removing it.
//
//In Java, the `PriorityQueue` class is often used to implement a priority queue,
// and it is based on a min-heap by default. However, you can use a custom comparator to
// create a max-heap behavior.
//
//Here's a simple example in Java:

public class PriorityQueueExample {
    public static void main(String[] args) {
        // Creating a min-heap (default behavior)
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.add(4);
        minHeap.add(2);
        minHeap.add(8);
        minHeap.add(1);
        System.out.println("Min-Heap: " + minHeap);  // Output: [1, 2, 8, 4]

        // Creating a max-heap using a custom comparator
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
        maxHeap.add(4);
        maxHeap.add(2);
        maxHeap.add(8);
        maxHeap.add(1);


        System.out.println(maxHeap.peek());
        System.out.println("Max-Heap: " + maxHeap);  // Output: [8, 4, 2, 1]


        System.out.println(maxHeap.remove());
        System.out.println("Max-Heap: " + maxHeap);  // Output: [8, 4, 2, 1]
    }
}

//
//
//In this example, the default `PriorityQueue` creates a min-heap.
// To create a max-heap, a custom comparator `(a, b) -> b - a` is used
// when creating the `PriorityQueue`.


