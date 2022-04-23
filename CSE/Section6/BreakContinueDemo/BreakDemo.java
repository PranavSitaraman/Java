
package Section6.BreakContinueDemo;

import java.util.Scanner;


public class BreakDemo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numInputs = 10, input = 0, sum = 0, stopLoop = 999;
        for (int i = 0; i < numInputs; i++) {
            input = in.nextInt();    //user inputs a number
            if (input == stopLoop) //if the number is 999, exit the loop without adding to the sum
            {
                break;
            } else {
                sum += input;          //if the number is not 999, add it to the sum
            }
        }
        System.out.println("The sum of the numbers entered is: " + sum);
    


}
}

    

