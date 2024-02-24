package org.example.Leetcode;

import java.math.BigInteger;
import java.util.*;

class Solution {
    public int[] plusOne(int[] digits) {
        if (digits[digits.length - 1] != 9) {
            digits[digits.length - 1] = digits[digits.length - 1] + 1;
            return digits;
        } else {
            int[] new_digits = new int[digits.length + 1];
            for (int i = 0; i < new_digits.length - 2; i++) {
                new_digits[i] = digits[i];
            }
            new_digits[new_digits.length - 2] = 1;
            new_digits[new_digits.length - 1] = 0;
            return new_digits;

        }


    }

    public int addDigits(int num) {
        String number = String.valueOf(num);
        char[] chars = number.toCharArray();
        int result = 0;
        for (Character character : chars) {
            result += Integer.parseInt(String.valueOf(character));
        }
        number = String.valueOf(result);
        if (number.length() == 1) {
            return result;
        } else return addDigits(result);

    }

    public boolean isHappy(int n) {
        char[] numbers = String.valueOf(n).toCharArray();
        int result = 0;
        for (Character c : numbers) {
            result += (int) Math.pow(Integer.parseInt(String.valueOf(c)), 2);
        }
        System.out.println(result);
        if (result == 1) {
            return true;
        } else if (result < 6) {
            return false;
        } else return isHappy(result);

    }

    public boolean isUgly(int n) {
        System.out.println(n % 2);

        if (n < 1) {
            return false;
        }
        if (n / 2 == 3 || n / 2 == 5 || n / 2 == 0) {
            return true;
        } else if (n / 3 == 2 || n / 3 == 5 || n / 3 == 0) {
            return true;
        } else if (n / 5 == 3 || n / 5 == 2 || n / 5 == 0) {
            return true;
        } else {
            return false;
        }

    }

    public void reverseString(char[] s) {
        char temp;
        int n = s.length;
        for (int i = 0; i <= Math.floor((double) (n - 2) / 2); i++) {
            temp = s[i];
            s[i] = s[n - i - 1];
            s[n - i - 1] = temp;

        }

// function reverse_in_place(a[0..n-1])
//     for i from 0 to floor((n-2)/2)
//         tmp := a[i]
//         a[i] := a[n − 1 − i]
//         a[n − 1 − i] := tmp

    }


    public int majorityElement(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] == nums[j]) {
                    sum++;
                }
            }
            if (sum >= nums.length / 2) {
                result = nums[i];
                break;
            }

        }
        return result;
    }

    public String longestCommonPrefix(String[] strs) {
        String result = "";
        for (int i = 0; i < strs.length; i++) {
            for (int j = i + 1; j < strs.length; i++) {
                result = "";
                for (int k = 0; k < strs[i].length(); k++) {
                    if (strs[i].charAt(k) == strs[j].charAt(k)) {
                        result += strs[i].charAt(k);
                    }
                }
            }
        }
        return result;
    }

    public int singleNumber(int[] nums) {
        System.out.println(Arrays.toString(nums));
        int num = -1;
        if (nums.length == 1) {
            return nums[0];
        }
        int value = 0;
        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    value++;
                }
                System.out.print("I " + nums[i]);
                System.out.println(" J " + nums[j]);
            }
            if (value == 0) {
                num = nums[i];
                break;
            }
        }
        return num;
    }

    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;

        // HashSet<Integer> set = new HashSet<>();
        //
        //        for (int num : array) {
        //            if (!set.add(num)) {
        //                // If the set returns false, it means the element is already present
        //                return true; // Array has duplicates
        //            }
        //        }
        //
        //        return false; // No duplicates found


    }

    //    public boolean isPalindrome(String s) {
//        s = s.replace(" ", "");
//        String non_alph = " ,.!:;@#$%^&*()_+]['?";
//        StringBuilder builder = new StringBuilder(s);
//        for(int i = 0;i<builder.length(); i++){
//            if(non_alph.contains(String.valueOf(builder.charAt(i)))){
//                System.out.println(builder.deleteCharAt(i));
//                i = 0;
//            }
//        }
//        String a = builder.toString();
//        String b = String.valueOf(builder.reverse());
//        System.out.println(a);
//        System.out.println(b);
//        return a.equalsIgnoreCase(b);
//    }
    public boolean isPalindrome(String s) {
        String non_alph = " ,.!:;@#$%^&*()_+][[]'?{}/\\";
        s = s.replace("\"", " ");
        for (int i = 0; i < s.length(); i++) {
            if (non_alph.contains(String.valueOf(s.charAt(i)))) {
                s = s.replace(String.valueOf(s.charAt(i)), "");
                i = 0;
            }
        }
        String a = s;
        String b = new StringBuilder(s).reverse().toString();
        System.out.println(a);
        System.out.println(b);
        return a.equalsIgnoreCase(b);
    }

    public String reformatDate(String date) {
        String[] data = date.split("");
        StringBuilder answer = new StringBuilder();
        List<String> months = List.of("Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"
        );
        for (int i = data.length - 1; i >= 0; i--) {
            if (i == data.length - 1) {
                answer.append(data[i]);
                answer.append('-');
            } else if (i == 1) {
                if (months.indexOf(data[i]) + 1 < 10) {
                    answer.append('0');
                    answer.append(months.indexOf(data[i]) + 1);
                    answer.append('-');
                } else {
                    answer.append(months.indexOf(data[i]) + 1);
                    answer.append('-');
                }

            } else {
                if (data[i].length() == 3) {
                    answer.append('0');
                    answer.append(data[i].charAt(0));
                } else {
                    answer.append(data[i].charAt(0));
                    answer.append(data[i].charAt(1));

                }

            }
        }
        return answer.toString();
    }

    public int searchInsert(int[] nums, int target) {
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                counter = i;
                break;
            } else if (nums[i] < target) {
                counter = i + 1;
            }
        }
        return counter;

    }

    public String addBinary(String a, String b) {
        BigInteger bigInteger = new BigInteger(a, 2);
        BigInteger bigInteger1 = new BigInteger(b, 2);
        return Integer.toBinaryString(bigInteger1.add(bigInteger).intValue());

    }

    public String myAddBinary(String a, String b) {
        int[] numbers = new int[2];
        int value = 0, value1 = 0;
        for (int i = a.length() - 1; i >= 0; i--) {
            if (a.charAt(i) == '1') {
                value += (int) Math.pow(2, a.length() - 1 - i);
            }
        }
        for (int i = b.length() - 1; i >= 0; i--) {
            if (b.charAt(i) == '1') {
                value1 += (int) Math.pow(2, a.length() - 1 - i);
                System.out.println(value1);
            }
        }
        System.out.println(value);
        System.out.println(value1);
        System.out.println(value + value1);
        return makeBinary(value + value1);


    }

    private String makeBinary(int decimalNumber) {
        StringBuilder binaryNumber = new StringBuilder();
        while (decimalNumber != 0) {
            if (decimalNumber % 2 == 1) {
                binaryNumber.append('1');
                decimalNumber = (decimalNumber - 1) / 2;
            } else {
                binaryNumber.append("0");
                decimalNumber /= 2;
            }
        }
        return binaryNumber.reverse().toString();

    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        return (p.left.val == q.left.val && p.right.val == q.right.val);

    }

    public int findGCD(int[] nums) {
        int max = -100000;
        int min = 100000;
        for (int num : nums) {
            if (max < num) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        System.out.println(max);
        System.out.println(min);
        return GCD(min, max);
    }

    private int GCD(int a, int b) {
        int gcd = 1;
        for (int i = 1; i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }


    public double myPow(double x, int n) {
        double result = 1;
        if (n >= 0) {
            for (int i = 1; i <= n; i++) {
                result *= x;
                if (result == 0) {
                    break;
                }
            }
        } else {
            for (int i = 0; i > n; i--) {
                result *= x;
                if (result == 0) {
                    break;
                }
            }
            result = 1 / result;
        }

        return result;
    }

    public int findSpecialInteger(int[] arr) {
        int value = 0;
        if (arr.length == 1) {
            return arr[0];
        }
        for (int i = 0; i < arr.length; i++) {
            double repeat = 0;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    repeat++;
                }
            }
            if (repeat > 1) {
                System.out.println(repeat);
            }

            if (repeat >= Math.floor((double) arr.length / 4)) {
                value = arr[i];
                break;
            }
        }
        return value;
    }

    public boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        set.add(head);
        while (head != null) {
            if (set.contains(head)) {
                return true;
            }
            head = head.next;
            set.add(head);
        }
        return false;
    }


public boolean isValid(String s) {
        if(s.length()%2!=0) return false;
    Stack<Character> stack = new Stack<>();
for(Character c:s.toCharArray()){
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            }
            else if(c==')' && !stack.empty() && stack.peek() == '('){
                stack.pop();
            }
            else if(c=='}' && !stack.empty() && stack.peek() == '{'){
                stack.pop();
            }
            else if(c==']' && !stack.empty() && stack.peek() == '['){
                stack.pop();
            }
        }
        return stack.empty();

     }
    public boolean isPalindrome(ListNode head) {
        ListNode workNode = new ListNode(0);
        Stack<ListNode> stack = new Stack<>();
        List<ListNode>arrayList = new ArrayList<>();
        while(head!=null){
            stack.push(head);
            arrayList.add(head);
            head = head.next;
        }
        System.out.println(stack);
        System.out.println(arrayList);
        return stack.toArray() == (arrayList.toArray());
    }
    public int calPoints(String[] operations) {
        Character c = '1';
        Stack<Integer> stack = new Stack<>();
        stack.add(1);
        stack.push(1);
        int totalSum = 0;
        for(String s:operations){
            switch(s){
                case("C"):
                    totalSum -= stack.pop();
                    break;
                case("D"):
                   stack.add(stack.peek()*2);
                   totalSum += stack.peek();
                    break;
                case("+"):
                    totalSum += stack.pop() + stack.peek();
                    break;
            }

        }
        return totalSum;
    }

    public String greatestLetter(String s) {
        Set<String>set = new HashSet<>();
        int max = -1;
        int counter = 0;
        for(Character c : s.toCharArray()){
            if(set.contains(String.valueOf(c))){
                if(c.hashCode() > max) max = c.hashCode();
            }
            set.add(String.valueOf(c));
        }
        if(max > -1) return String.valueOf((char) max);
        return "";
    }
    public ListNode deleteDuplicates(ListNode head) {
        ListNode startNode = new ListNode(0);
        ListNode workNode = startNode;
        Set<Integer> set = new HashSet();
        while(head != null){
            set.add(head.val);
            head = head.next;
        }
        for(int value : set){
            workNode.val = value;
            workNode = workNode.next;
        }
        System.out.println(set);

        return startNode.next;


    }

    public int[] replaceElements(int[] arr) {
        int max = -1;
        for(int i = 0;i<arr.length;i++){

            for(int j = i+1;j<arr.length;j++){
                if(arr[j] > max);
                max = arr[j];

            };
            arr[i] = max;

        }
        return arr;
    }

    public double[] convertTemperature(double celsius) {

        return new double[]{celsius*273.15, celsius*1,8+32};
    }

    public int getLucky(String s, int k) {
        int result = 0;
        for(Character c:s.toCharArray()){
            result += c -'a'+1;
            System.out.println( c + " " + ((int) c - 96));
            System.out.println(result);
        }
        if (k != 1) {
            for (int i = 0; i < k; i++) {
                result = findSumOfDigits(result);
            }
        }
        return result;
    }
    private int findSumOfDigits(int input){
        String[] numbers = String.valueOf(input).split("");
        int result = 0;
        for(String n:numbers){
            System.out.println(n);
            result += Integer.parseInt(n);
        }
        return result;
    }

    public boolean hasAlternatingBits(int n) {
        String byteString  = Integer.toBinaryString(n);
        for (int i = 0; i < byteString.length()-1; i++) {
            if(byteString.charAt(i) == byteString.charAt(i+1)) return false;
        }
        return true;


    }

    public String mostCommonWord(String ss, String[] banned){
        String[]s= ss.split("[,.! ?]");
        int max = Integer.MIN_VALUE;
        int index = -1;
        for(int i = 0;i<s.length;i++){
            int counter = 0;
            for (int j = i; j < s.length; j++) {
                if(s[i].equalsIgnoreCase(s[j]) && !isBanned(s[i],banned) && !s[i].isEmpty()){
                    counter++;
                }
            }
            if(counter>max){
                max= counter;
                index = i;
            }
        }
        return s[index];
    }
    private boolean isBanned(String s, String[]array){
        for(String ss:array){
            if(ss.equals(s)) return true;
        }
        return false;
    }

    public int convertTime(String current, String correct) {
        int currentTime = convertToMinutes(current);
        int correctTime = convertToMinutes(correct);
        boolean flag = true;
        int counter = 0;
        while(flag){
            if(correctTime - currentTime > 60){
                currentTime += 60;
                counter++;
            }
            else{
                flag = false;
            }


        }
        return counter;
    }
    public int convertToMinutes(String time){
        int minutes = Integer.parseInt(time.substring(time.length() - 2));
        System.out.println(minutes);
        if(time.charAt(0) == '0'){
            return Integer.parseInt(String.valueOf(time.charAt(1))) *60 + minutes;

        }
        return Integer.parseInt(time.substring(0,2)) *60 + minutes;
    }


    public int countNodes(TreeNode root) {
        if(root == null) return 0;
        if(root.left == null && root.right == null) return 1;
        List<Integer>list = new ArrayList<>();
        counter(root, list);
        return list.size();
    }
    private void counter(TreeNode root, List<Integer>list){
        if(root.left == null && root.right != null){
            list.add(root.right.val);
        }
        else if(root.left != null && root.right == null){
            list.add(root.left.val);
        }
        else if(root.left != null && root.right != null ) {
            list.add(root.right.val);
            list.add(root.left.val);
        }
       if(root.left!= null){
           counter(root.left, list);

       }
       if(root.right != null){
           counter(root.right, list);

       }

    }


    public List<Double> averageOfLevels(TreeNode root) {
        if(root == null) return new ArrayList<Double>();
        List<Double> list = new ArrayList<>();
        list.add((double)root.val);
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode current = q.poll();
            double result = 0;
            int counter = 0;
            if(current.left != null){
                result += current.left.val;
                counter++;
                q.offer(current.left);
                if(root.left.left != null){
                    result += current.left.left.val;
                    counter++;
                }
                if(root.left.right != null){
                    result += current.left.right.val;
                    counter++;
                }

            }
            if(current.right != null){
                result += current.right.val;
                counter++;
                q.offer(current.right);
                if(root.right.left != null){
                    result += current.right.left.val;
                    counter++;
                }
                if(root.right.right != null){
                    result += current.right.right.val;
                    counter++;
                }
            }
            if(counter != 0) list.add(result/counter);
        }
        return list;

    }

   public ListNode rotateRight(ListNode head){
       if (head == null || head.next == null) {
           return head;
       }

       ListNode startNode = new ListNode(0);
        ListNode workNode = startNode;
       ListNode cycleNode = head;
        int len = 0;
        while(cycleNode!= null){
            len++;
            cycleNode = cycleNode.next;
        }
        int steps = len-1;
        for(int i =0; i<=steps;i++){
            workNode.next =  new ListNode(head.val);
            workNode = workNode.next;
            head = head.next;
        }
        return startNode.next;
   }


    public int titleToNumber(String columnTitle) {
        int result =1;
        if(columnTitle.length() == 1) return (int) columnTitle.charAt(0) -64;
        char[]c = columnTitle.toCharArray();
        for(int i = 0;i<c.length;i++){
            if(i != c.length-1){
                result += (int) columnTitle.charAt(i) -64;
            }
            else{
                result *= ((int) columnTitle.charAt(i) -64) *26;
            }

        }
        return result;
    }

    public int percentageLetter(String s, char letter) {
        double result = 0;
        for(Character c: s.toCharArray()){
            if(c==letter) result++;
        }
        if(result != 0)return (int) ((result/s.length())*100);
        return 0;
    }


    public String finalString(String s) {
        StringBuilder result = new StringBuilder();
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == 'i'){
                result.reverse();
            }
            else{
                result.append(s.charAt(i));
            }
        }
        return result.toString();
    }

        public int rangeSumBST(TreeNode root, int low, int high) {
            int sumOfNodes = 0;
            int counter = 0;
            Queue<TreeNode> q = new LinkedList<>();
            q.offer(root);
            while(!q.isEmpty()){
                TreeNode current = q.poll();
                if(current != null){
                    sumOfNodes += current.val;
                    counter++;
                    if(current.left != null){
                        q.offer(current.left);
                    }
                    if(current.right != null){
                        q.offer(current.right);
                    }
                }
            }
            System.out.println(counter);
            return sumOfNodes;
        }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int indexer = 0;
        for(int i = 0; i<nums1.length;i++){
            if(nums1[i] == 0){
                nums1[i] = nums2[indexer];
                indexer++;
            }
        }
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));

    }

    public int removeDuplicates(int[] nums) {
        Arrays.sort(nums);
        int result = nums.length;
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i] == nums[i+1]){
                nums[i+1] =-1;
                result--;
            }
        }
        Arrays.sort(nums);
        return result;
    }
    public String mergeAlternately(String word1, String word2) {
        StringBuilder stringBuilder = new StringBuilder(word1);
        StringBuilder stringBuilder2 = new StringBuilder(word2);
        StringBuilder result = new StringBuilder();
        int length = Math.min(stringBuilder2.length(), stringBuilder.length());
        for (int i = 0; i < length; i++) {
            result.append(stringBuilder.charAt(i));
            result.append(stringBuilder2.charAt(i));
        }
        if(stringBuilder2.length() > stringBuilder.length()){
            result.append(stringBuilder2.substring(length, stringBuilder2.length()));
        }
        else if(stringBuilder.length() > stringBuilder2.length()){
            result.append(stringBuilder.substring(length, stringBuilder.length()));
        }
        return result.toString();

    }

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        gatherLeaves(root1, list);
        gatherLeaves(root2, list1);
        if(list.size()!=list1.size()) return false;
        for(int i=0; i<list.size();i++){
            if(list.get(i) != list1.get(i)){
                return false;
            }
        }
        return true;


    }
    private void gatherLeaves(TreeNode root, List<Integer>list){
        if(root!=null){
            gatherLeaves(root.left,list);
            list.add(root.val);
            gatherLeaves(root.right,list);
        }

    }

    public void removeElement(int[] nums, int val) {
        int n = nums.length;
        int result = nums.length;
        for(int i = 0; i<nums.length/2;i++){
            if(nums[i] == val){
                System.out.print(nums[i] + ", ");
                System.out.println(nums[n-1]);
                int swap = nums[i];
                nums[i] = nums[n-1];
                nums[n-1] = swap;
                n--;
                result--;
            }
        }
    }

    public boolean isPowerOfTwo(int n) {
        String s = Integer.toBinaryString(n);
        if(n <= 0) return false;
        System.out.println(s);
        return s.contains("1") && !s.substring(1).contains("1");

    }
    public int removeDuplicates2(int[] nums) {
        int result = nums.length;
        for(int i =0;i<nums.length;i++){
            int counter = 0;
            for(int j = i+1; j<nums.length;j++){
                if(nums[i] == nums[j]){
                    counter++;
                }
                if(counter > 1){
                    nums[j] = Integer.MAX_VALUE;
                }
            }
        }
        return result;

    }

    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length() ) return false;
        StringBuilder builder = new StringBuilder(s);
        StringBuilder builder1 = new StringBuilder(t);
        for(Character c: s.toCharArray()){
            if(builder1.indexOf(String.valueOf(c)) != -1){
                builder.deleteCharAt(builder.indexOf(String.valueOf(c)));
                builder1.deleteCharAt(builder1.indexOf(String.valueOf(c)));
            }
        }
        return builder.isEmpty() && builder1.isEmpty();

    }


    public void findOccurrences(String[] words ){
        Map<String, Integer> map = new HashMap<>();
        for (String word: words) {
            map.put(word, map.getOrDefault(word,0)+1);
        }
        int maxValue  = -1;
        String word = "";
        for(Map.Entry<String, Integer> entry :  map.entrySet()){
            if(maxValue < entry.getValue()){
                maxValue = entry.getValue();
                word = entry.getKey();
            }
        }
        System.out.println(word + ":" + maxValue);
    }

    public boolean wordPattern(String pattern, String s) {
        String[]words = s.split(" ");
        System.out.println(Arrays.toString(words));
        char[] letters = pattern.toCharArray();
        if(pattern.length() !=words.length ) return false;
        Map<Character , String > map = new HashMap<>();
        for(int i = 0;i<words.length;i++){
            if(map.containsKey(letters[i]) && !map.get(letters[i]).equals(words[i]) ){
                    return false;
            }
            if(!map.containsKey(letters[i] )&& map.containsValue(words[i])){
                return false;
            }
            System.out.println(letters[i] + ":" + words[i]);
            map.put(letters[i], words[i]);
        }

        return true;

    }

    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        for(Character c: ransomNote.toCharArray()){
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }
        for(Character c: magazine.toCharArray()){
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }
        if(map1.keySet().size() >= map2.keySet().size()){
            for(Character c : map1.keySet()){
                if(map1.containsKey(c) && map2.containsKey(c)) {
                    if (map1.get(c) != map2.get(c)) return false;
                }
            }
        }
        else{
            for(Character c: map2.keySet()){
                if(map1.containsKey(c) && map2.containsKey(c)) {
                    if (map1.get(c) != map2.get(c)) return false;
                }
            }
        }

        return true;
    }

    public List<List<Integer>> findWinners(int[][] matches) {

        Map<Integer, Integer> winMap = new HashMap<>();
        Map<Integer, Integer> loseMap = new HashMap<>();

        List<Integer> winners = new ArrayList<>();
        List<Integer> losers = new ArrayList<>();
        for (int[] match : matches) {
            winMap.put(match[0], winMap.getOrDefault(match[0], 0) + 1);
            loseMap.put(match[1], loseMap.getOrDefault(match[1], 0) + 1);
        }
        System.out.println(winMap);
        System.out.println(loseMap);
        for (int[] match : matches) {
            if (!loseMap.containsKey(match[0]) && !winners.contains(match[0])) {
                winners.add(match[0]);
            }
        }
        for (Map.Entry<Integer, Integer> entry : loseMap.entrySet()) {
            if (entry.getValue() == 1) {
                losers.add(entry.getKey());
            }
        }


            return List.of(winners, losers);
    }

    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        for(int i = 0;i<s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                if(!map.get(s.charAt(i)).equals(t.charAt(i))) return false;
            }
            map.put(s.charAt(i), t.charAt(i));
        }
        return true;
    }

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for(int i = 0; i<nums.length-1; i++){
            for(int j = i+1; j<k+i; j++){
                System.out.print(i);
                System.out.println(j);
            }
        }
        return false;
    }

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0; i<nums.length; i++){
            for(int j = 0; j<nums.length; j++){
                for(int k = 0; k<nums.length; k++){
                    if(i != j && i!= k && j!= k ){
                        if(nums[i] + nums[j] + nums[k] == 0){
                            List<Integer> list1 = new ArrayList<>(List.of(nums[i], nums[j], nums[k]));
                            Collections.sort(list1);
                            if(!list.contains(list1)){
                                list.add(list1);

                            }
                        }
                    }
                }
            }
        }

        return list;
    }

    public boolean containsNearbyDuplicate2(int[] nums, int k) {
        int result = 0;
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i< k;i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
            }else{
                return true;
            }
        }
        int n = nums.length;
        for(int i = 1; i<n-k+1; i++){
            set.remove(nums[i]);
            if(set.contains(nums[n-k+1])) return true;
            set.add(nums[n-k+1]);
        }


       return false;
    }
    public boolean validPalindrome(String s) {
        StringBuilder builder = new StringBuilder(s);
        if(s.equals(builder.reverse().toString())){
            return true;
        }
        for(int i = 0; i<s.length();i++){
            s = String.valueOf(builder.deleteCharAt(i));
            builder = new StringBuilder(s);
            if(s.charAt(0) == builder.charAt(builder.length()-1)){
                return true;
            }
            builder.insert(i, s.charAt(i));
            System.out.println(builder);
        }
        return false;
    }

    public String toLowerCase(String s) {
        String result = "";
        int current = 0;
        for(Character c: s.toCharArray()){
            current = c;
            if(current >= 65 && current <= 91){
                char w = (char) (current + 32);
                result += w;

            }
            else{
                result += c;
            }
        }
        return result;
    }

    public int[] shortestToChar(String s, char c) {
        int[] nums = new int[s.length()];
        int index = s.indexOf(c);
        for(int i = 0; i<s.length(); i++){
            if(i<=index){
                nums[i] = index-i;
            }
            else{
                System.out.println(s.substring(index+1));
                index += s.substring(index+1).indexOf(c);
                System.out.println("index -> "+ index);
                System.out.println( s.substring(index+1).indexOf(c));
            }

        }
        return nums;
    }

    public List<List<Integer>> divideArray(int[] nums, int k) {
        bubbleSort(nums);
       List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        for(int i = 0; i<nums.length-1; i++){
            if(current.size() == 3){
                result.add(new ArrayList<>(current));
            }
            if(nums[i+1] - nums[i] <= k){
                current.add(nums[i]);
            }
        }
        return result;

    }
    private void bubbleSort(int[] arr){
        boolean swapped;
        int n = arr.length;
        for(int i = 0;i<n;i++){
            swapped = false;
            for(int j = 0; j<n-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) break;
        }
    }


    public String capitalizeTitle(String title) {
        String[] words = title.split(" ");
        String result = "";
        for(String word :words){
            if(!word.isBlank()){
                Character capital = Character.toUpperCase(word.charAt(0));
                String remain = word.substring(1);
                result += capital+remain;
            }
            else{
                result += word;
            }
        }
        return result;
    }




    public int singleNonDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        int result = -1;
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            if(entry.getValue() == 1){
                result = entry.getKey();
            }
        }
        return result;
    }

    public String firstPalindrome(String[] words) {
        String first = "";
        for(String word : words){
            StringBuilder builder = new StringBuilder(word);
            if(builder.toString().contentEquals(builder.reverse().toString())){
                first = builder.toString();
                break;
            }
        }
        return first;

    }

    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for(int[] nums : matrix){
            for(int num : nums){
                q.add(num);
            }
        }
        for(int i = 0; i< k-1; i++){
            q.remove();
        }
        return q.peek();
    }
    public void reorderList(ListNode head) {
        int counter = 0;
        Queue<Integer> list = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        ListNode first = new ListNode(0);
        ListNode answer = first;
        while(head != null){
            if(counter % 2 == 0){
                list.add(head.val);
            }
            else{
                stack.add(head.val);
            }
            counter++;
            head = head.next;
        }
        while(counter >= 0){
            if(counter % 2 == 0){
                if(!list.isEmpty()){
                    answer.next= new ListNode(list.poll());
                }
            }
            else{
                answer.next = new ListNode(stack.peek());
                stack.pop();
            }
            counter--;
            answer = answer.next;
        }
        head = first.next;
    }

    public String reverseVowels(String s) {
        int left = 0;
        int right = s.length()-1;
        String vowels = "aeiou";
        StringBuilder reversed = new StringBuilder(s);
        while(right>=left){
            if(!vowels.contains(String.valueOf(s.charAt(left)))){
                left++;
            }
            if(!vowels.contains(String.valueOf(s.charAt(right)))){
                right--;
            }
            if(vowels.contains(String.valueOf(s.charAt(left))) && vowels.contains(String.valueOf(s.charAt(right)))){
                reversed.setCharAt(left, s.charAt(right));
                reversed.setCharAt(right, s.charAt(left));
            }
        }
        return reversed.toString();
    }

    public int compress(char[] chars) {
        if(chars.length == 1) return 1;
        int left = 0;
        int right = 1;
        int result = 1;
        String s = "";
        int step = 1;
        while(left <= right && right < chars.length){
            if(chars[left] != chars[right]){
                chars[step] = (char) result;
                left = right;
                right++;
                step++;
                result = 1;
            }
            else {
                right++;
                result++;
            }
        }
        s += String.valueOf(chars[left]) + result;
        System.out.println(s);
        return  chars.length;
    }

    public boolean judgeSquareSum(int c) {
        if(c == 0) return true;
        int left = 0;
        int right = (int)(Math.ceil(Math.sqrt(c)));
        System.out.println(right*right);
        for(int i = 0; i<Math.sqrt(c) ;i++){
            int sum = left*left + right*right;
            if( sum == c){
                return true;
            }
            else if(sum > c){
                right--;
            }
            else{
                left++;
            }

        }
        return false;
    }













}