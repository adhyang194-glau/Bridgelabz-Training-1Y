package com.gla.strings.level02;
import java.util.Scanner;
import java.util.ArrayList;
public class SplitWordsComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();
        ArrayList<String> wordsList = new ArrayList<>();
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch != ' ') {
                word.append(ch);
            } else {
                if (word.length() > 0) {
                    wordsList.add(word.toString());
                    word.setLength(0);
                }
            }
        }
        if (word.length() > 0) {
            wordsList.add(word.toString());
        }
        String[] splitWords = text.split("\\s+");
        System.out.println("\nManual Split Result:");
        for (String w : wordsList) {
            System.out.println(w);
        }
        System.out.println("\nSplit() Method Result:");
        for (String w : splitWords) {
            System.out.println(w);
        }
        sc.close();
    }
}
