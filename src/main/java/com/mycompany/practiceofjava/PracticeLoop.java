package com.mycompany.practiceofjava;
import java.util.Scanner;

public class PracticeLoop {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            //pattern printing
            System.out.println("****\n***\n**\n*");
            //variable declaretion
            int n, sum = 0, multiplication_table = 1, factorial = 1, i= 1;
            System.out.print("Enter n : ");
            n = input.nextInt();
            //sum of even numbers
            for( i = 0;i<=n;i++){
                if(i%2==0){
                sum +=i;
                }
            }
            System.out.println("The sum even numbers : " +sum);
            //multiplication table of n
            System.out.println("The multiplication table of "+n);
            for(i = 1; i<=n;i++){
                multiplication_table = i*n;
                System.out.println(n + " * " + i + " = " +multiplication_table);
            }
            //multiplication table in reverse
            System.out.println("Multiplication table of 10 in reverse :");
             for(i = 10; i>0;i--){
                multiplication_table = i*10;
                System.out.println(n + " * " + i + " = " +multiplication_table);
            }
             // factorial in for loop
             System.out.println("Factorial of : "+n);
            for( i = n; i >= 1 ;i--) {
                factorial *= i;
            }
            System.out.println(factorial);
            //factorial in while loop
            int j = n;
            System.out.println("Factorial of :"+n);
            while(j>=1){
                factorial *= j;
                j--;
            }
            System.out.println(factorial);
            //Printing pattern using while loop-- error here
            j = 4;
            while(j > 0){
            i = 1;
            while(i <= j){
            System.out.print("*");
            i++;
            }
            System.out.print("\n");
            j--;
            }
            //Sum  of  the number in the multiplication table of 8
            System.out.println(" Sum  of  the number in the multiplication table of 8 :");
             for(i = 10; i>0;i--){
                multiplication_table = i*10;
                sum += multiplication_table;
            }
             System.out.println(sum);
             
                
        }
    }
}
