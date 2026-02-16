 import java.util.*;
 public class TotalPriceCalculator{
   public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   double unitprice = sc.nextDouble();
   double quantity = sc.nextDouble();
   double totalprice = unitprice * quantity;
   System.out.println("Total price" + totalprice);
   }
 }