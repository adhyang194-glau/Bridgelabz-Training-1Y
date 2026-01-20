import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance in meters: ");
        double meters = sc.nextDouble();
        double yards = meters * 1.09361;   // 1 meter = 1.09361 yards
        double miles = meters / 1609.34;   // 1 mile = 1609.34 meters
        System.out.println("Distance in yards: " + yards);
        System.out.println("Distance in miles: " + miles);

        sc.close();
    }
}