package com.ameen;

public class Pattern17 {
    public static void main(String[] args) {
        // write your code here
        pattern17(4);
    }

    static void pattern17(int n) {
        for (int row = 1; row <= 2 * n - 1; row++) {
            int colMax = row > n? 2 * n - row  : row;
            int totalNoOfSpaces = n - colMax;
            for (int i = 0; i < totalNoOfSpaces; i++) {
                System.out.print(" ");
            }
            for(int col = colMax; col >= 1;col--){
                System.out.print(col);
            }
            for(int col = 2; col <= colMax;col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
