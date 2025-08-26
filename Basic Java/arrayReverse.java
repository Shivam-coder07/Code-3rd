

//import java.util.*;
public class arrayReverse {
    // reverse an array by crreating new array


    static int[] reversearr(int[] arr){
       int j=0;
       int[] ans= new int[arr.length];
       for(int i=arr.length-1;i>=0;i--)
       {
          ans[j++]=arr[i];
       }
       return ans;
    }


    
    public static void main(String[] args) {
       int[] arr={1,2,5,6,7}; 
      // int[] ans= reversearr(arr);
       for (int i = 0; i <arr.length; i++) {
          System.out.println(reversearr(arr));
          }
    }
}
