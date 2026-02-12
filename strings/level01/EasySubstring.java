package com.gla.strings.level01;
import java.util.Scanner;
public class EasySubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();
        System.out.print("Enter start index: ");
        int start = sc.nextInt();
        System.out.print("Enter end index: ");
        int end = sc.nextInt();
        String manualSubstring = "";
        for (int i = start; i < end; i++) {
            manualSubstring += text.charAt(i);
        }
        String builtInSubstring = text.substring(start, end);
        System.out.println("\nManual substring (charAt): " + manualSubstring);
        System.out.println("Built-in substring: " + builtInSubstring);
        if (manualSubstring.equals(builtInSubstring)) {
            System.out.println("✅ Both substrings are the SAME.");
        } else {
            System.out.println("❌ Substrings are DIFFERENT.");
        }
        sc.close();
    }
}