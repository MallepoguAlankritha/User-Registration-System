package com.bridgelabz.regex.Emailvalidation;

import java.util.Scanner;
import java.util.regex.Pattern;
public class emailValidation {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        scanner = new Scanner(System.in);
        System.out.print("Enter email ID :: ");
        String Email = scanner.next();
        Boolean answer = Pattern.matches("[a-zA-Z0-9_.]*[-]*[+]*[a-zA-Z0-9]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+", Email);
        if (answer) {
            System.out.println("Valid Email!");
        } else {
            System.out.println("Enter valid Email");
        }
    }
}