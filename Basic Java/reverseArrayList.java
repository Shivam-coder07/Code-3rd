
import java.util.ArrayList;
import java.util.Collections;
public class reverseArrayList {
static void reverseList(ArrayList<Integer> li){
   int i=0;
   int j= li.size()-1;
    while(i<j){
        Integer temp= Integer.valueOf(li.get(i));
        li.set(i,li.get(j));
        li.set(j,temp);
        i++;
        j--;
    }


}


   public static void main(String[] args) {
    ArrayList<Integer> li= new ArrayList<>();
    li.add(0);
    li.add(10);
    li.add(3);
    li.add(5);
    li.add(22);
    li.add(10);
    System.out.println("Original array"+li);
    // jab collection class use kre ge to usme reverselist ka function phle se hota hai
    Collections.reverse(li);
    //reverseList(li);
    System.out.println("reversed list"+li);

// sorted array in ascending order
  Collections.sort(li);
  System.out.println("sorted"+li);

  // sort array in descendig order
  Collections.sort(li,Collections.reverseOrder());
  System.out.println(li);

// for strings
  ArrayList<String> li2= new ArrayList<>();
   li2.add("Welcome");
   li2.add("to");
   li2.add("Physics");
   li2.add("Wallah");
   System.out.println("og"+li2);
   Collections.sort(li2);
   System.out.println("sorted"+li2);




   } 
}
