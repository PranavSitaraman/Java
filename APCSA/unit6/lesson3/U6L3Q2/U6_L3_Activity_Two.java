public class U6_L3_Activity_Two{

  public static void reverse(String[] words)
  {
    //Implement code to print each string from words backwards on a new line
    
    for(int i = 0; i < words.length; i++) {
      String current_Word = "";
      for(int a = words[i].length(); a > 0; a--) {
        current_Word += words[i].substring(a - 1, a);
      }
      System.out.println(current_Word);
    }
  }

}
