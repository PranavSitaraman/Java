package Section8.ArrayListProject;
import java.io.*;
import java.util.*;
public class AnalyzerDriver
{
    public static void main(String[] args)
    {
        ArrayList<Word> words = new ArrayList<Word>();
        ArrayList<Word> results = new ArrayList<Word>();
        Scanner kb = new Scanner(System.in);
        System.out.println("Welcome to the Text Analyzer!");
        System.out.print("What is the minimum size word to return? ");
        int n = kb.nextInt();
        Analyzer analysis = new Analyzer();
        load(words);
        results = analysis.analyze(words, n);
        System.out.println("Analyzing 2016 State of the Union address.");
        for (Word w : results) System.out.println(w.getWord() + " " + w.getCount());
    }
    public static void load(ArrayList<Word> words)
    {
        Scanner in;
        String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        try
        {
            in = new Scanner(new File("sotu2016.txt"));
            while (in.hasNext())
            {
                String s = in.next();
                while (s.length() > 0 && !abc.contains(s.substring(s.length() - 1))) s = s.substring(0,s.length() - 1);
                while (s.length() > 0 && !abc.contains(s.substring(0, 1))) s = s.substring(1);
                words.add(new Word(s.toLowerCase()));
            }
        }
        catch (IOException e) { System.out.println("Error: " + e.getMessage()); }
    }
}