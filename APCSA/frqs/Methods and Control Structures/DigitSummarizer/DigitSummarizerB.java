// Sorry for the inconvenience! Part A is 100% correct but Part B will only get you 80%. I didn't have time to debug the rest of the solution.

public class DigitSummarizer
{

  /** Returns true if one of the digits of n is equal
   *  to the digital root of n.
   *  Precondition: n is a positive number
   */
  public static boolean containsRoot(int n)
  {
    /* Implement your answer to part (b) here */
    boolean blank = false;
    int number1 = (int) (digitalRoot(n) % 10);
    int number2 = (int) (digitalRoot(n) / 10);
    if((number1 % 2 ==0) || (number2 % 2 == 0))
    blank = true;
    else
    blank = false;
    return blank;
  }

  /** Returns the single-digit "digital root" of n
   *  Precondition: n is a positive number
   */
  public static int digitalRoot(int n)
  {
    /* COMPLETE WORKING METHOD PROVIDED */
    /* DO NOT MODIFY THE IMPLEMENTATION OF THIS METHOD*/
    while(n >= 10)
    {
      n = digitSum(n);
    }
    return n;
  }

  /** Returns the sum of the digits in n
   *  Precondition: n is a positive number
   */
  public static int digitSum(int n)
  {
    /* COMPLETE WORKING METHOD PROVIDED */
    /* DO NOT MODIFY THE IMPLEMENTATION OF THIS METHOD*/
    int s = 0;
    while(n > 0){
      s += n%10;
      n /=10;
    }
    return s;
  }

}
