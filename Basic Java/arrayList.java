import java.util.ArrayList;
public class arrayList {
    public static void main(String[] args) {
        // wrapper classes  (agar hum primitive adat type(int ,float..etc)inko class k andar wrap kr de usko wrapper class kahte hai)


        // Integer i= Integer.valueOf(45);
        // System.out.println(i);
        // Float j= Float.valueOf(3.6f);
        // System.out.println(j);

      ArrayList<Integer> li= new ArrayList<>();
      // add new element
      li.add(5);
      li.add(7);
      li.add(8);

      // get element at index
      System.out.println(li.get(0));
       // using loop to print the output
      for(int i=0;i<li.size();i++){
         System.out.println(li.get(i));
      }

      // directly printing the arrayList
      System.out.println(li);

      // adding value at any index
      li.add(1,100);
      System.out.println(li);


      // to remove through index
      li.remove(1);
      System.out.println(li);


      // to remove value without index
      li.remove(Integer.valueOf(7));
      System.out.println(li);

      // to check if element exist or not
      boolean ans= li.contains(5);
      System.out.println(ans);

      // if u dont specify the class u can put anything inside l
      ArrayList l= new ArrayList();
      l.add("p");
      l.add(25.3f);
      l.add(true);
      System.out.println(l);

    }
}
