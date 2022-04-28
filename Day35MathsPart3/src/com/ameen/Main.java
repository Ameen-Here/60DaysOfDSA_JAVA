package com.ameen;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(powOf2(9));
    }
    static boolean powOf2(int num){
        if(num == 0) return false;
        return  (num & (num-1)) == 0;
    }
}
