package Connect4;
import java.util.*;
import java.lang.Math;
// defines the move object
public class Move
{
    public int row; // row of move
    public int column; // column of move
    public static Result[] eval = new Result[7];
    public Move(int row, int column) // constructor
    {
        this.row = row;
        this.column = column;
    }
    public String toString()
    {
        return "(" + (row + 1) + ", " + (column + 1) + ")";
    }
    
    // returns the optimal move from the computer, wrapper function for minimax
    public static void updateEval(Board board)
    {
        for (int j = 0; j < board.board[0].length; j++)
        {
            int i = board.getTop(j);
            if (i != -1 && board.board[i][j] == ' ')
            {
                board.board[i][j] = Game.player;
                eval[j] = Minimax.minimax(board, 0, false, Integer.MIN_VALUE, Integer.MAX_VALUE);
                if (Game.player != 'x') eval[j].value *= -1;
                board.board[i][j] = ' ';
            }
            else
            {
                eval[j] = new Result(Integer.MAX_VALUE);
            }
        }
    }
    public static Move computerMove(Board board)
    {
        Move bestMove = new Move(-1, -1);
        int best = Integer.MAX_VALUE;
        for (int j = 0; j < board.board[0].length; j++)
        {
            if (eval[j].value < best)
            {
                best = eval[j].value;
                bestMove.row = board.getTop(j);
                bestMove.column = j;
            }
        }
        return bestMove;
    }
}