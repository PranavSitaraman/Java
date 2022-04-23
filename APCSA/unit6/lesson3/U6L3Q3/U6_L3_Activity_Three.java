public class U6_L3_Activity_Three{

  // Write your printIngs method here
public static void printIngs(String wordList[]) {
  for(int i = 0; i < wordList.length; i++) {
     if (wordList[i].length() > 3)
  {
    if (wordList[i].substring(wordList[i].length() - 3, wordList[i].length() ).equals("ing"))
    {
      System.out.println(wordList[i]);
    }
  }
  }
}
}
