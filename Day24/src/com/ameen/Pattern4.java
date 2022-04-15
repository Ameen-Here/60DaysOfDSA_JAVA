package com.ameen;

public class Pattern4 {
    public static void main(String[] args) {
        // write your code here
        pattern4(5);
    }

    static void pattern4(int n){
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= row; col++){
                System.out.printf("%d ", col );
            }
            System.out.println();
        }
    }
}
