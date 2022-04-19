package com.ameen;

public class BinarySearchTreeRecurssion {
    public static void main(String[] args) {
        int []arr = {1,2,3,7,9,10,13};
        int target = 14;
        System.out.println(binarySearchRecurssion(arr, 0, arr.length - 1, target));
    }
    static int binarySearchRecurssion(int[]arr, int start, int end, int target){
        if(start > end){
            return -1;
        }

        int mid = start + (end- start) / 2;

        if(arr[mid] == target){
            return mid;
        }
        if(arr[mid] < target){
            return binarySearchRecurssion(arr, mid + 1, end, target);
        }
        return binarySearchRecurssion(arr, start, mid - 1, target);


    }
}
