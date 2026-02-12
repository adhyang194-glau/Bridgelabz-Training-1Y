package com.gla.strings.level02;
import java.util.Scanner;

public class WordsWithLengths2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input text from user
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        // Split text into words using split()
        String[] words = text.split("\\s+");

        // Create 2D array: rows = number of words, columns = 2 (word + length)
        String[][] wordData = new String[words.length][2];


        for (int i = 0; i < words.length; i++) {
            wordData[i][0] = words[i];                   // word
            wordData[i][1] = String.valueOf(words[i].length()); // length
        }

        // Display results
        System.out.println("\nWords and their lengths:");
        for (int i = 0; i < wordData.length; i++) {
            System.out.println("Word: " + wordData[i][0] + " | Length: " + wordData[i][1]);
        }

        sc.close();
    }
}
