class Instrument
{
	private boolean onSale;
	private double price;
	private int numInStock;
	public Instrument(boolean onSale, double price, int numInStock)
	{
		this.onSale = onSale;
		this.price = price;
		this.numInStock = numInStock;
	}
	public double getPrice()
	{
		if (onSale) return price * 0.85;
		return price;
	}
	public double applyEmployeeDiscount()
	{
		return price * 0.75;
	}
	public void setOnSale(boolean onSale)
	{
		this.onSale = onSale;
	}
	public boolean getOnSale()
	{
		return onSale;
	}
	public void setPrice(double price)
	{
		this.price = price;
	}
	public int getNumInStock()
	{
		return numInStock;
	}
	public void setNumInStock(int numInStock)
	{
		this.numInStock = numInStock;
	}
}
class StringInstrument extends Instrument
{
	private int numStrings;
	public StringInstrument (boolean onSale, double price, int numInStock, int numStrings)
	{
		super(onSale, price, numInStock);
		this.numStrings = numStrings;
	}
	public int getNumStrings()
	{
		return numStrings;
	}
	public void setStrings(int numStrings)
	{
		this.numStrings = numStrings;
	}
}
class Guitar extends StringInstrument
{
	private boolean isElectric;
	public Guitar(boolean onSale, double price, int numInStock, int numStrings, boolean isElectric)
	{
		super(numStrings, onSale, price, numInStock);
		this.isElectric = isElectric;
	}
	public boolean getIsElectric()
	{
		return isElectric;
	}
}