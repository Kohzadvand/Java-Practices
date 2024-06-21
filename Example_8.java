import java.text.*;

public class Kohzadvand {

   public static void main(String[] args)

   {
     System.out.println("Example 8 ");
      System.out.println("THIS PROGRAM HAS BEEN WRITTEN BE REZA KOHZADVAND ");
      System.out.println("****************************");
      System.out.println();
   

     NumberFormat formatter = NumberFormat.getNumberInstance();

     formatter.setMaximumFractionDigits(7);

     System.out.println("Truncated PI = "+formatter.format(Math.PI));

     formatter.setMinimumIntegerDigits(3);

     System.out.println("Truncated PI = "+formatter.format(Math.PI));

     NumberFormat money = NumberFormat.getCurrencyInstance();

     System.out.println("Money symbol usage:"+ money.format(51.8));

     NumberFormat percent = NumberFormat.getPercentInstance();

     System.out.println("Percent symbol usage:"+ percent.format(0.601));

     DecimalFormat formatting = (DecimalFormat)NumberFormat.getNumberInstance();

     formatting.setDecimalSeparatorAlwaysShown(true);

     System.out.println("Show decimal point always:"+formatting.format(211.0));

     formatting.setDecimalSeparatorAlwaysShown(false);

     System.out.println("Not show decimal point always:"+formatting.format(211.0));

   }

}
