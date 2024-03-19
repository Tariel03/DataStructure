package org.example.Leetcode;


import org.example.Leetcode.DynamicProgramming.Tribonacci;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//
//        for (int i = 0; i < 10; i++) {
//            System.out.println(stack.search(0));
//        }
//
//        Queue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
//        queue.offer(1);
//        queue.offer(12);
//        queue.offer(3);
//        queue.offer(5);
//        while (!queue.isEmpty()){
//            System.out.println(queue.poll());
//        }
//        char[] a= new char[1];
//        String ab = "1234";
//        boolean aa = Long.parseLong("12") > 45;
//        List<Integer> list = new ArrayList<>();
//        MyQueue myQueue = new MyQueue();
//        myQueue.push(1);
//        myQueue.push(2);
//        System.out.println(myQueue.list);
//        System.out.println(myQueue.peek());
//        System.out.println(myQueue.pop());


        TreeNode node = new TreeNode(0);
        node.right = new TreeNode(2);
        node.right.right = new TreeNode(3);
        node.right.left = new TreeNode(4);

        node.left =  new TreeNode(1);
        node.left.right = new TreeNode(5);
        node.left.left = new TreeNode(6);
        node.left.left.left = new TreeNode(7);

//
//
//        TreeSolution treeSolution = new TreeSolution();
//        treeSolution.inOrderTraversal(node);
//        System.out.println();
//        treeSolution.postOrderTraversal(node);
//        System.out.println();
//        treeSolution.preOrderTraversal(node);




//        Queue<ListNode> queue = new LinkedList<>();
//        ListNode listNode = new ListNode(1);
//        listNode.next = new ListNode(1);
//        listNode.next.next = new ListNode(2);
//        queue.offer(listNode);
//        System.out.println(queue);
        int[]second = new int[]{4,6};

//        solution.merge(first,2,seco
//        nd,2);
//
//        System.out.println(solution.removeDuplicates(first));
//
//        int[] second1 = second;
//        second1[0] = 1;
//        System.out.println(Arrays.toString(second));
//
//        System.out.println(solution.mergeAlternately("abc", "def3"));
//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        if(list.contains(1)){
//            list.remove((Integer) 1);
//        }
//        Collections.sort(list);
//
//        BitWise bitWise = new BitWise();
//        bitWise.and(2,3);
//
//        bitWise.leftShift(5,2);
//        bitWise.rightShift(20,2);


//        Stack<Character> stack1 = new Stack();
//        stack1.push('1');
//        stack1.push('2');
//        stack1.push('3');
//        stack1.push('4');
//        List<Character> list = new ArrayList<>(stack1);
//        StringBuilder builder = new StringBuilder();
//        String s = "new";
//
//        StringBuilder stringBuilder = new StringBuilder();
//
//
//        List<Integer> list1 = new ArrayList<>();
//        List<Integer> list2 = new ArrayList<>();
//
//        List<List<Integer>> listList = new ArrayList<>();
//
//        list1.add(10);
//        list2.add(10);
//        listList.add(list1);
//        Collections.sort(list1);
//
//        System.out.println(listList.contains(List.of(10)));
//        System.out.println(list1.equals(list2));
//
//
//        Solution solution = new Solution();
//        int[]er = new int[]{-1,0,1,2,-1,-4};
//        System.out.println(solution.threeSum(er));
//       TwoIntegers plus  = (a1,b1)  -> a1+b1;
//        double result  = plus.operator(10,12);
//
//        TwoIntegers divide  = (a1,b1) -> {
//            if(b1 == 0){
//                throw new ArithmeticException("You can't divide by 0");
//            }
//            return a1/b1;
//        };
//        result = divide.operator(10.0,23);
//        System.out.println(result);
//
//        System.out.println(solution.validPalindrome("abca"));
//
//        int a = 'Z';
//        char c = 65;
//        System.out.println(a);
//
//        System.out.println(solution.toLowerCase("Hello@[]"));
//
//        MyQueue myQueue = new MyQueue();
//        myQueue.push(1);
//        myQueue.push(2);
//        System.out.println(myQueue.peek());
//        System.out.println(myQueue.pop());
//        System.out.println(myQueue.empty());
        Solution solution= new Solution();


        System.out.println(Arrays.toString(solution.shortestToChar("acono", 'o')));



        String s = "Hello, my name is John";
        String[] result = s.split(" ");
        System.out.println(Arrays.toString(result));
        Map<String, Integer> map = new HashMap<>();
        String[] words = {
                "abc","car","ada","racecar","cool"
        };
        System.out.println(solution.firstPalindrome(words));
        List<Integer> list = new ArrayList<>();
        String ss = "aeiouAEIOU";

        int[] a= {
                1,3,4,8,7,9,3,5,1
        };


        Map<Integer, Integer> map1 = new HashMap<>();
        for(int num : a){
            map1.put(num, map1.getOrDefault(num, 0) + 1);
        }
        System.out.println(map1.keySet());

        System.out.println(map1.values());

        Solution2 s2 = new Solution2();
        List<Integer> sums = new ArrayList<>();
        TreeNode treeNode = new TreeNode();
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(3);
        treeNode.left.left = new TreeNode(4);
        treeNode.left.left.left = new TreeNode(5);
        treeNode.left.left.right = new TreeNode(6);
        treeNode.right.left = new TreeNode(7);
        treeNode.right.right = new TreeNode(7);

        sums  = s2.allPossiblePathSums(treeNode);
        System.out.println(sums);

        Tribonacci tribonacci = new Tribonacci();
        System.out.println(tribonacci.tribonacci(5));
        System.out.println(tribonacci.memoTribonacci(235, new HashMap<>()));


        int aa = Integer.parseInt("011",2);
        System.out.println(aa);



    }
}



