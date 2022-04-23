import java.util.ArrayList;

public class U7_L3_Activity_One
{
  public static void shiftRight(ArrayList<String> list) {
    for (int i = list.size() - 1; i > 0; i--) {
      list.add(i, list.remove(i - 1));
    }
  }
}
