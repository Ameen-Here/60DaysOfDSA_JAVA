package com.ameen;

public class Main {

    public static void main(String[] args) {
            int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,20};
            int target = 2;
        System.out.println(binarySearch(arr, target));
    }

    // Return the index of target value in the array
    static int binarySearch(int[]arr, int target){
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

            if(arr[mid]< target){
                start = mid + 1 ;
            }
            else if(arr[mid] > target){
                end = mid - 1;
            }
            else{
                System.out.println("||");
                System.out.println(mid);
                return mid;
            }
        }
        // If value is not founded or the array is empty
        return -1;
    }

}
