public class factoial {

     static int somOfDigits(int n){
       if(n>=0 && n<=9){
        return n;
       }
       int digit =somOfDigits(n/10);
       return digit+(n%10);
     }
    public static void main(String[] args) {
       System.out.println(somOfDigits(1234)); 
    }
}
