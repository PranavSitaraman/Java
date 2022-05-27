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
public class Result
{
    public int value;
    public ArrayList<Move> moves;
    public Result(int value)
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