package com.ameen;

public class XOR0ToA {
    public static void main(String[] args) {
        int a= 9;
        for(int i = 0; i < a+1;i++){
            if(i % 4 == 0){
                System.out.println(i);
            }
            else if(i % 4 == 3){
                System.out.println(0);
            }
            else if(i % 4 == 2){
                System.out.println(i + 1);
            }
            else{
                System.out.println(1);
            }
        }
    }
}
