package com.ameen;

public class Main {

    public static void main(String[] args) {
	// write your code here
        pattern2(5);
    }

    static void pattern2(int n){
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= row; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
