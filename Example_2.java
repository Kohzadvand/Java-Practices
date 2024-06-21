import java.util.*;

public class kohzadvand {

	static Scanner console = new Scanner(System.in);

   public static void main(String[] args)

   {
      System.out.println("Example 2");
      System.out.println("THIS PROGRAM HAS BEEN WRITTEN BY REZA KOHZADVAND ");
      System.out.println("****************************");
      System.out.println();
   

	      System.out.print("Enter first string:");

	      String str1 = console.next();

	      System.out.print("Enter second string:");

	      String str2 = console.next();

	      if(str1.compareTo(str2) == 0)

	         System.out.println("The two strings are equal.");

	      if(str1.compareTo(str2) < 0)

	         System.out.println("The string str1 < string str2.");

	      if(str1.compareTo(str2) > 0)

	         System.out.println("The string str1 > string str2.");

	}

}
