package com.gla.strings.level03;

import java.util.Scanner;
import java.util.Calendar;

public class CalendarDisplay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int year = sc.nextInt();
        Calendar cal = Calendar.getInstance();
        cal.set(year, month - 1, 1); // month is 0-based in Calendar
        int firstDayOfWeek = cal.get(Calendar.DAY_OF_WEEK); // Sunday=1, Monday=2, ...
        int daysInMonth = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        System.out.println("\nCalendar for " + month + "/" + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        for (int i = 1; i < firstDayOfWeek; i++) {
            System.out.print("    ");
        }
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%3d ", day);
            if ((day + firstDayOfWeek - 1) % 7 == 0) {
                System.out.println();
            }
        }
        sc.close();
    }
}
