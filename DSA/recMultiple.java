import java.util.*;

public class recMultiple {

   static void multi(int n, int k){
      if( k== 1){   // base case
        System.out.println(n);
        return ;
      }
      multi(n, k-1); // recursive work

      // self work
      System.out.println(n*k);
      
   }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int k = sc.nextInt();
        multi(n,k);
    }
}
