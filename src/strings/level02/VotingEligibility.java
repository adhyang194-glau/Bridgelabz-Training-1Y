package com.gla.strings.level02;
import java.util.Scanner;
public class VotingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[10];
        System.out.println("Enter the ages of 10 students:");
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Student " + (i + 1) + " age: ");
            ages[i] = sc.nextInt();
        }
        System.out.println("\n===== VOTING ELIGIBILITY RESULT =====");
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] >= 18) {
                System.out.println("Student " + (i + 1) + " (Age: " + ages[i] + ") -> Can Vote");
            } else {
                System.out.println("Student " + (i + 1) + " (Age: " + ages[i] + ") -> Cannot Vote");
            }
        }
        System.out.println("=====================================");
        sc.close();
    }
}
