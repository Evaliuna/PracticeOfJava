
package com.mycompany.practiceofjava;

import java.util.Scanner;


public class KiloToMile {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            double kilo;
            System.out.println("Enter kilometer = ");
            kilo = input.nextDouble();
            double mile = kilo/1.6;
            System.out.printf("Mile = %.2f",mile);
        }
    }
}
