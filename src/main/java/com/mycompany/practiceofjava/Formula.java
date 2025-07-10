package com.mycompany.practiceofjava;

import java.util.Scanner;

public class Formula {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
         double v, u, a,s;
         System.out.print("Enter the value of v : ");
         v = input.nextDouble();
         System.out.print("Enter the value of u : ");
         u = input.nextDouble();
         System.out.print("Enter the value of a : ");
         a = input.nextDouble();
         System.out.print("Enter the value of s : ");
         s = input.nextDouble();
   
         double formula = ((v*v) - (u*u))/(2*a*s) ;
         System.out.println("Result of this expression : " +formula);
         
        }
    }
}