package com.ameen;

public class Pattern5 {
    public static void main(String[] args) {
        // write your code here
        pattern5(5);
    }

    static void pattern5(int n) {
        for (int row = 1; row <= 2 * n - 1; row++) {
           int totalNoCols = row > n? 2 * n - row : row;
           for(int col = 1; col <= totalNoCols;col++){
               System.out.print("* ");
           }
            System.out.println();
        }
        }
    }
