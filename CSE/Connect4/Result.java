package Connect4;
import java.util.*;
import java.lang.Math;
// defines the move object
public class Result
{
    public int value; // row of move
    public ArrayList<Move> moves; // list of moves;
    public Result(int value) // constructor
    {
        this.value = value;
        moves = new ArrayList<Move>();
    }
    public void add(int row, int col)
    {
        Move next = new Move(row, col);
        moves.add(0, next);
    }
}