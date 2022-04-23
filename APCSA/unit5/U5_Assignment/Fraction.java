package unit5.U5_Assignment;

public class Fraction
{
  /* Implement your Fraction class here */
  
  private int numerator;
  private int denominator;
  private static int numFractions;
  
  // Creates a 1/1 fraction
  public  Fraction() {
    numerator = 1;
    denominator = 1;
    numFractions++;
  }
  
  // Creates a fraction based on user input
  public Fraction(int n, int d) {
    this();
    setNumerator(n);
  
    setDenominator(d);
  }
  
  // Gets the current numerator
  public int getNumerator() {
    return numerator; 
  }
  
  // Gets the current denominator
  public int getDenominator() {
    return denominator;
  } 
  
  // Returns how many fractions that are created
  public static int getNumFractions() {
    return numFractions;
  }
  
  // Prints the fraction as a string, numerator over denominator, 1/1
  public String toString() {
    return numerator + "/" + denominator;
  }
  
  // Returns the whole number part of the fraction
  public String mixedNumber() {
    if (numerator/denominator<1) {
      return toString();
    } else if(numerator%denominator == 0) {
      return "" + numerator/denominator;
    } else {
      return numerator / denominator + " " + numerator % denominator + "/" + denominator;
    }
  }

  // Replaces the numerator
  public void setNumerator(int n) {
    if(n > 0)
      numerator = n;
  }
  
  // Replaces the denominator
  public void setDenominator(int d) {
    if(d > 0) 
      denominator = d;
  }
  
  // Adds a fraction to the create one
  public void add(int n, int d) {
    if(n > 0 && d > 0) {
      numerator = (numerator*d + denominator*n);
      denominator = denominator*d;
    }
  }
  
  // Adds a fractioon to another
  public void add(Fraction other) {
   add(other.getNumerator(), other.getDenominator());
  }
  
  // Multiplys fraction to another
  public void multiply(int n, int d) {
    if(n > 0 && d > 0) {
    numerator = numerator * n;
    denominator = denominator * d; }
}
  // Multiplys fraction to another
  public void multiply(Fraction other) {
    numerator = numerator * other.getNumerator();
    denominator = denominator * other.getDenominator();
  }
}
