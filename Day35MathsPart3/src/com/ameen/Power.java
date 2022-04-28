package com.ameen;

public class Power {
    public static void main(String[] args) {
        System.out.println(powerCalc(2,3));
    }
    static int powerCalc(int number, int power){
        int ans = 1;
        int base = number;
        System.out.println(power);
        while(power > 0){
            if((power & 1) == 1){
                ans *= base;
            }
            base *= base;
            power = power >> 1;

        }
        return ans;
    }
}
