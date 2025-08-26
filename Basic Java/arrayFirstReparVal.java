// to print the first repearting value from the array
import java.util.*;
public class arrayFirstReparVal {
    static int repeat(int[] arr){
    for(int i=0;i<arr.length-1;i++){
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]==arr[j]){
                return arr[i];
            }
       } 
    }
    return -1;
}

 public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the size of an array");

    int n= sc.nextInt();
    int[] arr= new int[n];

    System.out.println("enter the value of array");
    for(int i=0;i<arr.length;i++){
      arr[i]=sc.nextInt();
    }
    System.out.println("the first repeating element is "+ repeat(arr));
 

   }
}
  

