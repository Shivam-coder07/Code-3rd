import java.util.*;
public class quest {
     
    static void display(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size of array");
        int n= sc.nextInt();
        System.out.println("enter elements of array");
        int[] arr= new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }

        int mid= n/2;
        
          int sum1=0;
         for(int i=0;i<mid;i++){
            sum1= sum1+arr[i];
        }
        System.out.println("sum1 "+sum1);
         int sum2=0;
         for(int i=mid;i<n;i++){
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
