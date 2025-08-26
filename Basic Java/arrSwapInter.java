
import java.util.Scanner;

public class arrSwapInter {

   static void swap(int[] arr, int i,int j){
    int temp= arr[i];
     arr[i]= arr[j];
     arr[j]= temp;
   }
   
   static void Swapinteger(int[] arr){
    int n=arr.length;
    int left=0;
    int right=n-1;
    while(left<right){
        if(arr[left]%2!=0 && arr[right]%2==0){
            swap(arr, left, right);
        }
        if(arr[left]%2==0){
            left++;
        }
        if(arr[right]%2!=0){
            right--;
        }
    }

   }

    public static void main(String[] args) {
     System.out.println("enter the size of an array"); 
     Scanner sc= new Scanner(System.in);
     int n= sc.nextInt();
     int arr[]= new int[n];

     System.out.println("enter the elemnets of an array");
     for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();}

     Swapinteger(arr);
     for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
     
     }
    }
}
