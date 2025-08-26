// taking 2D array input
import java.util.*;
public class Array2DInput {
    
static void printArray(int[][] arr){
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }
}
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("enter rows");
    int r= sc.nextInt();
    System.out.println("enter columns");
    int c=sc.nextInt();

    System.out.println("enter elements in row ans column");
    int[][] arr= new int[r][c];
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
            arr[i][j]= sc.nextInt();
        }
    }
    System.out.println("printed array:");
    printArray(arr);

}

}
