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
		"Section1 - Hello World",
		"Section1 - Addition",
		"Section2 - Text01",
		"Section2 - Text02",
		"Section2 - Text03",
		"Section2 - ProblemSet2_1",
		"Section2 - ProblemSet2_2",
		"Section3 - Casting01",
		"Section3 - Casting02",
		"Section3 - Chickens01",
		"Section3 - Chickens02",
		"Section3 - Input01",
		"Section3 - Input02",
		"Section3 - Input03",
		"Section3 - Input04",
		"Section3 - Parsing01",
		"Section3 - ShoppingCart01",
		"Section3 - ShoppingCart02",
		"Section3 - Variables02",
		"Section3 - Variables03",
		"Section3 - JavaLibs",
		"Section4 - Tip01 - Tip01",
		"Section4 - Tip02 - CalculatorTest",
		"Section4 - Tip03 - CalculatorTest",
		"Section4 - Tip04 - CalculatorTest",
		"Section4 - ImportEx - AddImport",
		"Section4 - MathEx - ComputeBMI",
		"Section4 - RandomEx - FlipCoin",
		"Section4 - RandomEx - RockPaperScissor",
		"Section4 - StringsEx - NameMaker",
		"Section4 - StringsEx - ShoppingCart",
		"Section4 - ProblemSet4_1 - TestClass",
		"Section4 - ProblemSet4_2 - ProcessName",
		"Section5 - ConditionalEx - ComputeFare",
		"Section5 - ConditionalEx - TernaryOperator",
		"Section5 - ConditionalEx - WatchMovie",
		"Section5 - IfElseEx - StringEquality",
		"Section5 - IfElseEx - AgeCheck",
		"Section5 - IfElseEx - AgeValidity",
		"Section5 - IfElseEx - ChkOddEven",
		"Section5 - IfElseEx - ShoppingCart",
		"Section5 - SwitchEx - SwitchEx1",
		"Section5 - SwitchEx - SwitchEx2",
		"Section5 - ProblemSet5_1 - ColorRange",
		"Section5 - ProblemSet5_2 - TrafficLightChecker",
		"Section5 - ProblemSet5_3 - TrafficLightSwitch",
		"Section5 - Quiz",
		"Section6 - BreakContinueEx - BreakContinue",
		"Section6 - BreakContinueEx - ComputeSum",
		"Section6 - BreakContinueEx - CountChar",
		"Section6 - BreakContinueEx - Divisors",
		"Section6 - ForLoopsEx - Countdown",
		"Section6 - ForLoopsEx - InfiniteLoop",
		"Section6 - ForLoopsEx - ScopeTest",
		"Section6 - WhileLoopExercise - SquareRootWhile",
		"Section6 - WhileLoopExercise - SumofNums",
		"Section6 - ProblemSet6_1 - ValidatePin",
		"Section6 - ProblemSet6_2 - DisplayMultiples",
		"Section6 - ProblemSet6_3 - LoopShapeTest",
		"Section6 - Quiz",
		"Section7 - AccountTest - AccountTest",
		"Section7 - PrisonTest_2 - PrisonTest",
		"Section7 - PrisonTest_3 - PrisonTest",
		"Section7 - PrisonTest_4 - PrisonTest",
		"Section7 - PrisonTest_5 - PrisonTest",
		"Section7 - PrisonTest_6 - PrisonTest",
		"Section7 - ProblemSet7",
		"Section7 - Project - Game",
		"Section8 - ArraysEx - ArrayEx1",
		"Section8 - ArraysEx - ComputeAvg",
		"Section8 - ArraysEx - ArrayEx2",
		"Section8 - j2048 - j2048Controller"
	};
	public static Call[] funcs = new Call[]
	{
		new Call() { public void call() { Section1.HelloWorld.main(null); } },
		new Call() { public void call() { Section1.Addition.main(null); } },
		new Call() { public void call() { Section2.Text01.main(null); } },
		new Call() { public void call() { Section2.Text02.main(null); } },
		new Call() { public void call() { Section2.Text03.main(null); } },
		new Call() { public void call() { Section2.ProblemSet2_1.main(null); } },
		new Call() { public void call() { Section2.ProblemSet2_2.main(null); } },
		new Call() { public void call() { Section3.Casting01.main(null); } },
		new Call() { public void call() { Section3.Casting02.main(null); } },
		new Call() { public void call() { Section3.Chickens01.main(null); } },
		new Call() { public void call() { Section3.Chickens02.main(null); } },
		new Call() { public void call() { Section3.Input01.main(null); } },
		new Call() { public void call() { Section3.Input02.main(null); } },
		new Call() { public void call() { Section3.Input03.main(null); } },
		new Call() { public void call() { Section3.Input04.main(null); } },
		new Call() { public void call() { Section3.Parsing01.main(null); } },
		new Call() { public void call() { Section3.ShoppingCart01.main(null); } },
		new Call() { public void call() { Section3.ShoppingCart02.main(null); } },
		new Call() { public void call() { Section3.Variables02.main(null); } },
		new Call() { public void call() { Section3.Variables03.main(null); } },
		new Call() { public void call() { Section3.JavaLibs.main(null); } },
		new Call() { public void call() { Section4.Tip01.Tip01.main(null); } },
		new Call() { public void call() { Section4.Tip02.CalculatorTest.main(null); } },
		new Call() { public void call() { Section4.Tip03.CalculatorTest.main(null); } },
		new Call() { public void call() { Section4.Tip04.CalculatorTest.main(null); } },
		new Call() { public void call() { Section4.ImportEx.AddImport.main(null); } },
		new Call() { public void call() { Section4.MathEx.ComputeBMI.main(null); } },
		new Call() { public void call() { Section4.RandomEx.FlipCoin.main(null); } },
		new Call() { public void call() { Section4.RandomEx.RockPaperScissor.main(null); } },
		new Call() { public void call() { Section4.StringsEx.NameMaker.main(null); } },
		new Call() { public void call() { Section4.StringsEx.ShoppingCart.main(null); } },
		new Call() { public void call() { Section4.ProblemSet4_1.TestClass.main(null); } },
		new Call() { public void call() { Section4.ProblemSet4_2.ProcessName.main(null); } },
		new Call() { public void call() { Section5.ConditionalEx.ComputeFare.main(null); } },
		new Call() { public void call() { Section5.ConditionalEx.TernaryOperator.main(null); } },
		new Call() { public void call() { Section5.ConditionalEx.WatchMovie.main(null); } },
		new Call() { public void call() { Section5.IfElseEx.StringEquality.main(null); } },
		new Call() { public void call() { Section5.IfElseEx.AgeCheck.main(null); } },
		new Call() { public void call() { Section5.IfElseEx.AgeValidity.main(null); } },
		new Call() { public void call() { Section5.IfElseEx.ChkOddEven.main(null); } },
		new Call() { public void call() { Section5.IfElseEx.ShoppingCart.main(null); } },
		new Call() { public void call() { Section5.SwitchEx.SwitchEx1.main(null); } },
		new Call() { public void call() { Section5.SwitchEx.SwitchEx2.main(null); } },
		new Call() { public void call() { Section5.ProblemSet5_1.ColorRange.main(null); } },
		new Call() { public void call() { Section5.ProblemSet5_2.TrafficLightChecker.main(null); } },
		new Call() { public void call() { Section5.ProblemSet5_3.TrafficLightSwitch.main(null); } },
		new Call() { public void call() { Section5.Quiz.main(null); } },
		new Call() { public void call() { Section6.BreakContinueEx.BreakContinue.main(null); } },
		new Call() { public void call() { Section6.BreakContinueEx.ComputeSum.main(null); } },
		new Call() { public void call() { Section6.BreakContinueEx.CountChar.main(null); } },
		new Call() { public void call() { Section6.BreakContinueEx.Divisors.main(null); } },
		new Call() { public void call() { Section6.ForLoopsEx.Countdown.main(null); } },
		new Call() { public void call() { Section6.ForLoopsEx.InfiniteLoop.main(null); } },
		new Call() { public void call() { Section6.ForLoopsEx.ScopeTest.main(null); } },
		new Call() { public void call() { Section6.WhileLoopExercise.SquareRootWhile.main(null); } },
		new Call() { public void call() { Section6.WhileLoopExercise.SumofNums.main(null); } },
		new Call() { public void call() { Section6.ProblemSet6_1.ValidatePin.main(null); } },
		new Call() { public void call() { Section6.ProblemSet6_2.DisplayMultiples.main(null); } },
		new Call() { public void call() { Section6.ProblemSet6_3.LoopShapeTest.main(null); } },
		new Call() { public void call() { Section6.Quiz.main(null); } },
		new Call() { public void call() { Section7.AccountTest.AccountTest.main(null); } },
		new Call() { public void call() { Section7.PrisonTest_2.PrisonTest.main(null); } },
		new Call() { public void call() { Section7.PrisonTest_3.PrisonTest.main(null); } },
		new Call() { public void call() { Section7.PrisonTest_4.PrisonTest.main(null); } },
		new Call() { public void call() { Section7.PrisonTest_5.PrisonTest.main(null); } },
		new Call() { public void call() { Section7.PrisonTest_6.PrisonTest.main(null); } },
		new Call() { public void call() { Section7.ProblemSet7.ProblemSet07.main(null); } },
		new Call() { public void call() { Section7.Project.TicTacToe.main(null); } },
		new Call() { public void call() { Section8.ArraysEx.ArrayEx1.main(null); } },
		new Call() { public void call() { Section8.ArraysEx.ComputeAvg.main(null); } },
		new Call() { public void call() { Section8.ArraysEx.ArrayEx2.main(null); } },
		new Call() { public void call() { Section8.j2048.j2048Controller.main(null); } },
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