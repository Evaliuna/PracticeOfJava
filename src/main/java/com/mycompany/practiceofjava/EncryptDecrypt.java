
package com.mycompany.practiceofjava;
import java.util.Scanner;
public class EncryptDecrypt {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
        int x;
        System.out.print("Enter a number : ");
        x = input.nextInt();
        x += 8;
        System.out.println(x);
        x-=8;
        System.out.println(x);
    }
}
}
