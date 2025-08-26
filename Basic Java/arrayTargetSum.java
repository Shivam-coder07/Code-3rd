import java.util.*;
public class arrayTargetSum {
       static int pairSum(int arr[],int target){
         int count=0;
         for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                if(arr[i]+arr[j]+ arr[k]==target){
                    count++;
                 }
                }
            }
         }
         return count;
       }
      public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size of an array");
        int n=sc.nextInt();
        int[] arr=new int[n]; 

        System.out.println("enter the value of an array");
        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }

        System.out.println("enter the target value");
         int target=sc.nextInt();

         System.out.println(pairSum(arr, target));
        
        }
    }

