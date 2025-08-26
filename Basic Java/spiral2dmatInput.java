// enter the value of spiral matrix
import java.util.*;
public class spiral2dmatInput {

    static void printArray(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
       }
    

    static int[][] spiralMat(int n){
        int topRow=0;int rightCol=n-1;int bottomRow=n-1; int leftCol=0;
        int curr=1;
        int[][] arr= new int[n][n];
          while( curr<=n*n){
            for(int j=leftCol;j<=rightCol && curr<=n*n;j++){
               arr[topRow][j]=curr++;
                
            }
            topRow++;
            
            for(int i=topRow;i<=bottomRow && curr<=n*n;i++){
                arr[i][rightCol]=curr++;
                
            }
            rightCol--;
    
            for(int j=rightCol;j>=leftCol && curr<=n*n;j--){
                arr[bottomRow][j]=curr++;
                
            }
            bottomRow--;
        
            for(int i=bottomRow;i>=topRow && curr<=n*n;i--){
                arr[i][leftCol]= curr++;
               
            }
            leftCol++;
          }
          return arr;
     }
    
        public static void main(String[] args) {
           Scanner sc= new Scanner(System.in); 
           int n=sc.nextInt();
           
           int[][] matrix= spiralMat(n);
           printArray(matrix);
          
    
        }
    }


    
