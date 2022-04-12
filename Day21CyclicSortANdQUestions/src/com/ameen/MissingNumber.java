package com.ameen;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[]arr = {3,0,2,1};
        System.out.println(missing(arr));
        System.out.println(Arrays.toString(arr));
    }
    static int missing(int[]arr){
        int start = 0;
        int end = arr.length;
        while(start<end){
            int correct = arr[start] ;
            if(arr[start] == end){
                start++;
            }
            else if(arr[start] != arr[correct]){
                System.out.println("hey");
                swap(arr, correct, start);
            }
            else{
                System.out.println("hey");
                start++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != i){
                return i;
            }
        }
        return end;
    }


    static void swap(int[]arr, int maxIndex, int last){
        int temp = arr[maxIndex];
        arr[maxIndex] = arr[last];
        arr[last] = temp;
    }

}
