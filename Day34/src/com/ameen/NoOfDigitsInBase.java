package com.ameen;

public class NoOfDigitsInBase {
    public static void main(String[] args) {
        int number = 2345;
        int base = 10;
        int noOfDigit = (int)(Math.log(number)/ Math.log(base)) + 1;
        System.out.println(noOfDigit);
    }
}
