import java.util.*;
public class arraySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target= sc.nextInt();
        int[] arr={5,6,4,8};
        int ans=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                ans=i;
            }
       }
        System.out.println(ans);
    }
}
