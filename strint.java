import java.io.*;
import java .util.*;
public class JavaStringToInt
{
  public static void main (String[] args)
  {
String s = "100";

    try
    {
      
      int i = Integer.parseInt(s.trim());
      System.out.println("int i = " + i);
    }
    catch (NumberFormatException nfe)
    {
      System.out.println("NumberFormatException: " + nfe.getMessage());
    }
  }
}
