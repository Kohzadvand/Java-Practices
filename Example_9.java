import java.util.Date;

import java.text.*;

public class Kohzadvand {

   public static void main(String[] args)

   {
      System.out.println("Example 1 ");
      System.out.println("THIS PROGRAM HAS BEEN WRITTEN BE REZA KOHZADVAND ");
      System.out.println("****************************");
      System.out.println();
   

      Date now = new Date();

      DateFormat formatter = DateFormat.getDateInstance();

      System.out.println("Default date :" + formatter.format(now));

      formatter = DateFormat.getDateInstance(DateFormat.SHORT,java.util.Locale.UK);

      System.out.println("Short (UK):"+formatter.format(now));

      formatter = DateFormat.getDateInstance(DateFormat.MEDIUM);

      System.out.println("Medium:" + formatter.format(now));

      formatter = DateFormat.getDateInstance(DateFormat.LONG);

      System.out.println("Long:" + formatter.format(now));

      formatter = DateFormat.getDateInstance(DateFormat.FULL);

      System.out.println("Full:" + formatter.format(now));
      

    }

}
