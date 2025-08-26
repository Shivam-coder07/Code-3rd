
public class stringbuilder {
    public static void main(String[] args) {
        /*String str1="new world";
        str1+="mahi";
        System.out.println(str1);*/
        // stringbuilder creation
        /* in string builder we can change individual characyer in string but 
        in (normal)string we can nit chnage character and use function such as append and other */
        StringBuilder str  = new StringBuilder("hello");
        str.append("world");
        System.out.println(str);
        str.setCharAt(0,'3');
        System.out.println(str);
        str.insert(3,'l');
        System.out.println(str);
        // to delete single character
        str.deleteCharAt(0);
        // to delete multiple character
        str.delete(1,4);
        System.out.println(str);
        //to reverse string 
        str.reverse();
        System.err.println(str);



    }
}
