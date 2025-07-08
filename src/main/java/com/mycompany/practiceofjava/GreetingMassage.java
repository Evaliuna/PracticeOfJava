
package com.mycompany.practiceofjava;

import java.util.Scanner;

public class GreetingMassage {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            String name;
            System.out.print("Enter your name : ");
            name = input.nextLine();
            System.out.println("Hello "+name+", have a good day. ");
    }
}
}
