package com.gla.strings.level02;
import java.util.Scanner;
public class StringLengthWithoutLengthMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] charArray = str.toCharArray();
        int count = 0;
        for (char c : charArray) {
            count++;
        }
        System.out.println("The length of the string is: " + count);
        sc.close();
    }
}
