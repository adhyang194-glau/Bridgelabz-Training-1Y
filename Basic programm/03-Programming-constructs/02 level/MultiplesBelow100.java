import java.util.Scanner;
public class MultiplesBelow100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num > 0) {
            System.out.println("Multiples of " + num + " below 100 are:");
            for (int i = 1; i * num < 100; i++) {
                System.out.print((i * num) + " ");
            }
        } else {
            System.out.println("Please enter a positive integer!");
        }
    }
}