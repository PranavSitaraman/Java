package Section7.Project;
import java.util.*;
import java.lang.Math;
public class Minimax
{
    // minimax with alpha-beta pruning
	public static int minimax(Board board, int depth, boolean maximum, int alpha, int beta)
    {
        Game.relativeTime++;
        int score = board.evaluate();
        if (score == 10) return score;
        if (score == -10) return score;
        if (board.empty() == false) return 0;
        // maximize node
        if (maximum)
        {
            int best = Integer.MIN_VALUE;
            for (int i = 0; i < 3; i++)
            {
                for (int j = 0; j < 3; j++)
                {
                    if (board.board[i][j] == ' ')
                    {
                        board.board[i][j] = Game.player;
                        best = Math.max(best, minimax(board, depth + 1, !maximum, alpha, beta));
                        board.board[i][j] = ' ';
                        alpha = Math.max(alpha, best);
                        if (beta <= alpha) break;
                    }
                }
                if (beta <= alpha) break;
            }
            return best;
        }
        // minimize node
        else
        {
            int best = Integer.MAX_VALUE;
            for (int i = 0; i < 3; i++)
            {
                for (int j = 0; j < 3; j++)
                {
                    if (board.board[i][j] == ' ')
                    {
                        board.board[i][j] = Game.opponent;
                        best = Math.min(best, minimax(board, depth + 1, !maximum, alpha, beta));
                        board.board[i][j] = ' ';
                        beta = Math.min(beta, best);
                        if (beta <= alpha) break;
                    }
                }
                if (beta <= alpha) break;
            }
            return best;
        }
    }
    // regular minimax recursive function
    public static int minimax(Board board, int depth, boolean maximum)
    {
        Game.relativeTime++;
        int score = board.evaluate();
        if (score == 10) return score;
        if (score == -10) return score;
        if (board.empty() == false) return 0;
        // maximize node
        if (maximum)
        {
            int best = Integer.MIN_VALUE;
            for (int i = 0; i < 3; i++)
            {
                for (int j = 0; j < 3; j++)
                {
                    if (board.board[i][j] == ' ')
                    {
                        board.board[i][j] = Game.player;
                        best = Math.max(best, minimax(board, depth + 1, !maximum));
                        board.board[i][j] = ' ';
                    }
                }
            }
            return best;
        }
        // minimize node
        else
        {
            int best = Integer.MAX_VALUE;
            for (int i = 0; i < 3; i++)
            {
                for (int j = 0; j < 3; j++)
                {
                    if (board.board[i][j] == ' ')
                    {
                        board.board[i][j] = Game.opponent;
                        best = Math.min(best, minimax(board, depth + 1, !maximum));
                        board.board[i][j] = ' ';
                    }
                }
            }
            return best;
        }
    }
}