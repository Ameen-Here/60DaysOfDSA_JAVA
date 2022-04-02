package com.ameen;

import java.util.Arrays;

public class FirstLastPosition {
    public static void main(String[] args) {
        int [] arr = {1,2,4,4,4,4,4,4,7,7,7,9,10};
        int target = 4;
        System.out.println(Arrays.toString(firstLast(arr, target)));
    }

    static int[] firstLast(int []arr, int target){
        int [] ans = {-1, -1};
        ans[0] = search(arr, target, true);
        ans[1] = search(arr, target, false);

        return ans;
    }
    static int search(int[]arr, int target, boolean firstIndex){
        int ans = -1;

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
                ans = mid;
                if(firstIndex) {
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
        }
        // If value is not founded , then return start which is the largest possible answer of target
        return ans;
    }

}










//  MY SOLUTION, NO BIG DIFFERENCE , IN THE ABOVE SOLUTION THEY USED A SEPERATE SEARCH FUNCTION,
//  IN THE BELOW I REPEATED THE CODE
//
////        if(arr[arr.length-1] <= target ){
////            return arr[0];
////        }  // OR at end; return start % arr.length
//        // Making start as index 0 and end as last index of array
//        int start = 0;
//        int end = arr.length-1;
//
//        int firstIndex = -1;
//        int lastIndex = -1;
//        // Running while loop until start becomes greater than end or answer is found
//        while(start <= end){
//            // Find the middle element
//            int mid = start + ((end - start)/2);
//
//            if(target < arr[mid]){
//                end = mid - 1;
//            }
//            else if(target > arr[mid]){
//                start = mid + 1 ;
//            }
//            else{
//                if(arr[mid+1] != target){
//                     lastIndex = mid;
//                }
//                start = mid + 1;
//
//            }
//        }
//
//        start = 0;
//        end = arr.length-1;
//
//        while(start <= end){
//            // Find the middle element
//            int mid = start + ((end - start)/2);
//
//            if(target < arr[mid]){
//                end = mid - 1;
//            }
//            else if(target > arr[mid]){
//                start = mid + 1 ;
//            }
//            else{
//                if(arr[mid - 1] != target){
//                    firstIndex = mid;
//                }
//                end = mid - 1;
//
//            }
//        }
//
//
//        // If value is not founded , then return start which is the largest possible answer of target
//        System.out.println(start);
//        int []ans = {firstIndex, lastIndex};
//        return ans;
//    }