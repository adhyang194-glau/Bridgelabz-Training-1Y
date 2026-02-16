import java.util.Scanner;
public class GreatestFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num > 1) {
            int i = num - 1; 
            while (i > 0) {
                if (num % i == 0) {
                    System.out.println("Greatest factor of " + num + " (besides itself) is: " + i);
                    break; 
                }
                i--;
            }
        } else {
            System.out.println("Please enter an integer greater than 1!");
        }
    }
}