public class PrimeFinder
{

  /** Returns the number of prime numbers between lower and upper inclusive
   *  Precondition: 0 < lower <= upper
   */
  public static int primesBetween(int lower, int upper)
  {
    /* Implement your answer to part (a) here */
    int counter = 0;
    for(int i = lower; i <= upper; i++) {
      if(isPrime(i)) counter++;
    }
    return counter;
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

}
  /* Methods for subsequent parts of this question are not shown */
