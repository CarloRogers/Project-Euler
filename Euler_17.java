import java.util.*;
public class Euler_17 {
  
  
public static void main(String[] args) {
      StringBuffer sb = new StringBuffer();
      for (int i = 1; i <= 1000; i++){
         sb.append(textOfNumber(i));
      }
      System.out.println(sb.toString());
      System.out.println(sb.length());
   }

   private static String textOfNumber(int i) {
      StringBuffer sb = new StringBuffer();
      //Below 1000000
      int thousand = i/1000;
      i %= 1000;
      if(thousand >= 1){
         sb.append(textOfNumber(thousand) + "thousand");
      }
      //Below 1000
      int hundred = i/100;
      i %= 100;
      if(hundred >= 1){
         sb.append(textOfNumber(hundred) + "hundred");
         if(i != 0){
            sb.append("and");
         }
      }
      //Below 100
      int ten = i/10;
      i %= 10;
      switch (ten){
         case 9 : sb.append("ninety" + textOfNumber(i)); break;
         case 8 : sb.append("eighty"+ textOfNumber(i)); break;
         case 7 : sb.append("seventy"+ textOfNumber(i)); break;
         case 6 : sb.append("sixty"+ textOfNumber(i)); break;
         case 5 : sb.append("fifty"+ textOfNumber(i)); break;
         case 4 : sb.append("forty"+ textOfNumber(i)); break;
         case 3 : sb.append("thirty"+ textOfNumber(i)); break;
         case 2 : sb.append("twenty"+ textOfNumber(i)); break;
         case 1 :
            switch (i) {
               case 9 : sb.append("nineteen"); break;
               case 8 : sb.append("eighteen"); break;
               case 7 : sb.append("seventeen"); break;
               case 6 : sb.append("sixteen"); break;
               case 5 : sb.append("fifteen"); break;
               case 4 : sb.append("fourteen"); break;
               case 3 : sb.append("thirteen"); break;
               case 2 : sb.append("twelve"); break;
               case 1 : sb.append("eleven"); break;
               case 0 : sb.append("ten"); break;
            } break;
         case 0 : 
            switch (i) {
               case 9 : sb.append("nine"); break;
               case 8 : sb.append("eight"); break;
               case 7 : sb.append("seven"); break;
               case 6 : sb.append("six"); break;
               case 5 : sb.append("five"); break;
               case 4 : sb.append("four"); break;
               case 3 : sb.append("three"); break;
               case 2 : sb.append("two"); break;
               case 1 : sb.append("one"); break;
               case 0 : break;
            }
      }
      return sb.toString();
   }
}
