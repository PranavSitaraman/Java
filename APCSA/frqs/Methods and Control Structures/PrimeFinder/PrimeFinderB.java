public class PrimeFinder
{

  /** Returns the difference between num and the closest prime number which
   *  is greater than or equal to num
   *  Precondition: num is positive
   */
  public static int gapToNextPrime(int num)
  {
    /* Implement your answer to part (b) here */
    int count=0;
    boolean start = isPrime(num);
    while(start != true){
      count++;
      num++;
      if(isPrime(num) == true)
      start = true;
    }
    return count;
  }

  /** Returns true if the integer n is a prime number
   *  Precondition: n is positive
   */
  private static boolean isPrime(int n)
  {
    /* COMPLETE WORKING METHOD PROVIDED */
    /* DO NOT MODIFY THE IMPLEMENTATION OF THIS METHOD*/
    if(n <= 1) return false;
    if(n==2) return true;
    for(int i = 2; i < Math.sqrt(n)+1; i++) if(n%i == 0) return false;
    return true;
  }

  /* Methods for previous parts of this question are not shown */

}
