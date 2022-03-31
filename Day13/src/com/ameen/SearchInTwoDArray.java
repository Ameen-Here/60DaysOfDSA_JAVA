package com.ameen;

import java.util.Arrays;

public class SearchInTwoDArray {
    public static void main(String[] args) {
        int[][]arr2 = {
                {2,3,4,5},
                {6,7},
                {8,10,11},
                {2}
        };
        int target = 5;
        System.out.println(Arrays.toString(search2(arr2, target)));
    }
    static int[] search2(int[][]arr, int target){
        if(arr.length == 0){
            return new int[]{-1, -1};
        }
        for(int row = 0; row < arr.length; row++){
            for(int col =0; col < arr[row].length; col++){
                if(arr[row][col]==target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
