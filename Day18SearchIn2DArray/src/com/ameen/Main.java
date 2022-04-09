package com.ameen;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	   int [][] matrixes = {
               {1,10,20,40},
               {3,15,23,44},
               {16,22,27,55}
       };
       int target = 16;
        System.out.println(Arrays.toString(search(matrixes, target)));

    }
    static int[] search(int [][]matrix, int target){
        int row = 0;
        int col = matrix.length;

        while(row < matrix.length && col >= 0){
            if(matrix[row][col] == target){
                return new int[]{row, col};
            }
            if(matrix[row][col] > target){
                col--;
            }
            else{
                row++;
            }
        }
        return new int[]{-1,-1};
    }
}
