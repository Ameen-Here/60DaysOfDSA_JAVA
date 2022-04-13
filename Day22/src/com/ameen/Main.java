package com.ameen;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
            String s = "abcdcab";
        System.out.println(pallindrome(s));
    }

    static boolean pallindrome(String str){
//        char [] checker = str.toCharArray();
//        int start = 0;
//        int end = checker.length - 1;
//        while(start<=end){
//            if(checker[start] != checker[end]){
//                return false;
//            }
//            start++;
//            end--;
//        }
//        return true;
        str = str.toLowerCase();
        for (int i = 0; i < str.length() / 2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);

            if(start != end){
                return false;
            }
            
        }
        return true;
    }
}
