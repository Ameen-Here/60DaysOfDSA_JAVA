package com.ameen;

public class InfiniteSortedArray {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
        int target = 25;
        System.out.println(findBoundary(arr, target));
    }
    static int findBoundary(int []arr,int target){
        int start = 0;
        int end = 2;
//        while(arr[end] < target){
//            start = end + 1;
//            end *= 2;
        while(target > arr[end]){
            int newStart = end + 1;
            end = end + (end - start + 1 ) * 2;
            start = newStart;
//            System.out.println(newStart );

        }
        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int []arr, int target, int start, int end){
        while(start <= end){
            // Find the middle element
            int mid = start + ((end - start)/2);

            if(target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1 ;
            }
            else{
                return mid;
            }
        }
        // If value is not founded , then return -1
        return -1;
    }
}
