package com.gla.strings.level02;
import java.util.Scanner;
import java.util.Random;
public class RockPaperScissorsGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int playerWins = 0;
        int computerWins = 0;
        int draws = 0;
        System.out.print("Enter number of rounds to play: ");
        int rounds = sc.nextInt();
        sc.nextLine();
        System.out.println("\n===== ROCK-PAPER-SCISSORS GAME =====");
        for (int i = 1; i <= rounds; i++) {
            System.out.print("\nRound " + i + " - Enter Rock, Paper, or Scissors: ");
            String playerChoice = sc.nextLine().toLowerCase();
            int compChoiceNum = rand.nextInt(3);
            String computerChoice = "";
            if (compChoiceNum == 0) computerChoice = "rock";
            else if (compChoiceNum == 1) computerChoice = "paper";
            else computerChoice = "scissors";
            System.out.println("Computer chose: " + computerChoice);
            if (playerChoice.equals(computerChoice)) {
                System.out.println("Result: Draw");
                draws++;
            } else if ((playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
                    (playerChoice.equals("paper") && computerChoice.equals("rock")) ||
                    (playerChoice.equals("scissors") && computerChoice.equals("paper"))) {
                System.out.println("Result: Player Wins!");
                playerWins++;
            } else {
                System.out.println("Result: Computer Wins!");
                computerWins++;
            }
        }
        double playerWinPercent = (playerWins * 100.0) / rounds;
        double computerWinPercent = (computerWins * 100.0) / rounds;
        System.out.println("\n===== GAME STATS =====");
        System.out.printf("%-10s %-10s %-10s %-15s %-15s\n", "Player", "Computer", "Draws", "Player Win %", "Computer Win %");
        System.out.printf("%-10d %-10d %-10d %-15.2f %-15.2f\n", playerWins, computerWins, draws, playerWinPercent, computerWinPercent);
        System.out.println("======================");

        sc.close();
    }
}
