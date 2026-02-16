import java.util.Scanner;
public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee name: ");
        String name = sc.nextLine();
        System.out.print("Enter years of service: ");
        int years = sc.nextInt();
        double bonus;
        if (years >= 10) {
            bonus = 25000;  
        } else if (years >= 5) {
            bonus = 15000;   
        } else if (years >= 2) {
            bonus = 12000;   
        } else {
            bonus = 10000;   
        }
        System.out.println("\nEmployee: " + name);
        System.out.println("Years of Service: " + years);
        System.out.println("Bonus Awarded: ₹" + bonus);
    }
}