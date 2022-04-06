package com.ameen;

public class Main {

    public static void main(String[] args) {
        int[]arr = {12,13,15,1,2,5,7,9,10, 11};
        int target = 13;
        System.out.println("Hello");
        System.out.println(rotatedArray(arr, target));
    }

    static int rotatedArray(int[]arr, int target){
        int pivot = pivotSearch(arr);
        if(pivot == -1){
            return binarySearch(arr, target, 0, arr.length - 1);
        }
        else if( target > arr[0]){
            return binarySearch(arr, target , 0, pivot);
        }
        else{
            return binarySearch(arr, target, pivot + 1, arr.length -1 );
        }

    }

    static int binarySearch(int []arr, int target,int start, int end){
        while(start <= end){
            int mid = start + ((end - start)/2);
            if(arr[mid] == target){
                System.out.println(mid);
                return mid;
            }
                if(arr[mid] < target){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }

            }
        return  -1;
    }
    static int pivotSearch(int[]arr){

        // Making start as index 0 and end as last index of array
        int start = 0;
        int end = arr.length-1;


        // Running while loop until start becomes greater than end or answer is found
//        int startt = arr[start];
//        while(start < end){
//            // Find the middle element
//            int mid = start + ((end - start)/2);
//            System.out.println(mid);
//
//            if(arr[mid ] < startt){
//                System.out.println("hey");
//                System.out.println(mid);
//                end = mid - 1;
//            }
//            else if(arr[mid + 1] < arr[mid]){
//                System.out.println("hellllllllllllooo");
//                System.out.println(mid);
//                return mid;
//            }
//            else{
//                start = mid;
//            }

            //  OR
            while(start <= end){
                int mid = start + ((end - start)/2);
                if(mid < end && arr[mid + 1] < arr[mid]){
                    return mid;
                }
                if(mid > start && arr[mid - 1]> arr[mid]){
                    return mid - 1;
                }
                if(arr[mid]<= arr[start]){
                    end = mid -1;
                }else{
                    start = mid + 1;
                }
            }
//

        // rotated array pivot Value is both start or end, if its mot mountain array last element is return,
        return -1;
    }
}
