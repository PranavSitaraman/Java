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
public class Dorm
{
    public static int MIN_POPULATION = 100;
    public static int MAX_POPULATION = 400;
    public int xLocation;
    public int yLocation;
    public int population;
    private int xBarWidth = 100;
    private int xBarHeight = 15;
    private double iconGrabPositionx;
    private double iconGrabPositiony;
    private double mouseGrabPositionx;
    private double mouseGrabPositiony;
    private double mouseReleasePositionx;
    private double mouseReleasePositiony;
    private ScrollBar xscrollBar;
    private String text;
    private Rectangle dormRect = new Rectangle();
    private Color fillColor;
    private Color outlineColor = Color.YELLOW;
    private Text display = new Text();
    public Dorm(int xLocation, int yLocation, int population, String text, Color fillColor)
    {
        this.xLocation = xLocation; this.yLocation = yLocation; this.population = population; this.text = text; this.fillColor = fillColor;
        display.setFill(Color.RED);
        DropShadow dropShadow = new DropShadow();
        dropShadow.setRadius(2);
        dropShadow.setSpread(1);
        dropShadow.setColor(Color.BLACK);
        display.setEffect(dropShadow);
        display.setFont(Font.font("Default", FontWeight.BOLD, 16));
        App.root.getChildren().addAll(dormRect, display);
        interactions();
        updateDrawing();
    }
    public void updateDrawing()
    {
        dormRect.setWidth(150.0 * population/MAX_POPULATION);
        dormRect.setHeight(150.0 * population/MAX_POPULATION);
        dormRect.setLayoutX(xLocation - dormRect.getWidth()/2);
        dormRect.setLayoutY(yLocation - dormRect.getHeight()/2);
        dormRect.setFill(fillColor);
        dormRect.setStroke(outlineColor);
        display.setText(text + ":\n" + population);
        display.setLayoutX(dormRect.getLayoutX() - 40);
        display.setLayoutY(dormRect.getLayoutY() + dormRect.getHeight() + 15);
        display.setTextAlignment(TextAlignment.CENTER);
        display.setWrappingWidth(dormRect.getWidth() + 80);
        Center.update();
    }
    private void interactions()
    {
        dormRect.setOnMouseEntered((MouseEvent me) -> { DropShadow dropShadow = new DropShadow(); dropShadow.setRadius(50); dropShadow.setColor(Color.rgb(255, 253, 153)); dormRect.setEffect(dropShadow); updateDrawing(); });
        dormRect.setOnMouseExited((MouseEvent me) -> { dormRect.setEffect(null); updateDrawing(); });
        dormRect.setOnMousePressed((MouseEvent me) -> { mouseGrabPositionx = me.getSceneX(); mouseGrabPositiony = me.getSceneY(); iconGrabPositionx = xLocation; iconGrabPositiony = yLocation; dormRect.toFront(); updateDrawing(); });
        dormRect.setOnMouseDragged((MouseEvent me) -> { mouseReleasePositionx = me.getSceneX(); mouseReleasePositiony = me.getSceneY(); xLocation = (int) (me.getSceneX() - mouseGrabPositionx + iconGrabPositionx); yLocation = (int) (me.getSceneY() - mouseGrabPositiony + iconGrabPositiony); updateDrawing(); });
        display.setOnMouseReleased((MouseEvent me) -> { xscrollBar.toBack(); if (xscrollBar != null) App.root.getChildren().remove(xscrollBar); xscrollBar = null; updateDrawing(); });
        display.setOnMouseDragged((MouseEvent me) ->
        {
            mouseReleasePositionx = me.getSceneX();
            population = (int) (2 * me.getSceneX() - 2 * mouseGrabPositionx + iconGrabPositionx);
            population = (population < MIN_POPULATION ? MIN_POPULATION : (population > MAX_POPULATION ? MAX_POPULATION : population));
            xscrollBar.setValue(population);
            xscrollBar.setLayoutY(dormRect.getLayoutY() + dormRect.getHeight() + 40);
            updateDrawing();
        });
        display.setOnMousePressed((MouseEvent me) -> { if (xscrollBar == null)
        {
            mouseGrabPositionx = me.getSceneX();
            iconGrabPositionx = population;
            xscrollBar = new ScrollBar();
            xscrollBar.setMin(Dorm.MIN_POPULATION);
            xscrollBar.setMax(Dorm.MAX_POPULATION);
            xscrollBar.setValue(population);
            xscrollBar.setMinSize(xBarWidth, xBarHeight);
            xscrollBar.setPrefSize(xBarWidth, xBarHeight);
            xscrollBar.setMaxSize(xBarWidth, xBarHeight);
            xscrollBar.setLayoutX(dormRect.getLayoutX());
            xscrollBar.setLayoutY(dormRect.getLayoutY() + dormRect.getHeight() + 40);
            App.root.getChildren().add(xscrollBar);
            updateDrawing();
        }});
    }
}