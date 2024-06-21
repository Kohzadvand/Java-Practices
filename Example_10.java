public class Main {

    public static void main(String[] args)

    {
       System.out.println("Example 10 ");
      System.out.println("THIS PROGRAM HAS BEEN WRITTEN BE REZA KOHZADVAND ");
      System.out.println("****************************");
      System.out.println();
    

       String str = "DIE TRYING";

       int width = 15;

       String s =  stringFormatter.leftAdjust(str, width);

       System.out.println("Left justify string is: " + s);

       s = stringFormatter.rightAdjust (str, width) ;

       System.out.println("Right justify string is: " + s);

       s = stringFormatter.center(str, width) ;

       System.out.println("Middle justify string is: " + s);

    }

}
//***************************
//another class -->

public class stringFormatter{

public static String leftAdjust (String s, int width)
{
final int stringLength = s.length(); 
if(stringLength >= width)
    return s;

else
    return spaces(width-stringLength).insert (0, s).toString();
}
//*****************************
public static String rightAdjust(String s, int width)
{
final int stringLength = s.length(); if(stringLength >= width)
{
    return s;
}
else
{
return spaces(width-stringLength).append(s).toString();
}
}
//*****************************
public static String center (String s, int width)
{
final int stringLength = s.length(); 
if (stringLength >= width)
{
return s;
}
else
{
final int numSpaces = width-stringLength;
final int leftSpace = numSpaces/2, rightSpace = numSpaces-leftSpace; 
return spaces(leftSpace).append(s).append(spaces (rightSpace)).toString();
}
}

//*****************************

private static StringBuffer spaces(int numSpaces)
{
if (numSpaces <= 0)
    return new StringBuffer();

else
{
StringBuffer spaces = new StringBuffer(); 
for(int i = 0; i < numSpaces; i++) spaces.append(' ');

return spaces;
}
}
}
