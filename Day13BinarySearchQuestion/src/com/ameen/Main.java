package com.ameen;

public class Main {

    public static void main(String[] args) {
        int [] arr = {15, 11,7,6,4,2};
        int target = 3;
        System.out.println(ceilingNum(arr, target));

    }
    //  My code:
//    static int ceilingNum(int[]arr, int target){
//        int []ans = { 0,Integer.MAX_VALUE};
//        int start = 0;
//        int end = arr.length;
//        if(arr[arr.length - 1] < target || arr.length == 0){
//            return -1;
//        }
//        while (start <= end){
//            int middle = start + (end - start)/2;
//            if(arr[middle] == target){
//                return middle;
//            }
//            else if(arr[middle] > target){
//                if(arr[middle] - target < ans[1]){
//                    ans[0] = middle;
//                    ans[1] = arr[middle] - target;
//                }
//                end = middle - 1;
//            }
//            else{
//                start = middle + 1;
//            }
//        }
//        return ans[0];
//    }

    //  Easy code: Just write binary and replace the return -1 with start
    // Return the index of target value in the array
    static int ceilingNum(int[]arr, int target){
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

            if(arr[mid] > target){
                start = mid + 1 ;
            }
            else if(arr[mid] < target){
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
