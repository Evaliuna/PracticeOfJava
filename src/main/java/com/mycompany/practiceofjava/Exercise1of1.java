
package com.mycompany.practiceofjava;

import java.util.Scanner;


public class Exercise1of1 {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            double bang, eng, math, phy, che;
            System.out.print("Bangla :");
            bang = input.nextDouble();
            System.out.print("English :");
            eng = input.nextDouble();
            System.out.print("Math :");
            math = input.nextDouble();
            System.out.print("Physics :");
            phy = input.nextDouble();
            System.out.print("Chemistry :");
            che = input.nextDouble();
            
            double percentage = ((bang+eng+math+phy+che)/(5*100))*100;
            
            System.out.println("Percentage of his/her marks is : "+percentage+"%");
            
        }
    }
        
}
 