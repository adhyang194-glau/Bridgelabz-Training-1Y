import java.util.Scanner;
public class SumUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        
        System.out.println("Enter numbers to add (enter 0 to stop):");
        while (true) {
        int num = sc.nextInt();
            if (num == 0) {
                break;
            }
            sum += num;
        }
        System.out.println("The sum of entered numbers is: " + sum);

        sc.close();
    }
}