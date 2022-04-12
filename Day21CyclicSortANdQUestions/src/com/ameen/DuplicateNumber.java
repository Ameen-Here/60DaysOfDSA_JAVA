package com.ameen;

import java.util.Arrays;

public class DuplicateNumber {
    public static void main(String[] args) {
        int[]arr = {3,3,2,1};
        System.out.println(duplicate(arr));
        System.out.println(Arrays.toString(arr));
    }
    static int duplicate(int[]nums){
        int start = 0;
        int end = nums.length;
        while(start<end){
            if(nums[start] != start + 1){
            int correct = nums[start] - 1;
            if(nums[start] != nums[correct]){
                swap(nums, correct, start);
            }
            else{
                return nums[start];
            }}
            else{
                start++;
            }
        }
        return -1;
    }


    static void swap(int[]arr, int maxIndex, int last){
        int temp = arr[maxIndex];
        arr[maxIndex] = arr[last];
        arr[last] = temp;
    }

}

