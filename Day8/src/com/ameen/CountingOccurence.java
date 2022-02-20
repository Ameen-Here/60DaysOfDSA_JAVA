package com.ameen;

import java.util.Scanner;

public class CountingOccurence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter The Number");
        String number = in.next();
        System.out.println("Enter the number whose occurence needed to be checked");
        char occ = in.next().trim().charAt(0);
        int counter = 0;
        for (int i = 0; i < number.length(); i++) {
            if(occ == number.trim().charAt(i)) {
                counter++;
            }
        }
        System.out.println(counter);
        // Or
        // int number = in.nextInt();
        //  while number > 0
        // if(occ == number % 10){counter++}
        // number = number / 10
    }
}
