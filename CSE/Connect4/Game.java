package Connect4;
import java.util.*;
import java.lang.Math;
public class Game
{
    public static char player; // letter of player
    public static char opponent; // letter of opponent
    // plays against the computer
    public static void play()
    {
        player = 'x';
        opponent = 'o';
        Scanner in = new Scanner(System.in);
        Board board = new Board();
        Move.updateEval(board);
        board.printboard();
        Move move = new Move(0, 0);
        int turn = 0;
        while (!board.full())
        {
            if (turn % 2 == 0)
            {
                player = 'x'; opponent = 'o';
                Move.updateEval(board);
                System.out.println("Player's turn to play. ");
                do
                {
                    System.out.print("Enter column: ");
                    try { move.column = Integer.parseInt(in.nextLine()) - 1; }
                    catch (Exception e) {};
                } while (move.column < 0 || move.column >= board.board[0].length || board.getTop(move.column) == -1);
                move.row = board.getTop(move.column);
                board.board[move.row][move.column] = player;
                if (board.evaluate() == -10)
                {
                    // player wins
                    board.printboard();
                    System.out.println("Player wins!");
                    return;
                }
                player = 'o'; opponent = 'x';
                Move.updateEval(board);
                board.printboard(); 
                
            }
            else
            {
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
                    return;
                }
                player = 'x'; opponent = 'o';
                Move.updateEval(board);
                board.printboard();
            }
            turn++;
        }
        // tie
        System.out.println("Tie!"); 
    }
}