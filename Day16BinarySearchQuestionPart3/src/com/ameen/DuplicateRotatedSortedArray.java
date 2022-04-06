package com.ameen;

public class DuplicateRotatedSortedArray {
    public static void main(String[] args) {

    int[]arr = {11,12,13,15,15,15,1,2,5,7,9,10, 11};
    int target = 11;
        System.out.println("Hello");
        System.out.println(duplicateRotated(arr, target));
}

    static int duplicateRotated(int[]arr, int target){
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

        while(start <= end){
            int mid = start + ((end - start)/2);
            if(mid < end && arr[mid + 1] < arr[mid]){
                return mid;
            }
            if(mid > start && arr[mid - 1]> arr[mid]){
                return mid - 1;
            }
            if(arr[mid]== arr[start] && arr[mid] == arr[end]){
                if(arr[start + 1] < arr[start]){
                    return start;
                }
                start++;
                if(arr[end - 1] > arr[end]){
                    return end -1 ;
                }
                end--;
            }
            else if(arr[start] < arr[mid] || arr[start] == arr[end] && arr[mid] > arr[end]){
                start=mid + 1;
            }
            else{
                end = mid-1;
            }

        }
//

        // rotated array pivot Value is both start or end, if its mot mountain array last element is return,
        return -1;
    }
}
