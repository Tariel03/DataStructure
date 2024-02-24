package org.example.Leetcode;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class TreeSolution {

    public void inOrderTraversal(TreeNode root) {
        if (root != null) {
            inOrderTraversal(root.left);
            System.out.print(root.val + " ");
            inOrderTraversal(root.right);
        }
    }
    public void preOrderTraversal(TreeNode root) {
        if (root != null) {
            System.out.print(root.val + " ");
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }
    }
    public void postOrderTraversal(TreeNode root) {
        if (root != null) {
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            System.out.print(root.val + ">");
        }
    }


    public  void bfs(TreeNode root) {
        if (root == null) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        System.out.println(queue);

        while (!queue.isEmpty()) {
            TreeNode currentNode = queue.poll();
            System.out.print(currentNode.val + " ");

            if (currentNode.left != null) {
                queue.offer(currentNode.left);
            }
            if (currentNode.right != null) {
                queue.offer(currentNode.right);
            }
        }
    }

    public int maxDepth(TreeNode root) {
        int maxDepth = 0;
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int levelSize = queue.size();  // Number of nodes at the current level
            maxDepth++;
            System.out.println(queue);
            System.out.println(levelSize);

            // Process all nodes at the current level
            for (int i = 0; i < levelSize; i++) {
                TreeNode currentNode = queue.poll();
                if(currentNode != null){
                    if (currentNode.left != null) {
                        queue.offer(currentNode.left);  // Enqueue left child
                    }

                    if (currentNode.right != null) {
                        queue.offer(currentNode.right);  // Enqueue right child
                    }
                }

            }
        }
        return maxDepth;
    }


    public void levelOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int level = 0;

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            System.out.print("Level " + (level + 1) + ": ");

            for (int i = 0; i < levelSize; i++) {
                TreeNode current = queue.poll();

                if (current != null) {
                    System.out.print(current.val + " ");

                    if (current.left != null) {
                        queue.offer(current.left);
                    }

                    if (current.right != null) {
                        queue.offer(current.right);
                    }
                }
            }

            System.out.println(); // Print a newline after each level
            level++; // Increment the level for the next iteration
        }
    }






}
