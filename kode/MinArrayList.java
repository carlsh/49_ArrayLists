import java.util.*;

public class MinArrayList
{

   public static void main(String[] args)
   {
      //erklær array og arraylist
      String[] sa = new String[5];
      ArrayList<String> sal = new ArrayList<String>();
      
      //put noget i array og arraylist
      String stal = "Weekend!";
      sa[0] = stal;
      sal.add(stal);
      
      sa[1] = "Sommer!";
      sal.add("Sommer!");
      
      //udskriv array og arraylist
      System.out.println("Array " + Arrays.toString(sa));
      System.out.println("ArrayList" + sal);
      
      //tilføj element foran nr 1
      sal.add(1, "Forår!");
      System.out.println("ArrayList" + sal);
      
      //fjern element nr 1
      sal.remove(1);
      System.out.println("ArrayList" + sal);
      
      //iterer gennem array og arraylist
      for (int i=0;i<sa.length;i++)
      {
         System.out.print(sa[i]);
      }
      System.out.println();
      
      for (int i=0;i<sal.size();i++)
      {
         System.out.print(sal.get(i));
      }
      System.out.println();
      
      //iterer over elementer i arraylist og set til "Weekend!"
      for (int i=0;i<sal.size();i++)
      {
         sal.set(i, "Weekend!");
      }
      System.out.println("ArrayList" + sal);
      
      //for each
      for (String s: sal)
      {
         System.out.print(s);
      }
      
      int index = sal.indexOf("Weekend!");
      //System.out.println("ArrayList" + sal);
      System.out.println("index af Weekend! er: " + index);
      
      //primitive typer - boxing & unboxing
      ArrayList<Integer> ial = new ArrayList<Integer>();
      ial.add(42);
      ial.add(42);
      ial.add(1000);
      ial.add(1000);
      if (ial.get(0) == ial.get(1))
      {
         System.out.println("42 == 42");
      }
      else
      {
         System.out.println("42 != 42");
      }
      if (ial.get(2) == ial.get(3))
      {
         System.out.println("1000 == 1000");
      }
      else
      {
         System.out.println("1000 != 1000");
      }
      //unboxing før sammenligning
      int j = ial.get(3);
      int n = ial.get(2);
      
      System.out.println("sammenligning udenfor arraylist " + (j==n));
      //sammenlign med .valueOf()
      System.out.println(ial.get(2).intValue());
      System.out.println(ial.get(3).intValue());
      if (ial.get(2).intValue() == ial.get(3).intValue())
      {
         System.out.println("1000 == 1000");
      }
      else
      {
         System.out.println("1000 != 1000");
      }
      
      
   }

}