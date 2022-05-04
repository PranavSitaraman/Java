package Section8.ArrayListProject;
import java.io.*;
import java.util.*;
public class Word
{
	private int count;
	private String word;
	public Word(String word) { this.word = word; this.count = 1; }
	public int getCount() { return count; }
	public void setCount(int n) { count = n; }
	public String getWord() { return word; }
	public int getLength() { return word.length(); }
}