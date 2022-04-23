public class U10_L1_Activity_One
{
  public static void printSameEnd(int n)
  {
    if (n <= 0)
    {
      ;
    }
    else
    {
      printSameEnd(n - 10);
      System.out.print(n + " ");
    }
  }
}
