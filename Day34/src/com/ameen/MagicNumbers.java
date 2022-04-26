package com.ameen;

public class MagicNumbers {
    public static void main(String[] args) {
        int number = 2;
        System.out.println(magicNumber(number));
    }

    static int magicNumber(int n){
        int ans = 0;
        int base = 5;
        while(n>0){
            int last = n & 1;
            ans = ans + base*last;
            n = n>>1;
            base = base * 5;
        }

        return ans;
    }
}
