package com.gla.strings.level02;
import java.util.Scanner;
public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int physics = sc.nextInt();
        int chemistry = sc.nextInt();
        int maths = sc.nextInt();
        int total = physics + chemistry + maths;
        double percentage = total / 3.0;
        String grade;
        if (percentage >= 90) {
            grade = "A+";
        } else if (percentage >= 80) {
            grade = "A";
        } else if (percentage >= 70) {
            grade = "B";
        } else if (percentage >= 60) {
            grade = "C";
        } else if (percentage >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }
        System.out.println("\n===== RESULT =====");
        System.out.println("Physics Marks:   " + physics);
        System.out.println("Chemistry Marks: " + chemistry);
        System.out.println("Maths Marks:     " + maths);
        System.out.println("Total Marks:     " + total);
        System.out.println("Percentage:      " + percentage + "%");
        System.out.println("Grade:           " + grade);
        System.out.println("==================");
        sc.close();
    }
}
