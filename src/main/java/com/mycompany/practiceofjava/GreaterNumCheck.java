package com.mycompany.practiceofjava;

import java.util.Scanner;

public class GreaterNumCheck {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            int x = 20;
            System.out.print("Enter a number : ");
            int z = input.nextInt();
            if(x>z){
                System.out.println("Given number is greater then user entered. ");
            }
            else{
                System.out.println("User entered number is greater then given number. ");
            }
        }
    }
}
