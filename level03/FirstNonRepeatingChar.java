package com.gla.strings.level03;
import java.util.Scanner;
public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char result = findFirstNonRepeating(input);
        if (result != '\0') {
            System.out.println("\nThe first non-repeating character is: " + result);
        } else {
            System.out.println("\nNo non-repeating character found.");
        }
        sc.close();
    }
    public static char findFirstNonRepeating(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                return ch;
            }
        }
        return '\0'; // Return null character if none found
    }
}
