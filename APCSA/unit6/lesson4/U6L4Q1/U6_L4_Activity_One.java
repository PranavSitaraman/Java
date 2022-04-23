public class U6_L4_Activity_One{
    public static boolean insert(String[] words, String newWord, int place){
        if (place >= words.length || place < 0)
            return false;
        
        for (int i = 0; i < words.length; i++){
            if (i == place){
                place = -1;
            for (int x = words.length - 1; x > i; x--)
                words[x] = words[x-1];
            
            words[i] = newWord;
        }
      }
      return true;
    }
}
  