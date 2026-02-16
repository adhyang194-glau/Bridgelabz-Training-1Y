import java.util.Scanner;
public class RocketCountdown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting number for countdown: ");
        int num = sc.nextInt();
        for (int i = num; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("🚀 Launch!");

        sc.close();
    }
}