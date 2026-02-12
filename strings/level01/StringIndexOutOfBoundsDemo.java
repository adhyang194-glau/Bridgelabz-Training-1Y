package com.gla.strings.level01;
public class StringIndexOutOfBoundsDemo {
    public static void main(String[] args) {
        String text = "Hello";
        System.out.println("Character at index 10: " + text.charAt(10));
        System.out.println("This line will not be executed.");
    }
}
