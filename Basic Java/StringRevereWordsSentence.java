

public class StringRevereWordsSentence {
    public static void main(String[] args) {
        String str= "i am btech student";
        String ans="";
        StringBuilder sc= new StringBuilder("");
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if (ch!=' ') {
                sc.append(ch);
            }
            else{
                sc.reverse();
                ans+=sc;
                ans+= " ";
                sc= new StringBuilder("");
            }
        }
        
        sc.reverse();
        ans+=sc;
         System.out.println(ans);
    }
}
