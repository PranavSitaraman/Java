package Connect4;
import java.util.*;
import java.util.concurrent.*;
import java.io.*;
import java.lang.*;
import javafx.application.*;
import javafx.animation.*;
import javafx.animation.PathTransition.*;
import javafx.event.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.image.*;
import javafx.scene.input.*;
import javafx.scene.paint.*;
import javafx.scene.shape.*;
import javafx.stage.*;
import javafx.util.*;
public class Move
{
    public int row;
    public int column;
    public static Result[] eval = new Result[7];
    public Move(int row, int column)
    {
        this.row = row;
        this.column = column;
    }
    public String toString()
    {
        return "(" + (row + 1) + ", " + (column + 1) + ")";
    }
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
            else eval[j] = new Result(Integer.MAX_VALUE);
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