package com.ameen;

public class MountainArrayPeak {
    public static void main(String[] args) {
        int[]arr = {1,2,5,7,9,10,4,3,2,1};
        System.out.println(mountainArrayPeak(arr));
    }
    static int mountainArrayPeak(int[]arr){

        // Making start as index 0 and end as last index of array
        int start = 0;
        int end = arr.length-1;

        // Running while loop until start becomes greater than end or answer is found
        while(start < end){
            // Find the middle element
            int mid = start + ((end - start)/2);

            if(arr[mid + 1] < arr[mid]){
                end = mid;
            }
            else{
                start = mid + 1;
            }
//
        }
        // If value is not founded ,
        return start;
    }
}
