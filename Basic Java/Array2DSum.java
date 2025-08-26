
import java.util.*;;

// to sum two matrix
public class Array2DSum {
    
  static void printMat(int[][] matrix){
    for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[i].length;j++){
            System.out.print(matrix[i][j]+" ");
        }
        System.out.println();
    }
  }

static void sumMatrix(int[][] arr1,int r1,int c1, int[][] arr2,int r2 , int c2){
    if(r1!= r2 && c1!=c2){
        System.out.println("Wrong matrix size Addition not possible");
        return;
    }
    

int [][] sum= new int[r1][c1];
for(int i=0;i<r1;i++){
    for(int j=0;j<c1;j++){
        sum[i][j]= arr1[i][j]+arr2[i][j];
    }
}
  printMat(sum);  
}
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("enter rows");
    int r1= sc.nextInt();
    System.out.println("enter columns");
    int c1=sc.nextInt();

    System.out.println("enter elements in row ans column");
    int[][] arr1= new int[r1][c1];
    for(int i=0;i<r1;i++){
        for(int j=0;j<c1;j++){
            arr1[i][j]= sc.nextInt();
        }
    }
    System.out.println("enter rows");
    int r2= sc.nextInt();
    System.out.println("enter columns");
    int c2=sc.nextInt();

    System.out.println("enter elements in row ans column");
    int[][] arr2= new int[r2][c2];
    for(int i=0;i<r2;i++){
        for(int j=0;j<c2;j++){
            arr2[i][j]= sc.nextInt();
        }
    }
  System.out.println("Matrix 1:");
  System.out.println(arr1);
  System.out.println("MAtrix 2:");
  System.out.println(arr2);

   sumMatrix(arr1, r1,c1, arr2, r2,c2);
}

}