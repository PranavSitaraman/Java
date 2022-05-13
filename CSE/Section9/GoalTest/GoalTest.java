package Section9.GoalTest;
import javafx.application.*;
import javafx.event.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.paint.*;
public class GoalTest extends Application
{
    public static Group root = new Group();
    public static String[] files = {
        "file:c:/Users/Pranav Sitaraman/Documents/Programming/Java/CSE/Section9/GoalTest/Images/Duke.png",
        "file:c:/Users/Pranav Sitaraman/Documents/Programming/Java/CSE/Section9/GoalTest/Images/Glove.png",
        "C:/Users/Pranav Sitaraman/Documents/Programming/Java/CSE/Section9/GoalTest/Audio/Note5.wav"
    };
    public int index = 0;
    @Override
    public void start(Stage primaryStage)
    {
        Button btn = new Button();
        btn.setText("Click!");
        btn.setOnAction(new EventHandler<ActionEvent>()
		{
			@Override
			public void handle(ActionEvent event)
			{
				new Goal(files[0], 100, 100, 50, files[1], 120, 100, 35, files[2]);
			}
		});
        root.getChildren().add(btn);
        Scene scene = new Scene(root, 600, 500, Color.rgb(50,50,50));
        primaryStage.setTitle("GoalTest");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args)
    {
        try { launch(args); }
        catch (Exception e) { System.out.println(e); }
    }
}
