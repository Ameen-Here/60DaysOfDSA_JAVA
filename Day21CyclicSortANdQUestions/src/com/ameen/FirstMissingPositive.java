package com.ameen;

public class FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        int start = 0;
        int end = nums.length;
        while(start < end){
            int correct = nums[start] - 1;
            if(nums[start] > 0 && nums[start] <= end && nums[start] != nums[correct]){
                    swap(nums,start, correct);
                }
                else{
                    start++;
                }
            }
        for (int i = 0; i < end; i++) {
            if (nums[i] > 0 || nums[i]<end){
                if(nums[i] != i + 1){
                    return i + 1;
                }
            }

        }
        return end+1;
    }
    void swap(int[]arr, int maxIndex, int last){
        int temp = arr[maxIndex];
        arr[maxIndex] = arr[last];
        arr[last] = temp;
    }
}
