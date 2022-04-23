public class U10_L2_Activity_One
{

  public static String reverseString(String str)
  {
    if (str.length() == 0)
    {
      return str;
    }
   return reverseString(str.substring(1)) + str.charAt(0);
  }

}
