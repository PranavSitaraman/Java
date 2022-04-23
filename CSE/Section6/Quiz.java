package Section6;
import java.util.*;
public class Quiz
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        int correct = rand.nextInt(10) + 1;
        System.out.println("Guess a number between 1 and 10!");
        int guess = 0;
        do
        {
            guess = in.nextInt();
            if (guess > correct) System.out.println("Too high, try again.");
            else if (guess < correct) System.out.println("Too low, try again.");
        } while (guess != correct);
        System.out.println("Congratulations, you guessed the number correctly!");
    }
}