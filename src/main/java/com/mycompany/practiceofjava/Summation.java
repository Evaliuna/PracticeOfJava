
package com.mycompany.practiceofjava;

import java.util.Scanner;

public class Summation {
    public static void main(String[] args) {
    try(Scanner input = new Scanner(System.in)){
    
    int x, y,z;
    System.out.println("Enter 3 digits : ");
    x = input.nextInt();
    y = input.nextInt();
    z = input.nextInt();
    int sum = x+y+z;
    System.out.println("Sum of this number is : "+sum);
}
}
}
