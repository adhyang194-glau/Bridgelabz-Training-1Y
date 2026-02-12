package com.gla.strings.level01;
public class ArrayIndexOutOfBoundsDemo {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println("Element at index 2: " + numbers[2]);
        System.out.println("Element at index 10: " + numbers[10]);
        System.out.println("This line will not be executed.");
    }
}

