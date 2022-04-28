package com.ameen;

public class RangeXOR {
    public static void main(String[] args) {
        int a = 6;
        int b = 22;
        int ans = xor(b) ^ xor(a-1);
        System.out.println(ans);
    }
    static int xor(int number){
        if(number % 4 == 0){
            return number;
        }
        else if(number % 4 == 3){
            return (0);
        }
        else if(number % 4 == 2){
            return (number + 1);
        }

        return  (1);
    }
}
