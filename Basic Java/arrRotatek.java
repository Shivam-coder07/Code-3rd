// to rotae an array to kth position
import java.util.*;
public class arrRotatek {
    static int[]rotate(int[] arr, int k){
        int n= arr.length;
        k=k%n;
        int[] ans= new int[n];
        int j=0;
        for(int i=n-k; i<n;i++){
            ans[j++]=arr[i];
        }
         for(int i=0;i<n-k;i++){
            ans[j++]=arr[i];
         }
        return ans;
    }

   // to reverse an array 
//    static void rev(int[] arr,int i,int j){
//     while(i<j){
//         swap(arr,i,j);
//         i++;
//         j--;
//     }

//    }




    // to rotae an array to kth position without an extra space
    //   static void arrRotate(int[] arr,int k){
    //     int n=arr.length;
    //     k=k%n;
    //     rev(arr, 0,n-k-1);
    //     rev(arr, n-k,n-1);
    //     rev(arr, 0,n-1);
    //
    //     }



    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the size of an array");
    int n= sc.nextInt();
    int[] arr= new int[n];
    System.out.println("enter the values of an array");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    System.out.println("enter the value of k");
    int k= sc.nextInt();
    //arrRotate(arr,k)
    int[] ans= rotate(arr, k);
    for(int i=0;i<ans.length;i++){
    System.out.print(ans[i]+" ");}
    }
}
