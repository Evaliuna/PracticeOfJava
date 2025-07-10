
package com.mycompany.practiceofjava;

import java.util.Scanner;

public class DetectInt {
    public static void main(String[] args){
        try(Scanner input = new Scanner(System.in)){
                double num;
                System.out.println("Enter the number : ");
                num = input.nextDouble();
                int check = (int)num;
               if(check == num) {
                    System.out.println("It is an Integer.");
               }
               else{
                System.out.println("No, it's not.");
               }    
        }      
    }
}
