package com.gla.strings.level01;
import java.util.Scanner;
public class UpperCaseComparison {
    public static String toUpperManual(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'a' && c <= 'z') {
                result += (char)(c - 32);
            } else {
                result += c; // keep as is
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        String manualUpper = toUpperManual(text);
        String builtInUpper = text.toUpperCase();
        System.out.println("\nManual uppercase: " + manualUpper);
        System.out.println("Built-in uppercase: " + builtInUpper);
        if (manualUpper.equals(builtInUpper)) {
            System.out.println("✅ Both methods give the SAME result.");
        } else {
            System.out.println("❌ The results are DIFFERENT.");
        }
        sc.close();
    }
}