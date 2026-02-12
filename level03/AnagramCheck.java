package com.gla.strings.level03;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text1 = sc.nextLine();
        String text2 = sc.nextLine();
        String normalized1 = text1.replaceAll("\\s+", "").toLowerCase();
        String normalized2 = text2.replaceAll("\\s+", "").toLowerCase();
        char[] arr1 = normalized1.toCharArray();
        char[] arr2 = normalized2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        boolean isAnagram = Arrays.equals(arr1, arr2);
        if (isAnagram) {
            System.out.println("\nThe texts \"" + text1 + "\" and \"" + text2 + "\" are anagrams.");
        } else {
            System.out.println("\nThe texts \"" + text1 + "\" and \"" + text2 + "\" are NOT anagrams.");
        }

        sc.close();
    }
}
