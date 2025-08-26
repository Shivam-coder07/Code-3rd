// to print spiral matrix
import java.util.*;
public class Spiral2dArray {

   static void printArray(int[][] arr){
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }
   }

   static void spiralMat(int[][] arr, int r,int c){
    int topRow=0;int rightCol=c-1;int bottomRow=r-1; int leftCol=0;
    int totalElements=0;
      while(totalElements<r*c){
        for(int j=leftCol;j<=rightCol && totalElements<r*c;j++){
            System.out.print(arr[topRow][j]+" ");
            totalElements++;
        }
        topRow++;
        
        for(int i=topRow;i<=bottomRow && totalElements<r*c;i++){
            System.out.print(arr[i][rightCol]+" ");
            totalElements++;
        }
        rightCol--;

        for(int j=rightCol;j>=leftCol && totalElements<r*c;j--){
            System.out.print(arr[bottomRow][j]+" ");
            totalElements++;
        }
        bottomRow--;
    
        for(int i=bottomRow;i>=topRow && totalElements<r*c;i--){
            System.out.print(arr[i][leftCol]+" ");
            totalElements++;
        }
        leftCol++;
      }
 }

    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in); 
       System.out.println("row");
       int r=sc.nextInt();
       System.out.println("column");
       int c=sc.nextInt();
       int[][] arr= new int[r][c];

      System.out.println("enter the elements of array");
      for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
          arr[i][j]=sc.nextInt();
        }
      }
       spiralMat(arr, r, c);
      

    }
}
