package com.ameen;

public class OrderAgnosticBinary {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,20};
        int[] arr2 = {-9,-8,-7,2,5,6,7,8};
        int target = 2;
        int target2 = -7;
        System.out.println(orderAgnosticBinarySearch(arr, target));
        System.out.println("///////////////////////////");
        System.out.println(orderAgnosticBinarySearch(arr2, target));

    }
    static int orderAgnosticBinarySearch(int[]arr, int target){
        if(arr.length == 0){
            return -1;
        }

        // Checking if it's ascending or not
        boolean ifAsci = arr[0] < arr[arr.length - 1];

        // Making start as index 0 and end as last index of array
        int start = 0;
        int end = arr.length-1;

        // Running while loop until start becomes greater than end or answer is found
        while(start <= end){
            // Find the middle element
            int mid = start + ((end - start)/2);
            if(arr[mid] == target){
                return mid;
            }

            if(ifAsci){
                if(arr[mid]< target){
                    start = mid + 1 ;
                }
                else {
                    end = mid - 1;
                }
            }
            else {
                    if(arr[mid] > target){
                    start = mid + 1 ;
                }
                else{
                    end = mid - 1;
                }
            }


        }
        // If value is not founded or the array is empty
        return -1;
    }

//    static boolean isAsscending(int[] arr){
//        if(arr[0] < arr[arr.length]){
//            return true;
//        }
//        return false;
//    }
}
