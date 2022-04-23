
package Section6.ForLoopsEx;

public class Countdown {

    public static void main(String[] args) {
        
        System.out.println("Countdown to Launch: ");

        for(int i = 20; i >= 0; i -= 2) {
            System.out.print(i +" "); 
        }

        System.out.println("Blast Off!");
    }
}
