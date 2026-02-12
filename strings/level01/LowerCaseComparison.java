package com.gla.strings.level01;
import java.util.Scanner;
public class LowerCaseComparison {
    public static String toLowerManual(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                result += (char)(c + 32);
            } else {
                result += c;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        String manualLower = toLowerManual(text);
        String builtInLower = text.toLowerCase();
        System.out.println("\nManual lowercase: " + manualLower);
        System.out.println("Built-in lowercase: " + builtInLower);
        if (manualLower.equals(builtInLower)) {
            System.out.println("✅ Both methods give the SAME result.");
        } else {
            System.out.println("❌ The results are DIFFERENT.");
        }
        sc.close();
    }
}
