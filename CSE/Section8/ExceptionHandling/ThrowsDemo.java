
package Section8.ExceptionHandling;

import java.io.File;
import java.io.IOException;


public class ThrowsDemo {
    

public void testCheckedException() throws IOException {
    File testFile = new File("testFile.txt");
     testFile.createNewFile();
    System.out.println("testFile exists:" + testFile.exists());
 }

   public static void main(String[] args) {
   ThrowsDemo testClass = new ThrowsDemo();      
  try {
        testClass.testCheckedException();
    } catch (IOException e) {
        System.out.println(e);
     }
 } 
}
