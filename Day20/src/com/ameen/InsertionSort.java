package com.ameen;

import java.util.Arrays;

public class InsertionSort {


    public static void main(String[] args) {
        int[]arr = {4,1,2,3,7,6,5};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertion(int[]arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for(int j = i + 1;j > 0; j--){
                if(arr[j-1] < arr[j]){
                    break;
                }
                swap(arr,j-1,j);
            }

        }
    }

    static void swap(int[]arr, int maxIndex, int last){
        int temp = arr[maxIndex];
        arr[maxIndex] = arr[last];
        arr[last] = temp;
    }
}
