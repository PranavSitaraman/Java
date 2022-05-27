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
public class Board
{
    public char[][] board;
    public Board()
    {
        board = new char[6][7];
        for (int i = 0; i < board.length; i++) for (int j = 0; j < board[i].length; j++) board[i][j] = ' ';
    }
    public boolean full()
    {
        for (int i = 0; i < board.length; i++) for (int j = 0; j < board[i].length; j++) if (board[i][j] == ' ') return false;
        return true;
    }
    public int getTop(int col)
    {
        int row = board.length - 1;
        while (row >= 0 && board[row][col] != ' ') row--;
        return row;
    }
    public int evaluate()
    {
        for (int i = 0; i < board.length; i++)
        {
            for (int j = 0; j < board[i].length - 3; j++)
            {
                if (board[i][j] == board[i][j + 1] &&
                board[i][j + 1] == board[i][j + 2] &&
                board[i][j + 2] == board[i][j + 3])
                {
                    if (board[i][j] == Game.player) return 10;
                    else if (board[i][j] == Game.opponent) return -10;
                }
            }
        }
        for (int i = 0; i < board.length - 3; i++)
        {
            for (int j = 0; j < board[i].length; j++)
            {
                if (board[i][j] == board[i + 1][j] &&
                board[i + 1][j] == board[i + 2][j] &&
                board[i + 2][j] == board[i + 3][j])
                {
                    if (board[i][j] == Game.player) return 10;
                    else if (board[i][j] == Game.opponent) return -10;
                }         
            }
        }
        for (int i = 3; i < board.length; i++)
        {
            for (int j = 0; j < board[i].length - 3; j++)
            {
                if (board[i][j] == board[i - 1][j + 1] &&
                board[i - 1][j + 1] == board[i - 2][j + 2] &&
                board[i - 2][j + 2] == board[i - 3][j + 3])
                {
                    if (board[i][j] == Game.player) return 10;
                    else if (board[i][j] == Game.opponent) return -10;
                }
            }
        }
        for (int i = 3; i < board.length; i++)
        {
            for (int j = 3; j < board[i].length; j++)
            {
                if (board[i][j] == board[i - 1][j - 1] &&
                board[i - 1][j - 1] == board[i - 2][j - 2] &&
                board[i - 2][j - 2] == board[i - 3][j - 3])
                {
                    if (board[i][j] == Game.player) return 10;
                    else if (board[i][j] == Game.opponent) return -10;
                }
            }
        }
        return 0;
    }
    public void print()
    {
        System.out.print("\n    ");
        for (int i = 0; i < board[0].length; i++) System.out.print("----");
        System.out.print("-\n    ");
        for (int i = 0; i < board[0].length; i++) System.out.print("| " + (i + 1) + " ");
        System.out.println("|");
        for (int i = 0; i < board.length; i++)
        {
            for (int j = 0; j <= board[0].length; j++) System.out.print("----");
            System.out.print("-\n| " + (i + 1) + " ");
            for (int j = 0; j < board[0].length; j++) System.out.print("| " + board[i][j] + " ");
            System.out.println("|");
        }
        for (int i = 0; i <= board[0].length; i++) System.out.print("----");
        System.out.print("-\n    ");
        for (int i = 0; i < board[0].length; i++)
        {
            if (Move.eval[i].value == Integer.MAX_VALUE) System.out.print("| ~ ");
            else System.out.print("| " + Move.eval[i].value + " ");
        }
        System.out.print("|\n    ");
        for (int i = 0; i < board[0].length; i++) System.out.print("----");
        System.out.println("-\n");
        for (int i = 0; i < board[0].length; i++)
        {
            if (Move.eval[i].value == Integer.MAX_VALUE) System.out.println("~");
            else System.out.println(Move.eval[i].value + " " + Move.eval[i].moves);
        }
        System.out.println();
    }
}