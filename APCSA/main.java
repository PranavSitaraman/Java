import java.io.*;
import java.util.*;
interface Call
{
  void call();
}
public class main
{
	public static String[] funcNames = new String[]
	{
		"Unit 1 Assignment",
		"Unit 2 Assignment",
		"Unit 3 Assignment",
		"Unit 4 Assignment",
		"Unit 5 Assignment",
		"Unit 6 Assignment",
		"Unit 7 Assignment",
		"Unit 8 Assignment",
		"Unit 9 Assignment",
		"Unit 10 Assignment"
	};
	public static Call[] funcs = new Call[]
	{
		new Call() { public void call() { unit1.U1_Assignment.main(null); } },
		new Call() { public void call() { unit2.U2_Assignment.main(null); } },
		new Call() { public void call() { unit3.U3_Assignment.main(null); } },
		new Call() { public void call() { unit4.U4_Assignment.main(null); } },
		new Call() { public void call() { unit5.U5_Assignment.runner_Fraction.main(null); } },
		new Call() { public void call() { unit6.U6_Assignment.runner_StatsArray.main(null); } },
		new Call() { public void call() { unit7.U7_Assignment.runner_GameWheel.main(null); } },
		new Call() { public void call() { unit8.U8_Assignment.Battleship.main(null); } },
		new Call() { public void call() { unit9.U9_Assignment.runner_Ultimate.main(null); } },
		new Call() { public void call() { unit10.U10_Assignment.runner_AnagramList.main(null); } },
	};
	public static void main(String args[]) throws IOException
	{
		Scanner in = new Scanner(System.in);
		for (int i = 0; i < funcs.length; i++)
		{
			System.out.println((i + 1) + ": " + funcNames[i] + ":");
		}
		while (true)
		{
			System.out.print("Enter selection: ");
			int choice = in.nextInt();
			if (choice > funcs.length || choice <= 0)
			{
				break;
			}
			System.out.println(funcNames[choice - 1] + " : Output below");
			funcs[choice - 1].call();
			System.out.println("");
		}
	}
}