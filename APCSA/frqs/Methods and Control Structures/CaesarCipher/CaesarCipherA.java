public class CaesarCipher
{

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

  /* Methods for subsequent parts of this question are not shown */

}
