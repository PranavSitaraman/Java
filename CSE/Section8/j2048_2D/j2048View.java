package Section8.j2048_2D;
import java.util.*;
public class j2048View
{
	private int DIM;
	public j2048View(int DIM) { this.DIM = DIM; }
	public j2048View() { this(4); }
	public void draw(int[][] board)
	{
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
}