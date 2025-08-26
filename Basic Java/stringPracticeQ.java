// to change upper into lower and vice vera.
import java.util.*;
public class stringPracticeQ {
    public static void main(String[] args) {
        // to take input in string builder
        Scanner sc= new Scanner(System.in);
        StringBuilder str= new StringBuilder(sc.nextLine());
        System.out.println(str);
        for(int i=0;i<str.length();i++){
            boolean flag =true;  // capital
            char ch= str.charAt(i);
            if(ch==' ') continue;
            int asci = (int)ch;    //65
            if(asci>=97) flag= false;   // small
            if(flag==true){
              asci+=32;
              char dh=(char)asci;
              str.setCharAt(i,dh);
            }
            else{
                asci-=32;
                char dh=(char)asci;
                str.setCharAt(i,dh);
            }
        }
        System.out.println(str);

    }
}
