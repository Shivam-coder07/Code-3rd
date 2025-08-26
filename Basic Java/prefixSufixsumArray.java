
import java.util.*;
public class prefixSufixsumArray {

    static int findArraySum(int[] arr){
        int totalsum=0;
        for(int i=0;i<arr.length;i++){
          totalsum+=arr[i];
        }
        return totalsum;
    }

  static boolean equalSumPartition(int[] arr){
    int totalsum=findArraySum(arr);
    int presum =0;
    for(int i=0;i<arr.length;i++){
        presum+=arr[i];
        int suffixsum= totalsum- presum;
        if(presum== suffixsum){
            return true;
        }
    }
    return false;
  }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("array size:");
        int n= sc.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter the elements of an array");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
      System.out.println(equalSumPartition(arr));
    }
}
