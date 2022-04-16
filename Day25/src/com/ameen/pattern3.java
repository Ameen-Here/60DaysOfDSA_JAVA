package com.ameen;

public class pattern3 {
    public static void main(String[] args) {
        // write your code here
        pattern3(5);
    }

    static void pattern3(int n){
        for(int row = 0; row <= n; row++){
            for(int col = 1; col <= n - row; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
