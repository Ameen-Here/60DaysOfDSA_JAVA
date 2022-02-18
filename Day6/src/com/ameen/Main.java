package com.ameen;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Celsius to Farrenhiet converter");
        System.out.println("Please enter temp in c: ");
        float tempC = in.nextFloat();
        float tempF = (tempC * 9/5) + 32;

        System.out.println("Temperature in farrenheit is ");
        System.out.print(tempF);
    }
}
