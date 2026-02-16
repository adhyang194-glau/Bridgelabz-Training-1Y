import java.util.Scanner;
public class RocketLaunchCountdown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting number for countdown: ");
        int num = sc.nextInt();
        while (num >= 1) {
            System.out.println(num);
            num--; 
        }
        System.out.println("🚀 Launch!");
        
        sc.close();
    }
}