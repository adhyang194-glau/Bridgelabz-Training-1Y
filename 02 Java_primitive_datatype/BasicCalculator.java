import java.util.*;
public class BasicCalculator{
   public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int a = sc.nextInt();
   int b = sc.nextInt();
    switch(a){
	 case 1: 
	 System.out.println("Addition" + (a+b));
	 break;
	 case 2: 
	 System.out.println("Substraction" + (a-b));
	 break;
	 case 3:
	 System.out.println("Multiplication" + (a*b));
	 case 4:
	 System.out.println("Division" + (a/b));
	 break;
	 case 5:
	 System.out.println("Modulus" + (a%b));
	 break;
	 default:
	 System.out.println(" "); 
	}
   }
}