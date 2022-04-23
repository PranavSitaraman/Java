
package Section6.BreakContinueDemo;

public class UsingContinue {

    public static void main(String[] args) {
        int i=0;
        int num = 10;
       while(i!=3)
        {
            if (i > num ) {
                continue; // 
            }
            System.out.println(i);
            i++;
        }
    }

}
