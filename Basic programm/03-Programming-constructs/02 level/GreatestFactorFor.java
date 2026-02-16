import java.util.Scanner;
public class GreatestFactorFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num > 1) {
            for (int i = num - 1; i > 0; i--) {
                if (num % i == 0) {
                    System.out.println("Greatest factor of " + num + " (besides itself) is: " + i);
                    break; 
                }
            }
        } else {
            System.out.println("Please enter an integer greater than 1!");
        }
    }
}