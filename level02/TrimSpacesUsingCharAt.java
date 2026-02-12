package com.gla.strings.level02;
import java.util.Scanner;
public class TrimSpacesUsingCharAt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        int start = 0;
        int end = text.length() - 1;
        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }
        String trimmed = "";
        for (int i = start; i <= end; i++) {
            trimmed += text.charAt(i);
        }
        System.out.println("\n===== RESULT =====");
        System.out.println("Original String: \"" + text + "\"");
        System.out.println("Trimmed String:  \"" + trimmed + "\"");
        System.out.println("==================");
        sc.close();
    }
}
