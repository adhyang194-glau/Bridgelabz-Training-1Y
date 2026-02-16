package com.gla.strings.level01;
public class NullPointerDemo {
    public static void main(String[] args) {
        String text = null;
        System.out.println("Length of text: " + text.length());
        System.out.println("This line will not be executed.");
    }
}
