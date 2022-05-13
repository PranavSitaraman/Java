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
public class Center
{
    private static ArrayList<Center> allPoints = new ArrayList<>();
    private boolean isBuildings = true;
    private Dorm[] dorms;
    private int xLocation;
    private int yLocation;
    private String text;
    private int distance;
    private Circle point = new Circle();
    private Color fillColor = Color.BLACK;
    private Color outlineColor = Color.YELLOW;
    private Text display = new Text();
    public Center(String text, boolean isBuildings, Dorm... dorms)
    {
        this.text = text + "\nDistance: "; this.isBuildings = isBuildings; this.dorms = dorms;
        display.setFill(Color.RED);
        DropShadow dropShadow = new DropShadow();
        dropShadow.setRadius(2);
        dropShadow.setSpread(1);
        dropShadow.setColor(Color.BLACK);
        display.setEffect(dropShadow);
        display.setFont(Font.font("Default", FontWeight.BOLD, 16));
        App.root.getChildren().addAll(point, display);
        allPoints.add(this);
        calculateCenter();
        updateDrawing();
        Center.update();
    }
    public void updateDrawing()
    {
        point.setCenterX(xLocation);
        point.setCenterY(yLocation);
        point.setRadius(10);  
        point.setFill(fillColor);
        point.setStroke(outlineColor);
        display.setText(text + distance);
        display.setX(xLocation - 20);
        display.setY(yLocation + point.getRadius() + 15);
    }
    private void calculateCenter()
    {
        if (isBuildings)
        {
            int pop = 0;
            xLocation = 0;
            yLocation = 0;
            for (Dorm dorm : dorms) { xLocation += dorm.xLocation * dorm.population; yLocation += dorm.yLocation * dorm.population; pop += dorm.population; }
            xLocation /= pop;
            yLocation /= pop;
        }
        else
        {
            xLocation = 0;
            yLocation = 0;
            for (Dorm dorm : dorms) { xLocation += dorm.xLocation; yLocation += dorm.yLocation; }
            xLocation /= dorms.length;
            yLocation /= dorms.length;
        }
        distance = (int) Math.sqrt(Math.pow(dorms[0].xLocation - xLocation, 2) + Math.pow(dorms[0].yLocation - yLocation, 2));
    }
    public static void update() { for (Center point : allPoints) { point.calculateCenter(); point.updateDrawing(); point.point.toFront(); point.display.toFront(); }}
}