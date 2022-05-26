package Connect4;
import java.util.*;
import java.lang.Math;
public class Game
{
    public static char player; // letter of player
    public static char opponent; // letter of opponent
    public Board board;
    // plays against the computer
    public Game()
    {
        player = 'x';
        opponent = 'o';
        board = new Board();
        Move.updateEval(board);
        board.printboard();
    }
    public Iteration play(int column)
    {
        Move move = new Move(0, 0);
        player = 'x'; opponent = 'o';
        Move.updateEval(board);
        move.column = column;
        move.row = board.getTop(move.column);
        board.board[move.row][move.column] = player;
        if (board.evaluate() == -10)
        {
            // player wins
            board.printboard();
            System.out.println("Player wins!");
            return new Iteration(new Move(0, 0), Outcome.USERWIN);
        }
        player = 'o'; opponent = 'x';
        Move.updateEval(board);
        board.printboard();
        player = 'o'; opponent = 'x';
        Move.updateEval(board);
        System.out.println("Computer's turn to play.");
        move = Move.computerMove(board);
        board.board[move.row][move.column] = player;
        if (board.evaluate() == 10)
        {
            // computer wins
            board.printboard();
            System.out.println("Computer wins!");
            return new Iteration(move, Outcome.COMPUTERWIN);
        }
        player = 'x'; opponent = 'o';
        Move.updateEval(board);
        board.printboard();
        if (board.full())
        {
            // tie
            System.out.println("Tie!");
            return new Iteration(move, Outcome.TIE);
        }
        else
        {
            return new Iteration(move, Outcome.NOWIN);
        }
    }
}