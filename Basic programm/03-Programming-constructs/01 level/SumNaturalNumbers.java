import java.util.Scanner;
public class SumNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number (n): ");
        int n = sc.nextInt();
        int sumLoop = 0;
        for (int i = 1; i <= n; i++) {
            sumLoop += i;
        }
        System.out.println("Sum of first " + n + " natural numbers (loop): " + sumLoop);
        int sumFormula = n * (n + 1) / 2;
        System.out.println("Sum of first " + n + " natural numbers (formula): " + sumFormula);

        sc.close();
    }
}