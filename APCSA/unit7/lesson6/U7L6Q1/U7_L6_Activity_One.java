import java.util.Arrays;

public class U7_L6_Activity_One
{

  //Write the sortAndPrint method described in the assignment

  public static void sortAndPrint(String [] arr) {
    int i,j;
    String key;
    String str;
    
    for (j = 1; j < arr.length; j++) { 
    str = "";
    key = arr[j];
    i = j - 1;
    while (i >= 0) {
      if (key.compareTo(arr[i]) > 0) {
        break;
      }
      arr[i + 1] = arr[i];
      i--;
    }
    arr[i + 1] = key;
    str = "" + Arrays.toString(arr);
    str = str.replace("[", "");
    str = str.replace("]", "");
    str = str.replace(",", "");
    System.out.println(str);
  }
  }

}
