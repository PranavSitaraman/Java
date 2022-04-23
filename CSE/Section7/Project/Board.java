package Section7.Project;
import java.util.*;
import java.lang.Math;
public class Board
{
    public char[][] board; // 2D array
    public Board() // constructor
    {
        board = new char[3][3];
        for (int i = 0; i < 3; i++) for (int j = 0; j < 3; j++) board[i][j] = ' ';
    }
    public boolean empty() // checks if the board is not full yet
    {
        for (int i = 0; i < 3; i++) for (int j = 0; j < 3; j++) if (board[i][j] == ' ') return true;
        return false;
    }
    public int evaluate() // evaluates if the board has a winning or losing position 
    {
        for (int row = 0; row < 3; row++)
        {
            if (board[row][0] == board[row][1] && board[row][1] == board[row][2])
            {
                if (board[row][0] == Game.player) return 10;
                else if (board[row][0] == Game.opponent) return -10;
            }
        }
        for (int column = 0; column < 3; column++)
        {
            if (board[0][column] == board[1][column] && board[1][column] == board[2][column])
            {
                if (board[0][column] == Game.player) return 10;
                else if (board[0][column] == Game.opponent) return -10;
            }
        }
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2])
        {
            if (board[0][0] == Game.player) return 10;
            else if (board[0][0] == Game.opponent) return -10;
        }
        if (board[0][2] == board[1][1] && board[1][1] == board[2][0])
        {
            if (board[0][2] == Game.player) return 10;
            else if (board[0][2] == Game.opponent) return -10;
        }
        return 0;
    }
    public void printboard() // prints the current state of the board
    {
        System.out.println("\n    -------------\n    | 1 | 2 | 3 |\n-----------------\n| 1 | " + board[0][0] + " | " + board[0][1] + " | " + board[0][2] + " |\n-----------------\n| 2 | " + board[1][0] + " | " + board[1][1] + " | " + board[1][2] + " |\n-----------------\n| 3 | " + board[2][0] + " | " + board[2][1] + " | " + board[2][2] + " |\n-----------------\n");
    }
    public Move humanMove() // returns a random, legal human move
    {
        Random rand = new Random();
        Move bestMove = new Move(-1, -1);
        boolean correct = false;
        while (correct == false)
        {
            int row = rand.nextInt(3);
            int column = rand.nextInt(3);
            if (board[row][column] == ' ')
            {
                correct = true;
                bestMove.row = row;
                bestMove.column = column;
            }
        }
        return bestMove;
    }
    public Move computerMove(int alphaBeta) // returns the optimal move from the computer, wrapper function for minimax
    {
        int bestVal = Integer.MIN_VALUE;
        Move bestMove = new Move(-1, -1);
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                if (board[i][j] == ' ')
                {
                    board[i][j] = Game.player;
                    int moveVal;
                    if (alphaBeta == 0) moveVal = Minimax.minimax(this, 0, false);
                    else moveVal = Minimax.minimax(this, 0, false, Integer.MIN_VALUE, Integer.MAX_VALUE);
                    board[i][j] = ' ';
                    if (moveVal > bestVal)
                    {
                        bestMove.row = i;
                        bestMove.column = j;
                        bestVal = moveVal;
                    }
                }
            }
        }
        return bestMove;
    }
}