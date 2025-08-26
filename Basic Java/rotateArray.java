// rotate an array by 90 degree
import java.util.*;
public class rotateArray {

    static void printArray(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
      }
      static void inplacetranspose(int[][] arr, int r1, int c1){
        for(int i=0;i<r1;i++){
            for(int j=i;j<c1;j++){
               int temp= arr[i][j];
               arr[i][j]= arr[j][i];
               arr[j][i]=temp;
            }
        }
    }

    static void reverse(int[] arr ){
        int i=0;
        int j= arr.length-1;
        while(i<j){
            int temp= arr[i];
            arr[i]= arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }

    static void rotate(int[][] arr, int n){
       inplacetranspose(arr, n, n);
       for(int i=0;i<n;i++){
        reverse(arr[i]);
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
        System.out.println("the rotated array");
        rotate(arr1, c1);
        printArray(arr1);
        }
    }

