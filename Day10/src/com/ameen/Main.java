package com.ameen;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name:");
        String name = in.next();
        String greet = greetUser(name);
        System.out.println(greet);

        int []arr = {1, 2,3,4,5};
        change(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println("Amstrong Check");
        System.out.println(amstrongCheck(135));
    }

     static void change(int[] arra) {
        arra[0] = 111;
    }

    static String greetUser(String user) {
        return "Hello " + user;
    }

    static boolean amstrongCheck(int number){
        int sum = 0;
        int a = number;
        while(a > 0){
            int rem = a % 10;
            sum += rem * rem * rem;
            a /= 10;
        }
        return number == sum;
    }
}
