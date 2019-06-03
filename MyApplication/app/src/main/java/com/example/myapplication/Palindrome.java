package com.example.myapplication;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        int temp,r, sum = 0 ;

        Scanner n = new Scanner(System.in);
        System.out.print(" Enter number: ");
        int num = n.nextInt();
        //int n = 121;
        temp = num;
        while (num>0){
            r = num % 10;
            sum = (sum*10) + r;
            num = num/10;
        }
        if( sum==temp){
            System.out.print(" Yes, it's a palindrome");
        }
        else{
            System.out.print(" NO, it's not a palindrome");
        }

    }



}
