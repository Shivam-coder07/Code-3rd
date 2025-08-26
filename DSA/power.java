public class power {

 static int multi(int p, int q){
    if(q==0){
        return 1;
    }
     return multi(p, q-1)* p;
 }

    public static void main(String[] args) {
        System.out.println(multi(5, 6));
    }
}
