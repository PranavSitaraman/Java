package Connect4;
import java.util.*;
import java.io.*;
import javafx.application.*;
import javafx.animation.*;
import javafx.event.*;
import javafx.stage.*;
import javafx.util.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.image.*;
import javafx.scene.input.*;
import javafx.scene.paint.*;
import javafx.scene.shape.*;
import javafx.animation.PathTransition.*;
import java.util.concurrent.*;
public class Connect4 extends Application
{
	public Group root = new Group();
	public Tile board[][] = new Tile[6][7];
	public ArrayList<Circle> coins = new ArrayList<Circle>();
	public Game game = new Game();
	public ImageView imageView;
	public Iteration next;
	public int col = 0;
	public LinearGradient gradient1 = new LinearGradient(0, 0, 0, 1, true, CycleMethod.NO_CYCLE, new Stop[]
	{
		new Stop(0, Color.web("#abb2e0")),
		new Stop(1, Color.web("#6b6f8a"))
	});
	public LinearGradient gradient2 = new LinearGradient(0, 0, 0, 1, true, CycleMethod.NO_CYCLE, new Stop[]
	{
		new Stop(0, Color.web("#f2f2f5")),
		new Stop(1, Color.web("#a2a2a3"))
	});
	public LinearGradient red = new LinearGradient(0, 0, 0, 1, true, CycleMethod.NO_CYCLE, new Stop[]
	{
		new Stop(0, Color.web("#f55f5f")),
		new Stop(1, Color.web("#a11d1d"))
	});
	public LinearGradient yellow = new LinearGradient(0, 0, 0, 1, true, CycleMethod.NO_CYCLE, new Stop[]
	{
		new Stop(0, Color.web("#ebdc7a")),
		new Stop(1, Color.web("#bfb44b"))
	});
	public void empty()
	{
		CompletableFuture<Iteration> process = CompletableFuture.supplyAsync(() -> game.play(col));
		while (!process.isDone());
		try { next = process.get(); } catch (Exception e) {}
		if (next.result != Outcome.USERWIN)
		{
			add(next.computerMove, yellow);
		}
		if (next.result != Outcome.NOWIN)
		{
			root.getChildren().clear();
		}
	};
	public Circle add(Move m, LinearGradient gradient, int q)
	{
		Path path = new Path();
		PathTransition pathTransition = new PathTransition();
		path.getElements().add(new MoveTo(100 + 75 * m.column + 37.5, 100 + 0));
		path.getElements().add(new MoveTo(100 + 75 * m.column + 37.5, 100 + 75 * m.row + 37.5));
		Circle a = new Circle(100 + 75 * m.column + 37.5, 100 + 0, 30);
		a.setRadius(30);
		a.setFill(gradient);
		coins.add(a);
		TranslateTransition slide = new TranslateTransition();
		slide.setByX(0);
		slide.setByY(75 * m.row + 37.5);
		slide.setNode(a);
		slide.setDuration(Duration.millis(1000));
		slide.setOnFinished(e -> empty());
		root.getChildren().add(a);
		slide.play();
		return a;
	}
	public Circle add(Move m, LinearGradient gradient)
	{
		Path path = new Path();
		PathTransition pathTransition = new PathTransition();
		path.getElements().add(new MoveTo(100 + 75 * m.column + 37.5, 100 + 0));
		path.getElements().add(new MoveTo(100 + 75 * m.column + 37.5, 100 + 75 * m.row + 37.5));
		Circle a = new Circle(100 + 75 * m.column + 37.5, 100 + 0, 30);
		a.setRadius(30);
		a.setFill(gradient);
		coins.add(a);
		TranslateTransition slide = new TranslateTransition();
		slide.setByX(0);
		slide.setByY(75 * m.row + 37.5);
		slide.setNode(a);
		slide.setDuration(Duration.millis(1000));
		root.getChildren().add(a);
		slide.play();
		return a;
	}
	private EventHandler<KeyEvent> keyListener = new EventHandler<KeyEvent>()
	{
		@Override
		public void handle(KeyEvent event)
		{
			if (event.getCode() == KeyCode.RIGHT)
			{
				if (col != 6)
				{
					col++;
					//imageView.setX(122.5 + col * 75);
					TranslateTransition slide = new TranslateTransition(Duration.millis(1000), imageView);
					slide.setByX(75);
					slide.setByY(0);
					slide.setNode(imageView);
					slide.setDuration(Duration.millis(100));
					slide.play();
				}
			}
			else if (event.getCode() == KeyCode.LEFT)
			{
				if (col != 0)
				{
					col--;
					TranslateTransition slide = new TranslateTransition(Duration.millis(1000), imageView);
					slide.setByX(-75);
					slide.setByY(0);
					slide.setNode(imageView);
					slide.setDuration(Duration.millis(100));
					slide.play();
				}
			} 
			else if (event.getCode() == KeyCode.ENTER)
			{
				if (game.board.getTop(col) != -1)
				{
					//CompletableFuture<Boolean> process = CompletableFuture.supplyAsync(() -> root.getChildren().add(add(new Move(game.board.getTop(col), col), red)));
					//while (!process.isDone());
					add(new Move(game.board.getTop(col), col), red, 1);
				}
			}
			event.consume();
		}
	}; 
    @Override
	public void start(Stage primaryStage)
	{
		for (int i = 0; i < board.length; i++)
		{
			for (int j = 0; j < board[i].length; j++)
			{
				board[i][j] = new Tile();
				board[i][j].rect = new Rectangle(100 + 75 * j, 100 + 75 * i, 75, 75);
				board[i][j].circ = new Circle(100 + 75 * j + 37.5, 100 + 75 * i + 37.5, 30);
				root.getChildren().addAll(board[i][j].rect, board[i][j].circ);
				board[i][j].rect.setFill(gradient1);
				board[i][j].circ.setFill(gradient2);
				board[i][j].rect.setStroke(Color.web("#d2d2d4"));
				board[i][j].rect.setStrokeWidth(2);
			}
		}
		try {
			imageView = new ImageView(new Image(new FileInputStream("C:/Users/Pranav Sitaraman/Documents/Programming/Java/CSE/Connect4/Arrow.png")));
			imageView.setX(121); 
			imageView.setY(15);
			imageView.setFitHeight(75); 
			imageView.setFitWidth(75); 
			imageView.setPreserveRatio(true);
			root.getChildren().add(imageView);
		}
		catch (Exception e) {System.out.println("failure");}
		Scene scene = new Scene(root, 800, 600, Color.web("#f5f9ff"));
		primaryStage.setTitle("Connect 4");
		primaryStage.setScene(scene);
		primaryStage.show();
		primaryStage.addEventFilter(KeyEvent.KEY_RELEASED, keyListener);
    }
    // runner function
    public static void main(String[] args)
    {
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