package com.mycompany.practiceofjava;

public class PracticeString {
    public static void main(String[] args) {
        String str = "   SamieaJahanEva   ";
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.replace(' ', '_'));
        String letter = "Dear <|name|>, Trans a lot";
        System.out.println(letter.replace("<|name|>", "Eva"));
        String space = "you  no   me";
        System.out.println(space.indexOf("  ") +" "+ space.indexOf("   "));
        System.out.println("\" Dear Harry, This Java Course is nice Thanks\"");
    }
}
