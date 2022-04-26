package Section8.j2048_1D;
import java.util.*;
public class j2048Model
{
	private int score;
	private int DIM;
	public j2048Model(int DIM) { this.DIM = DIM; }
	public j2048Model() { this(4); }
	public void init(int[] board)
	{
		Random rand = new Random();
		for (int i = 0; i < 2; i++)
		{
			int x;
			do
			{
				x = rand.nextInt(DIM);
			}
			while (board[x] != 0);
			board[x] = 2;
		}
		score = 0;
	}
	public int getScore()
	{
		return score;
	}
	public boolean full(int[] board)
	{
		for (int i = 0; i < DIM; i++) if (board[i] == 0) return false;
		return true;
	}
	public boolean hasMove(int[] board)
	{
		if (!full(board)) return true;
		for (int i = 0; i < DIM; i++)
		{
			try { if (board[i] == board[i - 1]) return true; }
			catch(ArrayIndexOutOfBoundsException e) { }
			try { if (board[i] == board[i + 1]) return true; }
			catch(ArrayIndexOutOfBoundsException e) { }
		}
		return false;
	}
	public void spawn(int[] board) 
	{
		if (full(board)) return;
		Random rand = new Random();
		int x, type;
		do
		{
			x = rand.nextInt(DIM);
		}
		while (board[x] != 0);
		type = rand.nextInt(10);
		if (type > 0) board[x] = 2;
		else board[x] = 4;
	}
	public boolean shiftLeft(int[] board)
	{
		boolean change = false;
		boolean changed;
		do
		{
			changed = false;
			for (int j = 0; j < DIM; j++)
			{
				if (board[j] == 0)
				{
					for (int k = j; k < DIM - 1; k++)
					{
						if (board[k] != board[k + 1])
						{
							changed = true;
							change = true;
						}
						board[k] = board[k + 1];
					}
					board[DIM - 1] = 0;
				}
			}
		} while (changed);
		for (int j = 0; j < DIM - 1; j++)
		{
			if (board[j] != 0 && board[j] == board[j + 1])
			{
				change = true;
				board[j] *= 2;
				score += board[j];
				board[j + 1] = 0;
			}
		}
		do
		{
			changed = false;
			for (int j = 0; j < DIM; j++)
			{
				if (board[j] == 0)
				{
					for (int k = j; k < DIM - 1; k++)
					{
						if (board[k] != board[k + 1])
						{
							changed = true;
							change = true;
						}
						board[k] = board[k + 1];
					}
					board[DIM - 1] = 0;
				}
			}
		} while (changed);
		return change;
	}
	public boolean shiftRight(int[] board)
	{
		boolean changed;
		boolean change = false;
		do
		{
			changed = false;
			for (int j = DIM - 1; j >= 0; j--)
			{
				if (board[j] == 0)
				{
					for (int k = j; k > 0; k--)
					{
						if (board[k] != board[k - 1])
						{
							changed = true;
							change = true;
						}
						board[k] = board[k - 1];
					}
					board[0] = 0;
				}
			}
		} while (changed);
		for (int j = DIM - 1; j > 0; j--)
		{
			if (board[j] != 0 && board[j] == board[j - 1])
			{
				change = true;
				board[j] *= 2;
				score += board[j];
				board[j - 1] = 0;
			}
		}
		do
		{
			changed = false;
			for (int j = DIM - 1; j >= 0; j--)
			{
				if (board[j] == 0)
				{
					for (int k = j; k > 0; k--)
					{
						if (board[k] != board[k - 1])
						{
							changed = true;
							change = true;
						}
						board[k] = board[k - 1];
					}
					board[0] = 0;
				}
			}
		} while (changed);
		return change;
	}
}