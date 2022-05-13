package Section9.ProblemSet9;
import javafx.application.*;
import javafx.event.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.paint.*;
import javafx.scene.image.*;
import javafx.scene.media.*;
import javafx.scene.input.*;
import javafx.scene.text.*;
import javafx.scene.shape.*;
import javafx.scene.effect.*;
import java.util.*;
import java.io.*;
public class App extends Application
{
    public static Group root = new Group();
    @Override
    public void start(Stage primaryStage)
    {
        Scene scene = new Scene(root, 800, 650, Color.WHITE);
        primaryStage.setTitle("Campus");
        primaryStage.setScene(scene);
        primaryStage.show();
        ImageView backgroundView = new ImageView(new Image("file:c:/Users/Pranav Sitaraman/Documents/Programming/Java/CSE/Section9/ProblemSet9/Images/Campus.png"));
        backgroundView.setPreserveRatio(true);
        backgroundView.setFitWidth(800);
        root.getChildren().add(backgroundView);
        backgroundView.toBack();
    }
    public static void main(String[] args)
    {
        Dorm dorm1 = new Dorm(50, 200, Dorm.MIN_POPULATION + (int) (Math.random() * (Dorm.MAX_POPULATION - Dorm.MIN_POPULATION)), "Dorm 1", Color.rgb(0, 0, 255, 0.5));
        Dorm dorm2 = new Dorm(200, 75, Dorm.MIN_POPULATION + (int) (Math.random() * (Dorm.MAX_POPULATION - Dorm.MIN_POPULATION)), "Dorm 2", Color.rgb(0, 255, 0, 0.5));
        Dorm dorm3 = new Dorm(550, 150, Dorm.MIN_POPULATION + (int) (Math.random() * (Dorm.MAX_POPULATION - Dorm.MIN_POPULATION)), "Dorm 3", Color.rgb(255, 0, 0, 0.5));
        Dorm dorm4 = new Dorm(225, 550, Dorm.MIN_POPULATION + (int) (Math.random() * (Dorm.MAX_POPULATION - Dorm.MIN_POPULATION)), "Dorm 4", Color.rgb(255, 255, 0, 0.5));
        Dorm dorm5 = new Dorm(375, 500, Dorm.MIN_POPULATION + (int) (Math.random() * (Dorm.MAX_POPULATION - Dorm.MIN_POPULATION)), "Dorm 5", Color.rgb(255, 0, 255, 0.5));
        Dorm dorm6 = new Dorm(700, 525, Dorm.MIN_POPULATION + (int) (Math.random() * (Dorm.MAX_POPULATION - Dorm.MIN_POPULATION)), "Dorm 6", Color.rgb(128, 64, 64, 0.5));
        Center allDorms = new Center("All Dorms", true, dorm1, dorm2, dorm3, dorm4, dorm5, dorm6);
        Center studyGroup = new Center("Study Group", false, dorm1, dorm2, dorm3);
        launch(args);
    }
}