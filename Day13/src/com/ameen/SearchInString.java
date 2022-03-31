package com.ameen;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SearchInString {
    public static void main(String[] args) {
        String name = "Ameen Noushad";
        char searchValue = 'Z';
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(search(name, searchValue));
    }
    static boolean search(String str, char target){
        if(str.length() == 0){
            return false;
        }
        for(char ch: str.toCharArray()){
            if(ch == target){
                return true;
            }
        }
        return false;
    }
}
