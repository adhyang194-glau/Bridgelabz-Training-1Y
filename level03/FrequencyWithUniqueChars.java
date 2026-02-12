package com.gla.strings.level03;

import java.util.Scanner;

public class FrequencyWithUniqueChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println("\nCharacter frequencies:");
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (input.indexOf(ch) != i) {
                continue;
            }
            int count = 0;
            for (int j = 0; j < input.length(); j++) {
                if (input.charAt(j) == ch) {
                    count++;
                }
            }
            System.out.println(ch + " : " + count);
        }

        sc.close();
    }
}
