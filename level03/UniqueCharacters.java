package com.gla.strings.level03;

import java.util.Scanner;

public class UniqueCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println("\nUnique characters in the string:");
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (input.indexOf(ch) == input.lastIndexOf(ch)) {
                System.out.print(ch + " ");
            }
        }

        sc.close();
    }
}
