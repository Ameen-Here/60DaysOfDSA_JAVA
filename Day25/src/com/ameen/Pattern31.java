package com.ameen;

public class Pattern31 {
    public static void main(String[] args) {
        // write your code here
        pattern31(4);
    }

    static void pattern31(int n) {
        for (int row = 1; row <= 2 * n - 1; row++) {
            int maxRow = row > n ? row - n + 1 :n - (row - 1) ;
            for(int col = n; col >= maxRow;col--){
                System.out.print(col + " ");
            }
            for(int col = 1; col< maxRow * 2 - 1;col++){
                System.out.print(maxRow + " ");
            }
            for(int col=maxRow + 1;col <= n; col++){
                System.out.print(col + " ");
            }

            // OR
//            for(int col = 1; col <= 2 * n - 1; col++){
//                System.out.print(n - Math.min(Math.min(row,col), Math.min(2 * n - row, 2 * n -col)) + 1);
//                System.out.print(" ");
//            }

            System.out.println();
        }
    }
}

