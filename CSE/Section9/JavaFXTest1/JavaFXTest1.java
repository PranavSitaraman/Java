package Section9.JavaFXTest1;
import javafx.application.*;
import javafx.event.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.paint.*;
public class JavaFXTest1 extends Application
{
	@Override
	public void start(Stage primaryStage)
	{
		Button btn1 = new Button();
		Button btn2 = new Button();
		btn1.setText("Click to say \'Hello World\'!");
		btn2.setText("Another Button");
		btn1.setOnAction(new EventHandler<ActionEvent>()
		{
			@Override
			public void handle(ActionEvent event)
			{
				System.out.println("You clicked the button. Hello World!");
			}
		});
		btn2.setOnAction(new EventHandler<ActionEvent>()
		{
			@Override
			public void handle(ActionEvent event)
			{
				System.out.println("Button 2!");
			}
		});
		Group root = new Group();
		HBox pane = new HBox();
		pane.getChildren().addAll(btn1, btn2);
		root.getChildren().add(pane);
		pane.setLayoutY(220);
		Scene scene = new Scene(root, 300, 250);
		primaryStage.setTitle("Hello World!");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public static void main(String[] args)
	{
		try
		{
			launch(args);
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
}