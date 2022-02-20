package com.ameen;

import java.util.Scanner;

public class FibanocciNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("FIbanocci Position:");
        int count = in.nextInt();
        int a = 0;
        int b = 1;
        for (int i = 1; i < count; i++) {
            int temp = b;
            b = a + b;
            a = temp;
        }

        System.out.println(b);
        }
    }
