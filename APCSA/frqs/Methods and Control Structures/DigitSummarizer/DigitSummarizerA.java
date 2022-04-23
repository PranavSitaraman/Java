public class DigitSummarizer
{

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

  /* Methods for subsequent parts of this question are not shown */

}
