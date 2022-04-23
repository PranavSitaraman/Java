import java.util.ArrayList;

public class U7_L4_Activity_Two{

  // Write your searchLast method as described in the assignment
public static int searchLast(ArrayList<String> list, String target)
{
  
  for (int i = list.size() - 1; i >= 0; i--)
  {
    if (target.equals(list.get(i)))
    {
      return i;
    }
  }
  return -1;
}
}
