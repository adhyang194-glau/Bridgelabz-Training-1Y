import java.util.*;
public class QuotientAndReminder{
   public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   double a = sc.nextDouble();
   double b = sc.nextDouble();
   double quotient = a / b;
   double reminder = a % b;
   System.out.println("Quotient or reminder" + quotient+ " and " + reminder);
   }
}