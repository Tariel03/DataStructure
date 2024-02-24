package org.example.Leetcode;

public class BitWise {

    public void and(int n1, int n2){
        int n = n1 & n2;
        System.out.println(Integer.toBinaryString(n));
    }
    public void or(int n1, int n2){
        int n = n1 | n2;
        System.out.println(Integer.toBinaryString(n));
    }
    public void xor(int n1, int n2){
        int n = n1 ^ n2;
        System.out.println(Integer.toBinaryString(n));
    }
    public void negative(int n){
        System.out.println(Integer.toBinaryString(~n));
    }
    public void leftShift(int n, int step){
        int result = n << 2;
        System.out.println(result);
    }
    public void rightShift(int n, int step){
        int result = n >> 2;
        System.out.println(result);
    }
}
