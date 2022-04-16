package com.ameen;

public class Pattern1 {
    public static void main(String[] args) {
        // write your code here
        pattern1(5);
    }

    static void pattern1(int n){
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= n; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
