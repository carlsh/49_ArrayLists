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
      int index = al.indexOf("Sommer!");
      al.set(index, "Weekend!");
      System.out.println(al);
      
      //ombyt tal parvis
      //erklær temp variabel e.g. String temp;
      for (int j=0;j<al.size();j +=2){
         //ombyt plads j med plads j+1
         // get, set, 
      }
      //for each svarer til
      for (int i=0;i<al.size();i++){
         String s = al.get(i);
         System.out.println(s);
      }
      //skrives sådan
      for (String s : al){
         System.out.println(s);
      }
      
      //primitive datatyper skal wrappes: double, int, ...
      Integer x = new Integer(42);
      int y = x.intValue();
      System.out.println("y er lig med " + y);
      //ArrayList<int> tal = new ArrayList<int>();
      ArrayList<Integer> tal = new ArrayList<Integer>();
      tal.add(0);
      tal.add(1);
      tal.add(27);
      int sum = 0;
      for (int w : tal){
         sum += w;
      }
      System.out.println("Summen er " + sum);
      
      ArrayList<Double> miasDoubles = new ArrayList<Double>();
      miasDoubles.add(17.3);
      miasDoubles.add(20.0);
      miasDoubles.add(13.0);
      
      double dsum = 0;
      for (double d : miasDoubles){
         dsum += d;
      }
      System.out.println("gennemsnit " + dsum/miasDoubles.size());
   }

}