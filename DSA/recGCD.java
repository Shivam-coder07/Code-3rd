import java.util.*;
public class recGCD{
  
    static int findGCD(int x,int y){
      while(x%y!=0){
       int rem=x%y;
        x=y;
        y=rem; 
      }
      return y;
    }


// euclied algo
static int GCD(int x,int y){
    if(y==0){
        return x;
    }
   return GCD(y,x%y); 
}

// ffor LCM    LCM=(x*y)/GCD

public static void main(String[] args) {
 Scanner sc= new Scanner(System.in);
 int x= sc.nextInt();
 int y= sc.nextInt();
 System.out.println(findGCD(x, y));
 System.out.println(GCD(x, y));  
 System.out.println("LCM  "+( (x*y)/GCD(x, y)));
 }
}