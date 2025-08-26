import java.util.*;
public class arrSquareSwap {

    static void swap(int arr[],int i, int j){
        int temp= arr[i];
        arr[i]= arr[j];
        arr[j]= temp;
    }

    static void reverse(int[] arr){
        int i=0;
        int j= arr.length-1;
        while(i<j){
          swap(arr, i, j);
          i++;
          j--;
        }
    }
      
    static int[] printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        return arr;
    }
     
    
    static int[] square(int[] arr){
       int[] ans= new int[arr.length];
       int j=0;
       int left=0;
       int right= arr.length-1;
       for(int i=0;i<arr.length;i++){
        while(left<=right){
            if(Math.abs(arr[left])> Math.abs(arr[right])){
                ans[j++]=arr[left]*arr[left];
                left++;
            }
            else{
                ans[j++]= arr[right]*arr[right];
                right--;
            }
         }
       }
       return ans;
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

     square(arr);
     
     int [] ans= square(arr);
     reverse(ans);
     for(int i=0;i<ans.length;i++){
        
        System.out.print(ans[i]+" ");
     }
     
     }
    }

