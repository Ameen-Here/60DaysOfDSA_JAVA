package com.ameen;

public class GindUnique {
    public static void main(String[] args) {
        int [] arr = {2,3,4,5,7,3,4,5,2};
        System.out.println(ans(arr));

    }
    static int ans(int [] arr){
        int unique = 0;
        for(int number: arr){
            unique ^= number;
        }
        return unique;
    }
}
