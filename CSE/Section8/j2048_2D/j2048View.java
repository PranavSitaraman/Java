package Section8.j2048_2D;
import java.util.*;
public class j2048View
{
	private int DIM;
	Scanner in;
	public j2048View(int DIM)
	{
		this.DIM = DIM;
		in = new Scanner(System.in);
	}
	public j2048View() { this(4); }
	public void draw(int[][] board, int score)
	{
		System.out.println("\nCurrent score: " + score);
		System.out.println();
		for (int i = 0; i < DIM; i++)
		{
			for (int j = 0; j < DIM; j++)
			{
				if (board[i][j] == 0) System.out.print("     -");
				else System.out.print(String.format("%6s", String.valueOf(board[i][j])).replace(' ', ' '));
			}
			System.out.println();
		}
		System.out.println();
	}
	public String getMove()
	{
		System.out.print("Move: ");
		String move = in.nextLine();
		if (!move.equals("w") && !move.equals("a") && !move.equals("s") && !move.equals("d") && !move.equals("q"))
		{
			do
			{
				System.out.print("Enter a move: \'w\' for up, \'a\' for left, \'s\' for down, \'d\' for right, and \'q\' to quit: ");
				move = in.nextLine();
			} while(!move.equals("w") && !move.equals("a") && !move.equals("s") && !move.equals("d") && !move.equals("q"));
		}
		return move;
	}
	public void gameOver(int score)
	{
		System.out.println("\nYour final score is " + score + "!");
		System.out.println("Game over!");
	}
}