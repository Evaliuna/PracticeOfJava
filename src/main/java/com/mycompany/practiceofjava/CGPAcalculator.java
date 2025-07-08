
package com.mycompany.practiceofjava;

import java.util.Scanner;

public class CGPAcalculator {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            double edc, oop, aol;
           /*
            System.out.println("------------------------------------------------");
            System.out.println("| Numerical Grade | Letter Grade | Grade point |");
            System.out.println("|      80-100     |       A+     |      4.00   |");
            System.out.println("|      75-79      |       A      |      3.75   |");
            System.out.println("|      70-74      |       A-     |      3.50   |");
            System.out.println("|      65-69      |       B+     |      3.25   |");
            System.out.println("|      60-64      |       B      |      3.00   |");
            System.out.println("|      55-59      |       B-     |      2.75   |");
            System.out.println("|      50-54      |       C+     |      2.50   |");
            System.out.println("|      45-49      |       C      |      2.25   |");
            System.out.println("|      40-44      |       D      |      2.00   |");
            System.out.println("|   Less then 40  |       F      |      0.00   |");
            System.out.println("------------------------------------------------");

            */
            System.out.println("Electronic  Devices and Circuit : ");
            edc = input.nextDouble();
            System.out.println("Object Oriented Programming : ");
            oop = input.nextDouble();
            System.out.println("Arts Of Living :");
            aol = input.nextDouble();
            
            
            double cgpa = (edc+oop+aol)/30;
            System.out.printf("Total CGPA = %.1f",cgpa);//out of 10
        }
    }
    
    
}
