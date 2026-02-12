package com.gla.strings.level02;
import java.util.Scanner;
public class ShortestLongestWordFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[] words = text.split("\\s+");
        String shortest = words[0];
        String longest = words[0];
        for (String word : words) {
            if (word.length() < shortest.length()) {
                shortest = word;
            }
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        System.out.println("\n===== RESULT =====");
        System.out.println("Shortest word: " + shortest + " (Length: " + shortest.length() + ")");
        System.out.println("Longest word: " + longest + " (Length: " + longest.length() + ")");
        System.out.println("==================");
        sc.close();
    }
}