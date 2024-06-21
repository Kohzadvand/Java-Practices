public class Kohzadvand {
	  public static void main(String[] args)
	  {
      System.out.println("Example 1 ");
      System.out.println("THIS PROGRAM HAS BEEN WRITTEN BE REZA KOHZADVAND ");
      System.out.println("****************************");
      System.out.println();
      
	     double radians = 55.0;
	     double d1 = 7.0, d2 = 9.5;
	     int num, x = 23, y = 11;
	     double degree = 140;
	     double p = -2.31;
	     System.out.println("cos("+radians+")= " + Math.cos(radians));
	     System.out.println("pow("+d1+","+d2+")= " + Math.pow(d1,d2));
	     System.out.println("max("+x+","+y+")= " + Math.max(x,y));
	     System.out.println("min("+d1+","+d2+")= " + Math.min(d1,d2));
	     System.out.println("sqrt("+y+")= " + Math.sqrt(y));
	     System.out.println("round("+d2+")= " + Math.round(d2));
	     System.out.println("ceil("+p+")= " + Math.round(p));
	     System.out.println("floor("+p+")= " + Math.floor(p));
	     System.out.println("toRadians("+degree+")= " + Math.toRadians(degree));
	     System.out.println("exp("+d1+")= " + Math.exp(d1));
	     System.out.println("Generate 10 integer random numbers less than or equal 10:");
	     for(int i = 1; i <= 10; i++)
	     {
	         num = (int)(10*Math.random());
	         System.out.print("num "+i+" = "+num+"\t");
	     }
	     
	  }

}
