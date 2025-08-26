// to find the second largest value in the array
import java.util.*;
public class arraySecondMax {
    static int firstMax(int[]arr){
        int mx= Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>mx){
                mx=arr[i];
            }
        }
        return mx;
    }
    static int SecondMax(int[] arr){
      int mx= firstMax(arr);
      for(int i=0;i<arr.length;i++){
        if(arr[i]==mx){
            arr[i]=Integer.MIN_VALUE;
        }
      }
      int ans=firstMax(arr);
      return ans;
    }

    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      System.out.println("enter the size of an array");

      int n= sc.nextInt();
      int[] arr= new int[n];

      System.out.println("enter the value of array");
      for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
      }
      System.out.println("the second largest element is "+ SecondMax(arr));

    }
}
