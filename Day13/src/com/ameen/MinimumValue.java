package com.ameen;

public class MinimumValue {
    public static void main(String[] args) {
        int[]arr = {-2,23,-256,723,450};
        int min_result = minimumSearch(arr);
        if(min_result == Integer.MAX_VALUE){
            System.out.println("Invalid array");
        }
        else{
            System.out.println(min_result);
        }
    }
    static int minimumSearch(int[]arr){
        if(arr.length == 0){
            return Integer.MIN_VALUE;
        }
        int min_value = Integer.MAX_VALUE;
        for(int i:arr){
            if(i < min_value){
                min_value = i;
            }
        }
        return min_value;
    }
}
