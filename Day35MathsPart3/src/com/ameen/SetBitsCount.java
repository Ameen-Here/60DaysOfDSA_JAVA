package com.ameen;

public class SetBitsCount {
    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(567));
        System.out.println(noOfBits(567));
    }
    static int noOfBits(int number){
        int ans = 0;
        while(number > 0){
//            number -= (number & - number);
            //  OR
            number &= (number - 1);
            ans++;
        }
        return ans;
    }
}
