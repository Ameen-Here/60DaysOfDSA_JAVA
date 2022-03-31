package com.ameen;

// To find number of element with even number of digits in an array
public class EvenDigitsInArray {

    public static void main(String[] args) {
        int[]arr = {10,1,324,1000,444,234};
        System.out.println(search(arr));

    }

    static int search(int []arr){
        if(arr.length == 0){
            return 0;
        }
        int count = 0;
        for (int num:arr){
            if(even(num)){
                count++;
            }
        }
        return count;
    }

    static boolean even(int num){
        int digitOfNum = convertToDigit(num);
        return (digitOfNum ^ 1 )== digitOfNum + 1; // OR return ((n & 1)!=1); // But both of this is advanced topics.
    }

    static int convertToDigit(int num){
        if(num < 0){
            num *= -1;
        }
        if(num == 0){
            return 1;
        }
        // first solution
//        int count = 0;
//        while(num > 0){
//            count++;
//            num /= 10;
//        }

        return (int)(Math.log10(num) + 1);
    }
}
