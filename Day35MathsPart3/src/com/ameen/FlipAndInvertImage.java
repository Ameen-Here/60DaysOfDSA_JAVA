package com.ameen;

import java.util.Arrays;

public class FlipAndInvertImage {
    public static void main(String[] args) {
        int [][]arr = {
                {1,0,1},
                {1,1,1,},
                {1,1,0,0}

        };
        System.out.println(Arrays.deepToString(flipAndInvert(arr)));
    }
    static int[][] flipAndInvert(int [][] image){
        for(int[] row: image){
            for(int i = 0; i < (row.length + 1)  / 2; i++){
                int temp = row[i] ^ 1;
                row[i] = row[row.length - i - 1] ^ 1;
                row[row.length - i - 1] = temp;
            }
        }
        return image;
    }
}
