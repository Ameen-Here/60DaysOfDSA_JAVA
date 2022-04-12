package com.ameen;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    int[]arr = {4,0,2,1};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclic(int[]arr){
        int start = 0;
        int end = arr.length;
        while(start<end){
//            if(arr[start] == start+1){
//                System.out.println("hey");
//                start++;
//            }
//            else{
//                System.out.println("hey");
//                swap(arr, arr[start]-1,start);
//            }
            int correct = arr[start] - 1;
            if(arr[start] != arr[correct]){
                System.out.println("hey");
                swap(arr, correct, start);
            }
            else{
                System.out.println("hey");
                start++;
            }
        }
    }


    static void swap(int[]arr, int maxIndex, int last){
        int temp = arr[maxIndex];
        arr[maxIndex] = arr[last];
        arr[last] = temp;
    }

}
