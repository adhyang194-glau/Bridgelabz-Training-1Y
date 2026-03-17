package com.gla.strings.level01;
public class IllegalArgumentDemo {
    public static int squareRoot(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number must be non-negative!");
        }
        return (int) Math.sqrt(number);
    }
    public static void main(String[] args) {
        System.out.println("Square root of 16: " + squareRoot(16));
        System.out.println("Square root of -9: " + squareRoot(-9));
        System.out.println("This line will not be executed.");
    }
}
