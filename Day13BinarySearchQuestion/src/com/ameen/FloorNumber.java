package com.ameen;

public class FloorNumber {
    public static void main(String[] args) {
        int [] arr = {1,2,4,7,9,10};
        int target = 11;
        System.out.println(floorNumber(arr, target));
    }
    // Return the index of target value in the array
    static int floorNumber(int[]arr, int target){
        if(arr.length == 0){
            return -1;
        }

        // Making start as index 0 and end as last index of array
        int start = 0;
        int end = arr.length-1;

        // Running while loop until start becomes greater than end or answer is found
        while(start <= end){
            // Find the middle element
            int mid = start + ((end - start)/2);

            if(arr[mid] < target){
                start = mid + 1 ;
            }
            else if(arr[mid] > target){
                end = mid - 1;
            }
            else{
                return mid;
            }
        }
        // If value is not founded , then return start which is the largest possible answer of target
        return end;
    }
}
