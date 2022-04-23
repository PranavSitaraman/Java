package Section6.ProblemSet6_3;

public class LoopShape
{
    static void createRectangle(int width, int height)
    {
        if (width < 1 || height < 1) return;
        for (int i = 0; i < height; i++)
        {
            for (int j = 0; j < width; j++) System.out.print((i == 0 || i == height - 1 || j == 0 || j == width - 1) ? "*" : " ");
            System.out.println("");
        }
    }
    static void createTriangle(int leg)
    {
        if (leg < 1) return;
        for (int i = 0; i < leg; i++)
        {
            System.out.print("*");
            for (int j = 0; j < i - 1; j++) System.out.print((i == leg - 1 ? "*" : " "));
            System.out.print((i != 0 ? "*\n" : "\n"));
        }
    }
}
