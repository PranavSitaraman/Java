public class U6_L3_Activity_One{

  public static String findLongest(String[] words)
  {
    //Implement code to find and return the longest String in wordList
    String checking = words[0];
    for(int i = 0; i < words.length; i++) {
      if(words[i].length() > checking.length())
      checking = words[i];
    }
    return checking;
  }

}
