import java.util.*;
public class AreaOfTriangle{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
	  double h = sc.nextDouble();
	  double b = sc.nextDouble();
	  double area = (b * h)/2;
	  System.out.println("The area of triangle is:" + area);
	}
}