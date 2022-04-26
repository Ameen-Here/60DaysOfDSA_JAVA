package com.ameen;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[]arr = {1,2,3,1,2,3,1,2,3,4,7,4,4};
        System.out.println(bitwiseOddOneOut(arr));
    }

    static int bitwiseOddOneOut(int []arr){
        int MAX_BIT = 8;
        int sum;
        int result = 0;
        for(int i=0; i< MAX_BIT;i++){
            sum = 0;
            int x = (1<<i);
            for(int j=0;j<arr.length;j++){
                if((arr[j] & x) > 0){
                    sum++;
                }

            }
            if(sum % 3 != 0){
                result |= x;
            }
        }
        return result;

    }
}
