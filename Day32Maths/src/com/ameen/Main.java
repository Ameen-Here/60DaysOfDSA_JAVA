package com.ameen;

public class Main {

    public static void main(String[] args) {
        System.out.println(isOddBit(22));
    }
    static boolean isOddBit(int n){
        return (n & 1) == 1;
    }
}
