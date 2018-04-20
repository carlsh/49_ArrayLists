import java.util.*;

public class ArrayListDemo{

   public static void main(String[] args){
   
      String[] normaltArray = new String[10];
      ArrayList<String> al = new ArrayList<String>();
      System.out.println(al.size());
      normaltArray[0] = "Plads 0";
      al.add("Første element");
      System.out.println(Arrays.toString(normaltArray));
      System.out.println(al);
      al.add("Andet element");
      al.add("Det ");
      al.add("er ");
      al.add("snart ");
      al.add("weekend!");
      System.out.println(al);
      for (int i=0;i<al.size();i++){
         System.out.println(al.get(i));
      }
      al.set(5, "Sommer!");
      for (int i=0;i<al.size();i++){
         System.out.println(al.get(i));
      }
      al.remove(1);
      System.out.println(al);
      al.set(0, "Juhuuu!!!");
      System.out.println(al);
      int index = al.indexOf("Sommer");
      al.set(index, "Weekend!");
      System.out.println(al);
      
   }

}