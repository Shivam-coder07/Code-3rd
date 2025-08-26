
import java.util.*;
public class linearSearch {

    static void search(int[] arr1, int target ,int i){
     if(i==arr1.length)
     {
        System.out.println("not found");
        return;
     } 
    if (arr1[i] != target) {
         search(arr1, target, i+1);
     }
     if (arr1[i] == target){
      System.out.println(i);
        
     }
      
    }

    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter the target value");
      int target= sc.nextInt();
      int[] arr ={4,6,7,9,3};
      int i=0;  
      search(arr,target ,i);  
    }
}
