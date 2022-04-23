public class SpecialityCoffee extends Coffee {
  private String flavor;

  public SpecialityCoffee() {
    super();
    flavor = "vanilla";
  }

  public SpecialityCoffee(String size, String type, String flavor) {
    this(size, false, 1, type, flavor);
  }

  public SpecialityCoffee(String size, boolean isSkinny, int shots, String type, String flavor) {
    super(size, isSkinny, shots, type);
    this.flavor = flavor;
  }

  public String toString() {
    return super.toString() + " with " + flavor;
  }
}
