package com.ameen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DIsappearedNums {
    public static void main(String[] args) {
        int[]arr = {3,0,2,1};

    }



    static List<Integer> missing(int[]nums){
        int start = 0;
        int end = nums.length;
        while(start<end){
            int correct = nums[start] - 1;
            if(nums[start] != nums[correct]){

                swap(nums, correct, start);
            }
            else{

                start++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]  != i + 1){
                ans.add(i + 1);
            }
        }
        return ans;
    }


    static void swap(int[]arr, int maxIndex, int last){
        int temp = arr[maxIndex];
        arr[maxIndex] = arr[last];
        arr[last] = temp;
    }
}
