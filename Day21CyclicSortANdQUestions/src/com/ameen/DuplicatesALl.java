package com.ameen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplicatesALl {
    public List<Integer> findDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length;
        while(start<end){
            int correct = arr[start] - 1;
            if(arr[start] != arr[correct]){
                swap(arr, correct, start);
            }
            else{
                start++;
            }
        }

        List <Integer> ans = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != i + 1){
                ans.add(arr[i]);
            }
        }
        return ans;

    }
    static void swap(int[]arr, int maxIndex, int last){
        int temp = arr[maxIndex];
        arr[maxIndex] = arr[last];
        arr[last] = temp;
    }
    }