package com.ameen;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int answer = 0;
        int number = in.nextInt();
        while(number>0){
            answer = (answer * 10) + number %10;
            number = number / 10;
        }
        System.out.println(answer);
    }
}
