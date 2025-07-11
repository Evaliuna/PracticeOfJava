package com.mycompany.practiceofjava;
import java.util.Scanner;
        
public class TypeOfWebsite {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
              String url;
            System.out.print("Enter url of the website : ");
            url = input.nextLine();
            
            int com = url.indexOf(".com");
            int org = url.indexOf(".org");
            int bd = url.indexOf(".bd");
            
            if(com != -1) System.out.println("Commertial website");
            else if(org != -1) System.out.println("Organization website");
            else if(bd != -1) System.out.println("Bangladeshi website");
            else System.out.println("Not  a valid one");
            }
        }
}
