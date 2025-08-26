// prefix sum of 2d array by brute force approach
import java.util.*;
public class sumofArray {
  
  static void printArray(int[][] arr){
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }
  }
  
  static int findSum(int[][] mat,int r1,int c1,int r2,int c2){
    int sum=0;
    for(int i=r1;i<=r2;i++){
        for(int j=c1;j<=c2;j++){
            sum+=mat[i][j];
        }
    }
    return sum;
  }
 // approach 2 
 

    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("enter no of rows and column");
     int r=sc.nextInt();
     int c=sc.nextInt();
     int[][] arr= new int[r][c];
      System.out.println("elements of array");

      for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr.length;j++){
            arr[i][j]=sc.nextInt();
        }
      }
      System.out.println("enter the elemsnts");
     int r1=sc.nextInt();
     int r2=sc.nextInt();
     int c1=sc.nextInt();
     int c2=sc.nextInt();
    

System.out.println(findSum(arr, r1, r2, c1, c2));     
    }
}
