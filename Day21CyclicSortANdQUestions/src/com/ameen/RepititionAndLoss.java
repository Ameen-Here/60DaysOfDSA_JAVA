package com.ameen;

import java.util.ArrayList;
import java.util.List;

public class RepititionAndLoss {
    public int[] findErrorNums(int[] nums) {
        int start = 0;
        int end = nums.length;
        while(start < end){
            int correct = nums[start] - 1;
            if(nums[start] != nums[correct]){
                swap(nums,start, correct);
            }
            else{
                start++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != i + 1){
                return new int[]{nums[i], i + 1};
            }

        }
       return new int[] {-1,-1};

    }
    static void swap(int[]arr, int maxIndex, int last){
        int temp = arr[maxIndex];
        arr[maxIndex] = arr[last];
        arr[last] = temp;
    }
}
