package com.ameen;

public class MaximumInRowOfTwoDArray {
    public static void main(String[] args) {
        int[][]arr = {
                {1,2,3},
                {1, 2},
                {4,5,6,7}
        };
        System.out.println(search(arr));
    }

    static int search(int[][]accounts){

        int answer = Integer.MIN_VALUE;

        // row = account
        // col = value

        // Enhanced for loop since we don't need index but only the value inside 2d Array,
        // account is row
        // accountVal is value of col in that particular array in the loop
        for(int[] account: accounts){
            int AccountMax = 0;
            for (int accountVal: account){
                AccountMax += accountVal;
            }

            if(AccountMax > answer){
                answer = AccountMax;
            }
        }
        return answer;
    }
}
