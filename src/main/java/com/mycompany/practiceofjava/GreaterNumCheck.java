package com.mycompany.practiceofjava;

import java.util.Scanner;

public class GreaterNumCheck {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            int x = 20;
            System.out.println("Enter a number : ");
            int z = input.nextInt();
            System.out.println("Is given number is greater then user entered : "+ (x>z));
        }
    }
}
