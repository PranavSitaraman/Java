package Section9.JavaFXTest2;
import javafx.application.*;
import javafx.event.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.paint.*;
import javafx.scene.shape.*;
public class JavaFXTest2 extends Application
{
	@Override
	public void start(Stage primaryStage)
	{
		Group root = new Group();
		Rectangle rect = new Rectangle(20, 20, 100, 200);
		LinearGradient gradient1 = new LinearGradient(0, 0, 1, 0, true, CycleMethod.NO_CYCLE, new Stop[]
		{
			new Stop(0, Color.DODGERBLUE),
			new Stop(1, Color.BLACK)
		});
		Polygon polygon1 = new Polygon(new double[]
		{
			45.0, 10.0,
			10.0, 80.0,
			80.0, 80.0,
		});
		root.getChildren().addAll(rect, polygon1);
		rect.setX(30);
		rect.setY(30);
		rect.setWidth(300);
		rect.setWidth(300);
		rect.setFill(gradient1);
		rect.setStroke(Color.CYAN);
		rect.setStrokeWidth(10);
		polygon1.setFill(gradient1);
		Scene scene = new Scene(root, 300, 250, Color.AQUAMARINE);
		primaryStage.setTitle("Hello World!");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public static void main(String[] args)
	{
		try { launch(args); }
		catch (Exception e) { System.out.println(e); }
	}
}