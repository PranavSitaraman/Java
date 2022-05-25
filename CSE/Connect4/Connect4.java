package Connect4;
import java.util.*;
import javafx.application.*;
import javafx.animation.*;
import javafx.event.*;
import javafx.stage.*;
import javafx.util.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.input.*;
import javafx.scene.paint.*;
import javafx.scene.shape.*;
import javafx.animation.PathTransition.*;
import java.util.concurrent.*;
public class Connect4 extends Application
{
	public static Group root;
	public static Tile board[][];
	public static ArrayList<Circle> coins;
	public Circle add(Move m)
	{
		Path path = new Path();
		PathTransition pathTransition = new PathTransition();
		path.getElements().add(new MoveTo(75 * m.column + 37.5, 0));
		path.getElements().add(new MoveTo(75 * m.column + 37.5, 75 * m.row + 37.5));
		Circle a = new Circle(75 * m.column + 37.5, 0, 30);
		a.setRadius(30);
		coins.add(a);
		TranslateTransition slide = new TranslateTransition(Duration.millis(1000), a);
		slide.setByX(0);
		slide.setByY(75 * m.row + 37.5);
		slide.setNode(a);
		slide.setDuration(Duration.millis(1000));
		slide.play();
		return a;
	}
	EventHandler<MouseEvent> eventHandler = new EventHandler<MouseEvent>()
	{ 
		@Override 
		public void handle(MouseEvent e)
		{ 
			System.out.println("handled");
			root.getChildren().add(add(new Move(5, 1)));
		} 
	};   
    @Override
	public void start(Stage primaryStage)
	{
		LinearGradient gradient1 = new LinearGradient(0, 0, 0, 1, true, CycleMethod.NO_CYCLE, new Stop[]
		{
			new Stop(0, Color.web("#abb2e0")),
			new Stop(1, Color.web("#6b6f8a"))
		});
		LinearGradient gradient2 = new LinearGradient(0, 0, 0, 1, true, CycleMethod.NO_CYCLE, new Stop[]
		{
			new Stop(0, Color.web("#f2f2f5")),
			new Stop(1, Color.web("#a2a2a3"))
		});
		for (int i = 0; i < board.length; i++)
		{
			for (int j = 0; j < board[i].length; j++)
			{
				board[i][j] = new Tile();
				board[i][j].rect = new Rectangle(75 * j, 75 * i, 75, 75);
				board[i][j].circ = new Circle(75 * j + 37.5, 75 * i + 37.5, 30);
				root.getChildren().addAll(board[i][j].rect, board[i][j].circ);
				board[i][j].rect.setFill(gradient1);
				board[i][j].circ.setFill(gradient2);
				board[i][j].rect.setStroke(Color.web("#d2d2d4"));
				board[i][j].rect.setStrokeWidth(2);
			}
		}
		Scene scene = new Scene(root, 800, 600, Color.web("#f5f9ff"));
		primaryStage.setTitle("Connect 4");
		primaryStage.setScene(scene);
		primaryStage.show();
		primaryStage.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandler);
    }
    // runner function
    public static void main(String[] args)
    {
		root = new Group();
		board = new Tile[6][7];
		coins = new ArrayList<Circle>();
		Scanner in = new Scanner(System.in);
        /*
        while (true)
        {
            System.out.print("\nEnter \'p\' to play or \'q\' to quit: ");
            String choice = in.nextLine();
            if (choice.equals("p")) Game.play(); // plays against the computer
            else if (choice.equals("q")) break;
        }
        */
        try { launch(args); }
		catch (ArithmeticException e) { System.out.println(e); }
		
    }
}