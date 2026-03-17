package com.gla.strings.level01;
public class NumberFormatDemo {
    public static void main(String[] args) {
        String validNumber = "123";
        int num1 = Integer.parseInt(validNumber);
        System.out.println("Valid conversion: " + num1);
        String invalidNumber = "123abc";
        int num2 = Integer.parseInt(invalidNumber);
        System.out.println("This line will not be executed.");
    }
}
