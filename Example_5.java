
public class Kohzadvand{
   public static void main(String[] args)
   {
    System.out.println("Example 5 ");
      System.out.println("THIS PROGRAM HAS BEEN WRITTEN BE REZA KOHZADVAND ");
      System.out.println("****************************");
      System.out.println();
    
	   StringBuffer str = new StringBuffer("DIE TRYING");
       System.out.println("str before calling the method :" + str);
	   testMethod(str);
       System.out.println("str after calling the method :" + str);
   }
     public static void testMethod(StringBuffer pStr)
     {
    	System.out.println("In method : pStr " +
	 		   "before changing its value: " + pStr);
	    pStr.append(" , REAL ..!");
	    System.out.println("In method : pStr " +
			   "after changing its value: " + pStr);
     }
 }
