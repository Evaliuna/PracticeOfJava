
package com.mycompany.practiceofjava;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            /*
            //it's an error code.
            int a = 10;
            if(a=11) System.out.println("I am 11");
            else System.out.println("I am not 11");
            */ 
           
            double sub1, sub2, sub3;
            System.out.print("Enter sub1 mark : ");
            sub1 = input.nextDouble();
            System.out.print("Enter sub2 mark : ");
            sub2 = input.nextDouble();
            System.out.print("Enter sub3 mark : ");
            sub3 = input.nextDouble();
            
            if(sub1>33 && sub2>33 && sub3>33) System.out.println("Pass");
            else System.out.println("Fail");
            
            double amount;
            System.out.print("Enter income sale : ");
            amount = input.nextDouble();
           
            if(amount>=2.5 && amount<=5.0) System.out.println("Tax is 5%.");
            else if(amount>=5.0 && amount<=10.0) System.out.println("Tax is 20%.");
            else if(amount>10.0) System.out.println("Tax is 30%.");
            else System.out.println("No Tax.");
            
            
            int day;
            System.out.print("Enter num of the day of the week : ");
            day = input.nextInt();
            
            switch(day){
                case 1 -> System.out.println("Saturday");
                case 2 -> System.out.println("February");
                case 3 -> System.out.println("Monday");
                case 4 -> System.out.println("Tuesday");
                case 5 -> System.out.println("Wendsday");
                case 6 -> System.out.println("Thusday");
                default -> System.out.println("Friday");
                }
              
        }
    }
}
