package com.gla.strings.level02;
import java.util.Scanner;
public class VowelConsonantClassifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        text = text.toLowerCase();
        System.out.println("\n===== CHARACTER CLASSIFICATION =====");
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    System.out.println(ch + " -> Vowel");
                } else {
                    System.out.println(ch + " -> Consonant");
                }
            } else {
                System.out.println(ch + " -> Not a Letter");
            }
        }
        System.out.println("====================================");
        sc.close();
    }
}
