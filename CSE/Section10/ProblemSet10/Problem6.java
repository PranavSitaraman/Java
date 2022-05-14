public class Vehicle
{
	private int wheels;
	public Vehicle(int wheels)
	{
		this.wheels = wheels;
	}
	public int getWheels()
	{
		return wheels;
	}
}
public class Car extends Vehicle
{
	private int numDoors;
	private boolean isElectric;
	public Car (int numWheels, int numDoors, boolean isElectric)
	{
		super(numWheels);
		this.numDoors = numDoors;
		this.isElectric = isElectric;
	}
	public int getNumDoors()
	{
		return numDoors;
	}
	public boolean getIsElectric()
	{
		return isElectric;
	}
}
public class Bicycle extends Vehicle
{
	private String bikeType;
	public Bicycle(int numWheels, String bikeType)
	{
		super(numWheels);
		this.bikeType = bikeType;
	}
	public String getBikeType()
	{
		return bikeType;
	}
}
public class Convertible extends Car
{
	private String roofType;
	public Convertible(int numWheels, int numDoors, boolean isElectric, String roofType)
	{
		super(numWheels, numDoors, isElectric);
		this.roofType = roofType;
	}
	public String getRoofType()
	{
		return roofType;
	}
}