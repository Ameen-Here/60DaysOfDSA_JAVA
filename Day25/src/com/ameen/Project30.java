package com.ameen;

public class Project30 {
    public static void main(String[] args) {
    // write your code here
    pattern30(5);
}

    static void pattern30(int n) {
        for (int row = 1; row <= n; row++) {
            int totalNoOfSpaces = n -  row;
            for (int i = 0; i < totalNoOfSpaces; i++) {
                System.out.print("  ");
            }
            for(int col = row; col >= 1;col--){
                System.out.print(col + " ");
            }
            for(int col = 2; col <= row;col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
