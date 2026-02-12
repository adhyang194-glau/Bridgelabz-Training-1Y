package com.gla.strings.level03;

import java.util.Scanner;

public class FrequencyNestedLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println("\nCharacter frequencies:");
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            boolean alreadyCounted = false;
            for (int k = 0; k < i; k++) {
                if (input.charAt(k) == ch) {
                    alreadyCounted = true;
                    break;
                }
            }
            if (alreadyCounted) {
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
