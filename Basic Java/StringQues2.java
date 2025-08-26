public class StringQues2 {
    public static void main(String[] args) {
     StringBuilder str= new StringBuilder("PhysICS") ;   // o/p pHYSics
     System.out.println(str);
     for(int i=0;i<str.length();i++){
     char ch= str.charAt(i);
     int asci =(int)ch;
     if( asci >=97){
       int conversion = asci - 32;
       char ans =(char)conversion;
       str.setCharAt(i,ans);
    }
    else{
        int conver2 = asci +32;
        char ans = (char)conver2;
        str.setCharAt(i,ans);
    }
    
     } 
     System.out.println(str);
    }
}
