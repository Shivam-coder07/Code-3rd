import java.util.*;

public class printNnaturalno {

  static void printDcreasing(int n){
    if(n==1){  // base case
        System.out.println(1);
        return;
    }
    System.out.println(n);   // self work
    printDcreasing(n-1);     // base case

  }



      static void printincreasing(int n){  // increasing 
        if(n==1){
            System.out.println(1);
            return;
        }
        printincreasing(n-1);
        System.out.println(n);
      }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
       // printincreasing(n);
       printDcreasing(n);
    }
}
