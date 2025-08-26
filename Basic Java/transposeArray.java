// transpose of the array
import java.util.*;
public class transposeArray {

  static void printArray(int[][] arr){
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }
  }
//  by creating a new  array
 /*  static int[][] transpose(int[][] arr1,int r1, int c1){
    int[][] ans= new int[c1][r1];
    for(int i=0;i<c1;i++){
        for(int j=0;j<r1;j++){
         ans[i][j]=arr1[j][i];
        }           
    }
    return ans;
  }
*/
// without creating a new array
static void inplacetranspoe(int[][] arr, int r1, int c1){
    for(int i=0;i<r1;i++){
        for(int j=i;j<c1;j++){
           int temp= arr[i][j];
           arr[i][j]= arr[j][i];
           arr[j][i]=temp;
        }
    }
}

    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      System.out.println("enter the arr1 row");  
      int r1= sc.nextInt();
      System.out.println("enter the arr1 col");
      int c1= sc.nextInt();
      int[][] arr1= new int[r1][c1];
      System.out.println("enter the elements of arr1");
      for(int i=0;i<r1;i++){
        for(int j=0;j<c1;j++){
            arr1[i][j]=sc.nextInt();
        }
      }
      System.out.println("the transpose");
      inplacetranspoe(arr1, r1, c1);
      printArray(arr1);    
}
}
