package Section8.j2048_2D;
import java.util.*;
public class j2048Model
{
	private int score;
	private int DIM;
	public j2048Model(int DIM) { this.DIM = DIM; }
	public j2048Model() { this(4); }
	public void init(int[][] board)
	{
		Random rand = new Random();
		for (int i = 0; i < 2; i++)
		{
			int x, y;
			do
			{
				x = rand.nextInt(DIM);
				y = rand.nextInt(DIM);
			}
			while (board[x][y] != 0);
			board[x][y] = 2;
		}
		score = 0;
	}
	public int getScore()
	{
		return score;
	}
	public boolean full(int[][] board)
	{
		for (int i = 0; i < DIM; i++) for (int j = 0; j < DIM; j++) if (board[i][j] == 0) return false;
		return true;
	}
	public boolean hasMove(int[][] board)
	{
		if (!full(board)) return true;
		for (int i = 0; i < DIM; i++)
		{
			for (int j = 0; j < DIM; j++)
			{
				try { if (board[i][j] == board[i - 1][j]) return true; }
				catch(ArrayIndexOutOfBoundsException e) { }
				try { if (board[i][j] == board[i + 1][j]) return true; }
				catch(ArrayIndexOutOfBoundsException e) { }
				try { if (board[i][j] == board[i][j - 1]) return true; }
				catch(ArrayIndexOutOfBoundsException e) { }
				try { if (board[i][j] == board[i][j + 1]) return true; }
				catch(ArrayIndexOutOfBoundsException e) { }
			}
		}
		return false;
	}
	public void spawn(int[][] board) 
	{
		if (full(board)) return;
		Random rand = new Random();
		int x, y, type;
		do
		{
			x = rand.nextInt(DIM);
			y = rand.nextInt(DIM);
		}
		while (board[x][y] != 0);
		type = rand.nextInt(10);
		if (type > 0) board[x][y] = 2;
		else board[x][y] = 4;
	}
	public boolean shiftLeft(int[][] board)
	{
		boolean change = false;
		boolean changed;
		do
		{
			changed = false;
			for (int i = 0; i < DIM; i++)
			{
				for (int j = 0; j < DIM; j++)
				{
					if (board[i][j] == 0)
					{
						for (int k = j; k < DIM - 1; k++)
						{
							if (board[i][k] != board[i][k + 1])
							{
								changed = true;
								change = true;
							}
							board[i][k] = board[i][k + 1];
						}
						board[i][DIM - 1] = 0;
					}
				}
			}
		} while (changed);
		for (int i = 0; i < DIM; i++)
		{
			for (int j = 0; j < DIM - 1; j++)
			{
				if (board[i][j] != 0 && board[i][j] == board[i][j + 1])
				{
					change = true;
					board[i][j] *= 2;
					score += board[i][j];
					board[i][j + 1] = 0;
				}
			}
		}
		do
		{
			changed = false;
			for (int i = 0; i < DIM; i++)
			{
				for (int j = 0; j < DIM; j++)
				{
					if (board[i][j] == 0)
					{
						for (int k = j; k < DIM - 1; k++)
						{
							if (board[i][k] != board[i][k + 1])
							{
								changed = true;
								change = true;
							}
							board[i][k] = board[i][k + 1];
						}
						board[i][DIM - 1] = 0;
					}
				}
			}
		} while (changed);
		return change;
	}
	public boolean shiftRight(int[][] board)
	{
		boolean changed;
		boolean change = false;
		do
		{
			changed = false;
			for (int i = 0; i < DIM; i++)
			{
				for (int j = DIM - 1; j >= 0; j--)
				{
					if (board[i][j] == 0)
					{
						for (int k = j; k > 0; k--)
						{
							if (board[i][k] != board[i][k - 1])
							{
								changed = true;
								change = true;
							}
							board[i][k] = board[i][k - 1];
						}
						board[i][0] = 0;
					}
				}
			}
		} while (changed);
		for (int i = 0; i < DIM; i++)
		{
			for (int j = DIM - 1; j > 0; j--)
			{
				if (board[i][j] != 0 && board[i][j] == board[i][j - 1])
				{
					change = true;
					board[i][j] *= 2;
					score += board[i][j];
					board[i][j - 1] = 0;
				}
			}
		}
		do
		{
			changed = false;
			for (int i = 0; i < DIM; i++)
			{
				for (int j = DIM - 1; j >= 0; j--)
				{
					if (board[i][j] == 0)
					{
						for (int k = j; k > 0; k--)
						{
							if (board[i][k] != board[i][k - 1])
							{
								change = true;
								changed = true;
							}
							board[i][k] = board[i][k - 1];
						}
						board[i][0] = 0;
					}
				}
			}
		} while (changed);
		return change;
	}
	public boolean shiftUp(int[][] board)
	{
		boolean changed;
		boolean change = false;
		do
		{
			changed = false;
			for (int j = 0; j < DIM; j++)
			{
				for (int i = 0; i < DIM; i++)
				{
					if (board[i][j] == 0)
					{
						for (int k = i; k < DIM - 1; k++)
						{
							if (board[k][j] != board[k + 1][j])
							{
								changed = true;
								change = true;
							}
							board[k][j] = board[k + 1][j];
						}
						board[DIM - 1][j] = 0;
					}
				}
			}
		} while (changed);
		for (int j = 0; j < DIM; j++)
		{
			for (int i = 0; i < DIM - 1; i++)
			{
				if (board[i][j] != 0 && board[i][j] == board[i + 1][j])
				{
					change = true;
					board[i][j] *= 2;
					score += board[i][j];
					board[i + 1][j] = 0;
				}
			}
		}
		do
		{
			changed = false;
			for (int j = 0; j < DIM; j++)
			{
				for (int i = 0; i < DIM; i++)
				{
					if (board[i][j] == 0)
					{
						for (int k = i; k < DIM - 1; k++)
						{
							if (board[k][j] != board[k + 1][j])
							{
								change = true;
								changed = true;
							}
							board[k][j] = board[k + 1][j];
						}
						board[DIM - 1][j] = 0;
					}
				}
			}
		} while (changed);
		return change;
	}
	public boolean shiftDown(int[][] board)
	{
		boolean change = false;
		boolean changed;
		do
		{
			changed = false;
			for (int j = 0; j < DIM; j++)
			{
				for (int i = DIM - 1; i >= 0; i--)
				{
					if (board[i][j] == 0)
					{
						for (int k = i; k > 0; k--)
						{
							if (board[k][j] != board[k - 1][j])
							{
								changed = true;
								change = true;
							}
							board[k][j] = board[k - 1][j];
						}
						board[0][j] = 0;
					}
				}
			}
		} while (changed);
		for (int j = 0; j < DIM; j++)
		{
			for (int i = DIM - 1; i > 0; i--)
			{
				if (board[i][j] != 0 && board[i][j] == board[i - 1][j])
				{
					change = true;
					board[i][j] *= 2;
					score += board[i][j];
					board[i - 1][j] = 0;
				}
			}
		}
		do
		{
			changed = false;
			for (int j = 0; j < DIM; j++)
			{
				for (int i = DIM - 1; i >= 0; i--)
				{
					if (board[i][j] == 0)
					{
						for (int k = i; k > 0; k--)
						{
							if (board[k][j] != board[k - 1][j])
							{
								changed = true;
								change = true;
							}
							board[k][j] = board[k - 1][j];
						}
						board[0][j] = 0;
					}
				}
			}
		} while (changed);
		return change;
	}
}