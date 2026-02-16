import java.util.*;
public class GreatestOfThree{
     public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  int a = sc.nextInt();
  	  int b = sc.nextInt();
      int c = sc.nextInt();
	  if(a > b && b > c){
		  System.out.println("a is greatest" + a);
	  }
	  else if(b > a && b > c ){
		  System.out.println("b is greatest" + b);
	  }
	  else if(c > a && c > b){
		  System.out.println("c is greatest" + c);
	  }
	  else{
		  System.out.println(" ");
	  }
	 }
}