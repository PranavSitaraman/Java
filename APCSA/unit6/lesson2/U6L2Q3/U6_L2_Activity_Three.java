public class U6_L2_Activity_Three{

  // Write your hasDuplicates method here
  private static int temp;
  public static boolean hasDuplicates(int[] numbers) {
      for (int a = 0; a < numbers.length; a++) {
        temp = numbers[a];
        for (int b = 1; b < numbers.length; b++) {
          if (numbers[b] == temp && a != b) {
            return true;
          }
        }
    }
    return false;
  }
}
