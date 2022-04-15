package com.ameen;

public class Pattern5 {
    public static void main(String[] args) {
        // write your code here
        pattern5(9);
    }

    static void pattern5(int n) {
        for (int row = 1; row <= n; row++) {
            if (row <= 5) {
                for (int col = 1; col <= row; col++) {
                    System.out.print("*");
                }
            } else {
                for (int col = 1; col <= n + 1 - row; col++) {
                    System.out.print("*");
                }}
                System.out.println();
            }
        }
    }
