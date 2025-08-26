import java.util.*;
public class StringPalindrome{
    public static void main(String[] args) {
     Scanner str= new Scanner(System.in);
        //String str=" abcba";
        String str1= str.nextLine();
        int i=0;
        int j=str1.length()-1;
        while(i<j){
            if(str1.charAt(i)!=str1.charAt(j)){
                break;
               } 
            i++;
            j--;
           }
            if(str1.charAt(i)==str1.charAt(j)){
                System.out.println("palindrome");
            }
            else{
                System.out.println("not palindrome");
            }    
    }
}