import java.util.*;
 public class Array2D {
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         int rows = arr.length;
         int cols = arr[0].length;
         for(int i=0;i<rows;i++){
             for(int j=0;j<cols;j++){
                 arr[i][j] = sc.nextInt();
             }
         }
         // ptinting
         for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
              System.out.print(arr[i][j] + " ");
          }
          System.out.println();
         }
     }

 }