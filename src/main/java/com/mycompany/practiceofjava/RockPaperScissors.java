package com.mycompany.practiceofjava;
import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {  
    
    public static String getRandomOne(String[] strings) {
        if(strings == null || strings.length == 0) {
            return null;
        }
        Random random = new Random();
        int randomIndex = random.nextInt(strings.length);
        return strings[randomIndex];
    }
    
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)) {
            int i = 1;
            String[] choices = {"rock", "paper", "scissors"};  
            do {                    
                System.out.println("rock/paper/scissors!");
                String player = input.nextLine().toLowerCase();  
                String computer = getRandomOne(choices);
                System.out.println("Computer chose: " + computer);
                
                if(player.equals(computer)) {
                    System.out.println("Draw!");
                }
                else if(player.equals("rock")) {
                    if(computer.equals("paper")) {
                        System.out.println("You lose! Paper covers rock.");
                    } else { 
                        System.out.println("You win! Rock crushes scissors.");
                    }
                }
                else if(player.equals("paper")) {
                    if(computer.equals("scissors")) {
                        System.out.println("You lose! Scissors cut paper.");
                    } else {  
                        System.out.println("You win! Paper covers rock.");
                    }
                }
                else if(player.equals("scissors")) {
                    if(computer.equals("rock")) {
                        System.out.println("You lose! Rock crushes scissors.");
                    } else {  
                        System.out.println("You win! Scissors cut paper.");
                    }
                }
                else {
                    System.out.println("Invalid input! Please enter rock, paper, or scissors.");
                    i--;  
                }
                i++;
            } while (i <= 5);
        }
    }
}

//It's a game of Rock, Paper, sisor
