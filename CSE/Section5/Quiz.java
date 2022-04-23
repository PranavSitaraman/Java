package Section5;
public class Quiz
{
    public static void main(String[] args)
    {
        for (int i = 1; i <= 100; i++) // Loops for i from 1 to 100 inclusive
        {
            if (i % 3 != 0 && i % 5 != 0 && i % 7 != 0) // Not divisible by 3, 5, and 7
            {
                System.out.println(i); // Print out the number
                continue; // Skip rest of code and increment i to go to next number
            }
            if (i % 3 == 0) System.out.print("Sun"); // If divisible by 3, print Sun
            if (i % 5 == 0) System.out.print("Day"); // If divisible by 5, print Day
            if (i % 7 == 0) System.out.print("Today"); // Extension: If divisible by 7, print Today
            System.out.println("!"); // Print exclamation mark on words
        }
    }
}