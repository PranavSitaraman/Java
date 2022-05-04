package Section8.ArrayListProject;
import java.io.*;
import java.util.*;
public class Analyzer
{
	public ArrayList<Word> analyze(ArrayList<Word> words, int n)
	{
		ArrayList<Word> stats = new ArrayList<Word>();
		for (int i = 0; i < words.size(); i++)
		{
			int index = -1;
			for (int j = 0; j < stats.size(); j++)
			{
				if ((words.get(i).getWord()).equals(stats.get(j).getWord()))
				{
					index = j;
					break;
				}
			}
			if (index == -1 && words.get(i).getLength() >= n) stats.add(words.get(i));
			else if (index != -1) stats.get(index).setCount(stats.get(index).getCount() + 1);
		}
		stats.sort(Comparator.comparing(Word::getCount).reversed());
		ArrayList<Word> newstats = new ArrayList();
		for (int i = 0; i < stats.size() && i < 10; i++) newstats.add(stats.get(i));
		return newstats;
	}
}