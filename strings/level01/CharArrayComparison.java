package com.gla.strings.level01;
import java.util.Scanner;
public class CharArrayComparison {
    // User-defined method to return all characters in a string
    public static char[] getChars(String text) {
        char[] chars = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            chars[i] = text.charAt(i);
        }
        return chars;
    }
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        char[] manualChars = getChars(text);
        char[] builtInChars = text.toCharArray();
        System.out.print("\nManual char array: ");
        for (char c : manualChars) {
            System.out.print(c + " ");
        }
        System.out.print("\nBuilt-in char array: ");
        for (char c : builtInChars) {
            System.out.print(c + " ");
        }
        boolean areSame = compareCharArrays(manualChars, builtInChars);
        System.out.println("\n\nComparison result: " + (areSame ? "✅ SAME" : "❌ DIFFERENT"));

        sc.close();
    }
}
