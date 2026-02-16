import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		switch(a){
		 case 1: 
		     System.out.println("this is 0");
		 break;
		 case 2: 
		     System.out.println("this is 2");
		 break;
		 case 3: 
		    System.out.println("this is 3");
		 break;
		 case 4: 
		   System.out.println("this is 4");
		 break;
		 default:
		  System.out.println(" ");
		}
	}
}