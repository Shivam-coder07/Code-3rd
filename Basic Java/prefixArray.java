import java.util.*;
public class prefixArray {
   
   static int[] sumOfPrefix(int[] arr){
    for(int i=1;i<arr.length;i++){
        arr[i]=arr[i-1]+arr[i];
    }
    return arr;
   }
       public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       System.out.println("enter the size of an array");
       int n= sc.nextInt();
       int[] arr= new int[n];
       
       System.out.println("enter the elements of an array");
       for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
       }
       
       int[] ans=sumOfPrefix(arr);
       for(int i=0;i<ans.length;i++){
        System.out.print(ans[i]+" ");
       }
       
    }
   
}

