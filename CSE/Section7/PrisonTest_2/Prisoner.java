package Section7.PrisonTest_2;

public class Prisoner
{
	public String name;
	private double height;
	private int yearsSentenced;
	public Prisoner(String name, double height, int yearsSentenced)
	{
		this.name = name;
		this.height = height;
		this.yearsSentenced = yearsSentenced;
	}
	public void think()
	{
		System.out.println("My name is " + name + ", I am " + height + " meters tall, and my sentence is " + yearsSentenced + " years.");
	}
}
