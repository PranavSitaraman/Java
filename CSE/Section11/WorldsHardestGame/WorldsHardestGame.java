package Section11.WorldsHardestGame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.awt.geom.Ellipse2D;
import java.awt.Rectangle;
import java.awt.Color;
public class WorldsHardestGame extends JPanel implements KeyListener,Runnable
{
	private int x = 80;
	private int y = 230;
	private int v = 5;
	private int dx = 0;
	private int dy = 0;
	private boolean dir = false;
	private boolean dir2 = false;
	private int failCount = 0;
	private int a = 250;
	private int a2 = 450;
	private int b1 = 125;
	private int b2 = 175;
	private int b3 = 225;
	private int b4 = 275;
	private int b5 = 325;
	private int e = 175;
	private int h = 110;
	private int w = 110;
	private int[] xVal = {200,450,450,550,550,1275,1275,1700,1700,1450,1450,1400,1350,1350,625,625};
	private int[] yVal = {250,250,690,690,290,290,230,230,740,740,290,290,690,690,750,750};
	private JFrame frame = new JFrame("World's Hardest Game");
	private Thread t = new Thread(this);
	private boolean gameOn = true;
	private Font f = new Font("TIMES NEW ROMAN", Font.PLAIN, 30);
	private Polygon poly = new Polygon(xVal, yVal, 16);
	private int left = 150;
	private int right = 550;
	private Rectangle character = new Rectangle(x,y,30,30);
	private Rectangle e1 = new Rectangle(a,b1,25,25);
	private Rectangle e2 = new Rectangle(a2,b2,25,25);
	private Rectangle e3 = new Rectangle(a,b3,25,25);
	private Rectangle e4 = new Rectangle(a2,b4,25,25);
	private Rectangle e5 = new Rectangle(a,b5,25,25);
	public WorldsHardestGame()
	{
		frame.addKeyListener(this);
		frame.add(this);
		frame.setSize(800,500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		t.start();
	}
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D)g;
		Color background = new Color(153, 153, 225);
		Color zone = new Color(173, 235, 173);
		g2d.setPaint(Color.WHITE);
		g2d.fillRect(0,0,800,500);
		g2d.setPaint(background);
		g2d.fillRect(0,0,2000,1500);
		g2d.setPaint(zone);
		g2d.fillRect(50,200,75,75);
		g2d.setPaint(Color.WHITE);
		g2d.fillRect(125,100,500,300);
		g2d.setPaint(zone);
		g2d.fillRect(655,200,50,75);
		g2d.setPaint(Color.WHITE);
		g2d.fillRect(625,210,30,55);
		poly = new Polygon();
		poly.addPoint(50,200);
		poly.addPoint(125,200);
		poly.addPoint(125,100);
		poly.addPoint(625,100);
		poly.addPoint(625,210);
		poly.addPoint(655,210);
		poly.addPoint(655,200);
		poly.addPoint(705,200);
		poly.addPoint(705,275);
		poly.addPoint(655,275);
		poly.addPoint(655,265);
		poly.addPoint(625,265);
		poly.addPoint(625,400);
		poly.addPoint(125,400);
		poly.addPoint(125,275);
		poly.addPoint(50,275);
		g2d.draw(poly);
		g2d.setColor(Color.WHITE);
		g2d.setFont(f);
		g2d.drawString("LEVEL: 1", 100, 50);
		g2d.setColor(Color.WHITE);
		g2d.setFont(f);
		g2d.drawString("FAILS: " + failCount, 550, 50);
		g2d.setColor(Color.RED);
		g2d.fillRect(x,y,30,30);
		g2d.setColor(Color.BLUE);
		g2d.fillOval(a,b1,25,25);
		g2d.setColor(Color.BLUE);
		g2d.fillOval(a2,b2,25,25);
		g2d.setColor(Color.BLUE);
		g2d.fillOval(a,b3,25,25);
		g2d.setColor(Color.BLUE);
		g2d.fillOval(a2,b4,25,25);
		g2d.setColor(Color.BLUE);
		g2d.fillOval(a,b5,25,25);
		g2d.setColor(Color.BLUE);
	}
	public void run()
	{
		while (true)
		{
			if (gameOn)
			{
				character = new Rectangle(x, y, 30, 30);
				e1 = new Rectangle(a, b1, 25, 25);
				e2 = new Rectangle(a2, b2, 25, 25);
				e3 = new Rectangle(a, b3, 25, 25);
				e4 = new Rectangle(a2, b4, 25, 25);
				e5 = new Rectangle(a, b5, 25, 25);
				if (character.intersects(e1) || character.intersects(e2) || character.intersects(e3) || character.intersects(e4) || character.intersects(e5))
				{
					x = 80;
					y = 230;
					failCount++;
				}
				if (poly.contains(new Rectangle(x + dx, y, 30, 30))) x += dx;
				if (poly.contains(new Rectangle(x, y + dy, 30, 30))) y += dy;
				if (a >= right || a <= left) dir = !dir;
				a += (dir ? -v : v);
				if (a2 >= right || a2 <= left) dir2 = !dir2;
				a2 += (dir2 ? -v : v);
				try { t.sleep(20); } catch (Exception e) {}
				repaint();
			}
		}
	}
	public void keyPressed(KeyEvent ke)
	{
		if (ke.getKeyCode() == 37) dx = -3;
		if (ke.getKeyCode() == 38) dy = -3;
		if (ke.getKeyCode() == 39) dx = 3;
		if (ke.getKeyCode() == 40) dy = 3;
	}
	public void keyReleased(KeyEvent ke)
	{
		if (ke.getKeyCode() == 37 || ke.getKeyCode() == 39) dx = 0;
		if (ke.getKeyCode() == 38 || ke.getKeyCode() == 40) dy = 0;
	}
	public void keyTyped(KeyEvent ke) { }
	public static void main(String args[])
	{
		WorldsHardestGame game = new WorldsHardestGame();
	}
}