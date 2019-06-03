package com.example.myapplication;

import java.util.Scanner;

public class HelloWorld{
    public static void main(String[] args){
        Scanner text = new Scanner(System.in);
        System.out.print("Enter a string = ");

        String newstr = text.nextLine();

        System.out.print("Enterd line is = " +newstr);

    }

}
