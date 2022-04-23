public class CaesarCipher
{

  /** Returns a String consisting of every possible Caesar Cipher
   *  encoded version of msg, beginning with the original (shift of 0),
   *  and sequentially increasing the shift until the String ends with
   *  msg encoded with a shift of 25. Each encoded message should
   *  be on a separate line.
   *  Precondition: msg contains only upper case letter characters
   */
  public static String allEncodings(String msg)
  {
    /* Implement your answer to part (b) here */
  String finale = "";
  for(int i = 0; i < 26; i++) {
    if(msg.length() > 26){
      i -= 26;
      finale += "\n" + encode(msg, i);
  }
    else
    finale += ("\n" + encode(msg, i)); 
  }
  
  return finale;  
}

  /** Returns an encoded version of msg by applying a Caesar
   *  Cipher with a shift specified by the parameter shift.
   *  Preconditions: msg contains only upper case letter
   *  characters, shift is greater than or equal to 0
   */
  public static String encode(String msg, int shift)
  {
    /* COMPLETE WORKING METHOD PROVIDED */
    /* DO NOT MODIFY THE IMPLEMENTATION OF THIS METHOD*/
    String result = "";
    for(int i = 0; i < msg.length(); i++)
    {
      String l = msg.substring(i, i+1);
      int n = letterToNum(l);
      n = (n + shift) % 26;
      result += numToLetter(n);
    }
    return result;
  }

  /** Returns the number representing the position of letter in the
   *  alphabet, where A is at position 0, Z  is at position 25
   *  Precondition: letter is a String containing one uppercase
   *  letter character only.
   */
  private static int letterToNum(String letter)
  {
    /* COMPLETE WORKING METHOD PROVIDED */
    /* DO NOT MODIFY THE IMPLEMENTATION OF THIS METHOD*/
    char l = '?';
    if(letter.length()==1) l = letter.charAt(0);
    if(!Character.isUpperCase(l)) return -1;
    return (int) l - 65;
  }

  /** Returns a String consisting of the single upper case letter which
   *  is at the position num in the alphabet, where A is at position 0,
   *  Z is at position 25
   *  Precondition: num is between 0 and 25 inclusive
   */
  private static String numToLetter(int num)
  {
    /* COMPLETE WORKING METHOD PROVIDED */
    /* DO NOT MODIFY THE IMPLEMENTATION OF THIS METHOD*/
    if(num < 0 || num > 26) return "?";
    return Character.toString((char)(num + 65));
  }

}
