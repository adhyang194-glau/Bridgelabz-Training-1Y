import java.util.Scanner;
public class MultiplesWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num > 0) {
            System.out.println("Multiples of " + num + " below 100 are:");
            int i = 1; // loop counter
            while (i * num < 100) {
                System.out.print((i * num) + " ");
                i++; // increment counter
            }
        } else {
            System.out.println("Please enter a positive integer!");
        }
    }
}