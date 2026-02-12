package com.gla.strings.level03;

import java.util.Scanner;

class Person {
    double height;
    double weight;
    double bmi;
    String status;

    Person(double height, double weight) {
        this.height = height;
        this.weight = weight;
        this.bmi = calculateBMI();
        this.status = determineStatus();
    }
    private double calculateBMI() {
        return weight / (height * height);
    }
    private String determineStatus() {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            return "Normal";
        } else if (bmi >= 25 && bmi < 29.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
    public void display() {
        System.out.printf("%-10.2f %-10.2f %-10.2f %-15s%n", height, weight, bmi, status);
    }
}

public class TeamBMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person[] team = new Person[10];

        System.out.println("Enter height (in meters) and weight (in kg) for 10 members:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Member " + (i + 1) + " - Height: ");
            double height = sc.nextDouble();
            System.out.print("Member " + (i + 1) + " - Weight: ");
            double weight = sc.nextDouble();
            team[i] = new Person(height, weight);
        }

        System.out.println("\nTeam BMI Report:");
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Height", "Weight", "BMI", "Status");
        System.out.println("----------------------------------------------------------");

        for (Person p : team) {
            p.display();
        }

        sc.close();
    }
}
