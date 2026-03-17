package com.gla.strings.level03;

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String normalized = input.replaceAll("\\s+", "").toLowerCase();
        boolean isPalindrome = true;
        for (int i = 0; i < normalized.length() / 2; i++) {
            if (normalized.charAt(i) != normalized.charAt(normalized.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("\nThe text \"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\nThe text \"" + input + "\" is NOT a palindrome.");
        }

        sc.close();
    }
}
