public class countDigit {

    static int countDig(int n){
        int count=0;
        if(n==0){
            return 1;
        }
        while(n>0){
            n=n/10;
            count++;
        } 
        return count;   
    }

    public static void main(String[] args) {
        System.out.println(countDig(256));
    }
}
