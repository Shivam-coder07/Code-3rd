
import java.util.*;
public class arrayCountNum {
    // to count the number of times the element is repeated
//     static int occurCount(int[]arr, int x){
//       int count=0;
//       for(int i=0;i<arr.length;i++){
//         if(arr[i]==x){
//             count++;
//         }
//       }
//       return(count);
//    }



// to find the last occurnce of  an element
  static int lastOCcurence(int[]arr, int x){
    int lastIndex=-1;
    for(int i=0;i<arr.length;i++){
        if(arr[i]==x){
            lastIndex=i;
        }
    }
     return lastIndex;
  }
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the size of array");
    int n= sc.nextInt();
    int[] arr= new int[n];
    System.out.println("enter the values of an array");
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    System.out.println("Enter thje value of X");
    int x= sc.nextInt();

   // System.out.println(occurCount(arr, x));
   System.out.println(lastOCcurence(arr, x));
  }  
}
