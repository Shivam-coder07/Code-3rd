import java.util.*;
public class arrTwoPointer {
    
  static void swap(int[] arr, int i,int j){
    int temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
  }


 // two loop approch
    // static int[] sortZeroAn(int[] arr){
    //     int count=0;
    //     // to count no of zeroes
    //     for(int i=0;i<arr.length;i++){
    //         if(arr[i]==0){
    //             count++;
    //         }
    //     }
      
    //      for(int i=0;i<arr.length;i++){
    //         if(i<count){
    //             arr[i]=0;
    //         }
    //         else{
    //             arr[i]=1;
    //         }
    //      }
    //      return arr;
    //    }


    // less loop approach
    static void sortZeroAn(int[] arr){
      int n= arr.length;
      int left=0;
      int right=n-1;
      while(left<right){
        if(arr[left]==1 && arr[right]==0){
        swap(arr, left, right);
        left++;
        right--;
        }
        if(arr[left]==0){
          left++;
        }
        if(arr[right]==1){
          right--;
        }
      }
  
    }
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      System.out.println("enter the size of an array");
      int n= sc.nextInt();
      int arr[]= new int[n]; 
      
      System.out.println("enter the elements in array");
      for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
      }
      sortZeroAn(arr);
      System.out.println("sorted array");
      for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
      }
    }
}
