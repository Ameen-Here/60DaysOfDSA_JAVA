package com.ameen;

public class SmallestLetter {
    public static void main(String[] args) {
        char [] arr = {'a','b','c','e','j','z'};
        char target = 'j';
        System.out.println(smallestLetter(arr, target));
    }
    // Return the index of target value in the array
    static char smallestLetter(char[]arr, char target){

//        if(arr[arr.length-1] <= target ){
//            return arr[0];
//        }  // OR at end; return start % arr.length
        // Making start as index 0 and end as last index of array
        int start = 0;
        int end = arr.length-1;

        // Running while loop until start becomes greater than end or answer is found
        while(start <= end){
            // Find the middle element
            int mid = start + ((end - start)/2);

            if(target < arr[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1 ;
            }
//            else{
//                int ans = (mid + 1) % arr.length;
//                return arr[ans];
//            }
        }
        // If value is not founded , then return start which is the largest possible answer of target
        System.out.println(start);
        return arr[start % arr.length];
    }
}
