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
public class Iteration
{
    public Move computerMove;
    public Outcome result; 
    public Iteration(Move computerMove, Outcome result)
    {
        this.computerMove = computerMove;
        this.result = result;
    }
}