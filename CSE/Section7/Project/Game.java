package Section7.Project;
import java.util.*;
import java.lang.Math;
public class Game
{
    public static char player; // letter of player
    public static char opponent; // letter of opponent
    public static long relativeTime; // operation count
    // plays against the computer
    public static void play()
    {
        player = 'x';
        opponent = 'o';
        relativeTime = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter \'0\' to play against easy mode (regular minimax) and \'1\' to play against hard mode (alpha-beta pruning): ");
        int difficult = in.nextInt();
        System.out.print("Enter \'0\' to go first and \'1\' for the computer to go first: ");
        int first = in.nextInt();
        Board board = new Board();
        // computer goes first
        if (first == 1)
        {
            board.printboard();
            System.out.println("Computer's turn to play:");
            Move bestMove = board.computerMove(difficult);
            board.board[bestMove.row][bestMove.column] = 'x';
            board.printboard();
            if (board.evaluate() == 10)
            {
                // computer wins
                System.out.println("Computer wins!");
                return;
            }
            while (board.empty())
            {
                System.out.println("Player's turn to play:");
                int row = 0;
                int column = 0;
                do
                {
                    System.out.print("Enter row and column: ");
                    row = in.nextInt() - 1;
                    column = in.nextInt() - 1;
                } while(!(row >= 0 && row <= 2 && column >= 0 && column <= 2 && board.board[row][column] == ' '));
                board.board[row][column] = 'o';
                board.printboard();
                if (board.evaluate() == -10)
                {
                    // player wins
                    System.out.println("Player wins!");
                    return;
                }
                System.out.println("Computer's turn to play:");
                bestMove = board.computerMove(difficult);
                board.board[bestMove.row][bestMove.column] = 'x';
                board.printboard();
                if (board.evaluate() == 10)
                {
                    // computer wins
                    System.out.println("Computer wins!");
                    return;
                }
            }
            // tie
            System.out.println("Tie!");
        }
        // player goes first
        else
        {
            player = 'o';
            opponent = 'x';
            board.printboard();
            System.out.println("Player's turn to play:");
            int row = 0;
            int column = 0;
            do
            {
                System.out.print("Enter row and column: ");
                row = in.nextInt() - 1;
                column = in.nextInt() - 1;
            } while (!(row >= 0 && row <= 2 && column >= 0 && column <= 2 && board.board[row][column] == ' '));
            board.board[row][column] = 'x';
            board.printboard();
            if (board.evaluate() == -10)
            {
                // player wins
                System.out.println("Player wins!");
                return;
            }
            while (board.empty())
            {
                System.out.println("Computer's turn to play:");
                Move bestMove = board.computerMove(difficult);
                board.board[bestMove.row][bestMove.column] = 'o';
                board.printboard();
                if (board.evaluate() == 10)
                {
                    // computer wins
                    System.out.println("Computer wins!");
                    return;
                }
                System.out.println("Player's turn to play:");
                do
                {
                    System.out.print("Enter row and column: ");
                    row = in.nextInt() - 1;
                    column = in.nextInt() - 1;
                } while (!(row >= 0 && row <= 2 && column >= 0 && column <= 2 && board.board[row][column] == ' '));
                board.board[row][column] = 'x';
                board.printboard();
                if (board.evaluate() == -10)
                {
                    // player wins
                    System.out.println("Player wins!");
                    return;
                }
            }
            // tie
            System.out.println("Tie!");
        }
    }
    // runs a performance test
    public static void testing()
    {
        player = 'x';
        opponent = 'o';
        relativeTime = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number of iterations: ");
        int iterations = in.nextInt();
        Board board = new Board();
        int wins = 0;
        int ties = 0;
        int losses = 0;
        // computer goes first
        for (int q = 0; q < 2; q++)
        {
            for (int i = 0; i < iterations; i++)
            {
                for (int j = 0; j < 3; j++) for (int k = 0; k < 3; k++) board.board[j][k] = ' ';
                Move bestMove = board.computerMove(q);
                board.board[bestMove.row][bestMove.column] = 'x';
                while (board.empty())
                {
                    bestMove = board.humanMove();
                    board.board[bestMove.row][bestMove.column] = 'o';
                    if (board.evaluate() == -10)
                    {
                        // computer loses
                        losses++;
                        break;
                    }
                    bestMove = board.computerMove(q);
                    board.board[bestMove.row][bestMove.column] = 'x';
                    if (board.evaluate() == 10)
                    {
                        // computer wins
                        wins++;
                        break;
                    }
                }
                // tie
                if (board.evaluate() == 0) ties++;
            }
            if (q == 0) System.out.println("Easy mode (regular minimax), going first - wins: " + wins + ", ties: " + ties + ", losses: " + losses + " - relative time of " + relativeTime + " operations.");
            else System.out.println("Hard mode (alpha-beta pruning), going first - wins: " + wins + ", ties: " + ties + ", losses: " + losses + " - relative time of " + relativeTime + " operations.");
            relativeTime = 0;
            wins = 0;
            ties = 0;
            losses = 0;
        }
        player = 'o';
        opponent = 'x';
        // computer goes second
        for (int q = 0; q < 2; q++)
        {
            for (int i = 0; i < iterations; i++)
            {
                for (int j = 0; j < 3; j++) for (int k = 0; k < 3; k++) board.board[j][k] = ' ';
                Move bestMove = board.humanMove();
                board.board[bestMove.row][bestMove.column] = 'x';
                while (board.empty())
                {
                    bestMove = board.computerMove(q);
                    board.board[bestMove.row][bestMove.column] = 'o';
                    if (board.evaluate() == 10)
                    {
                        // computer wins
                        wins++;
                        break;
                    }
                    bestMove = board.humanMove();
                    board.board[bestMove.row][bestMove.column] = 'x';
                    if (board.evaluate() == -10)
                    {
                        // computer loses
                        losses++;
                        break;
                    }
                }
                // computer ties
                if (board.evaluate() == 0) ties++;
            }
            if (q == 0) System.out.println("Easy mode (regular minimax), going second - wins: " + wins + ", ties: " + ties + ", losses: " + losses + " - relative time of " + relativeTime + " operations.");
            else System.out.println("Hard mode (alpha-beta pruning), going second - wins: " + wins + ", ties: " + ties + ", losses: " + losses + " - relative time of " + relativeTime + " operations.");
            relativeTime = 0;
            wins = 0;
            ties = 0;
            losses = 0;
        }
    }
}