package com.ameen;

public class SearchInRange {
    public static void main(String[] args) {
        int[]arr = {24, 6, 7, 8, 9};
        int target = 6;
        System.out.print("The target " + target + " is found at index " );
        System.out.println(searchRange(arr, target, 0,4));

    }
    static int searchRange(int[] arr, int target, int start, int end){
        if(arr.length == 0 || start > end || end > arr.length || start < 0){
            return -1;
        }
        for(int i =start; i < end; i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
