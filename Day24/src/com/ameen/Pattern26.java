package com.ameen;

public class Pattern26 {
    public static void main(String[] args) {
        // write your code here
        pattern26(4);
    }

    static void pattern26(int n){
        for(int row = 1; row <= 2 * n; row++){
            int totalNoOfCol = row > n ? 2 * n - row: row;
            int totalNoOfSpaces = n - totalNoOfCol;
            for (int i = 0; i < totalNoOfSpaces; i++) {
                System.out.print(" ");
            }
            for(int col = 1; col <= totalNoOfCol; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
