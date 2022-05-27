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
public class Game
{
    public static char player;
    public static char opponent;
    public Board board;
    public Game()
    {
        player = 'x';
        opponent = 'o';
        board = new Board();
        Move.updateEval(board);
        board.print();
    }
    public Iteration play(int column)
    {
        Move move = new Move(0, 0);
        player = 'x'; opponent = 'o';
        Move.updateEval(board);
        move.column = column;
        move.row = board.getTop(move.column);
        board.board[move.row][move.column] = player;
        if (board.evaluate() == 10)
        {
            board.print();
            System.out.println("Player wins!");
            return new Iteration(new Move(0, 0), Outcome.USERWIN);
        }
        player = 'o'; opponent = 'x';
        Move.updateEval(board);
        board.print();
        player = 'o'; opponent = 'x';
        Move.updateEval(board);
        System.out.println("Computer's turn to play.");
        move = Move.computerMove(board);
        board.board[move.row][move.column] = player;
        if (board.evaluate() == 10)
        {
            board.print();
            System.out.println("Computer wins!");
            return new Iteration(move, Outcome.COMPUTERWIN);
        }
        player = 'x'; opponent = 'o';
        Move.updateEval(board);
        board.print();
        if (board.full())
        {
            System.out.println("Tie!");
            return new Iteration(move, Outcome.TIE);
        }
        else
        {
            return new Iteration(move, Outcome.NOWIN);
        }
    }
}