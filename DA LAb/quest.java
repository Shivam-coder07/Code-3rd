import java.util.*;
public class quest {
     
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size of array");
        int n= sc.nextInt();
        System.out.println("enter elements of array");
        int[] arr= new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
            System.out.print(arr[i]+" ");
        }
        
          int sum1=0;
         for(int i=0;i<n/2;i++){
            sum1= sum1+arr[i];
        }
        System.out.println("sum1 "+sum1);
         int sum2=0;
         for(int i=n/2;i<n;i++){
            sum2= sum2+arr[i];
        }
         System.out.println("sum2 "+sum2);
        
         if( sum1> sum2){
         System.out.println("no");
         }
         else if( sum1< sum2){
            System.out.println("yes");
         }
         else{
            System.out.println("tie");
         }
    }
    
}
