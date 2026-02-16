import java.util.Scanner;
public class PowerCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int exponent = sc.nextInt();
        long result = 1;
        int i = 1;
        while (i <= exponent) {
            result = result * base;
            i++;
        }
        System.out.println(base + " raised to the power " + exponent + " is: " + result);
    }
}