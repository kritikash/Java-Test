package com.example.myapplication;

import java.util.Scanner;

public class StringPrint {
    public static void main(String[] args)
    {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter the string = ");

        java.lang.String str = myObj.nextLine();

        System.out.print("The string entered is =  "+ str);

        }
    }

