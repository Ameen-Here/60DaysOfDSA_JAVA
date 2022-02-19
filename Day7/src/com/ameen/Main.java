package com.ameen;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Largest Number
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the three positive numbers");
        int max = 0;
        for (int i = 0; i < 3; i++) {
            int check = in.nextInt();
            if(max < check){
                max = check;
            }
        }
        System.out.println(max);
        // Or
        System.out.println("Enter the three numbers");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int max1 = Math.max(Math.max(a,b),c);
        System.out.println(max1);
    }
}
