package Section9.GoalTest;
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
import java.util.*;
import java.io.*;
public class Goal
{
    private Image dukeImage;
    private ImageView dukeImageView;
    private Image gloveImage;
    private ImageView gloveImageView;
    private AudioClip tone;
    public Goal(String image1, int x1, int y1, int width1, String image2, int x2, int y2, int width2, String audio)
    {   
        interactions(image1, x1, y1, width1, image2, x2, y2, width2, audio);
        GoalTest.root.getChildren().addAll(dukeImageView, gloveImageView);
    }
    private void interactions(String image1, int x1, int y1, int width1, String image2, int x2, int y2, int width2, String audio)
    {
        dukeImage = new Image(image1);
        dukeImageView = new ImageView(dukeImage);
        dukeImageView.toBack();
        dukeImageView.setX(x1);
        dukeImageView.setY(y1);
        dukeImageView.setPreserveRatio(true);
        dukeImageView.setFitWidth(width1);
        gloveImage = new Image(image2);
        gloveImageView = new ImageView(gloveImage);
        gloveImageView.toFront();
        gloveImageView.setX(x2);
        gloveImageView.setY(y2);
        gloveImageView.setPreserveRatio(true);
        gloveImageView.setFitWidth(width2);
        try
        {
            tone = new AudioClip((new File(audio)).toURI().toURL().toExternalForm());
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        dukeImageView.setOnMousePressed((MouseEvent me) -> { tone.play(); });
        dukeImageView.setOnMouseDragged((MouseEvent me) -> { System.out.println(me.getSceneX() + "\n" + me.getSceneY()); });
    }
}
