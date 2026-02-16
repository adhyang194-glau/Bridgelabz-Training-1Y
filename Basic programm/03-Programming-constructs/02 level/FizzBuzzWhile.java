import java.util.Scanner;
public class FizzBuzzWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();
        if (n > 0) {
            System.out.println("FizzBuzz results up to " + n + ":");
            int i = 1; 
            while (i <= n) {
                if (i % 4 == 0) {
                    System.out.println("FizzBuzz");
                }  
                 else {
                    System.out.println(i);
                }
                i++;
            }
        } else {
            System.out.println("Please enter a positive integer!");
        }
    }
}