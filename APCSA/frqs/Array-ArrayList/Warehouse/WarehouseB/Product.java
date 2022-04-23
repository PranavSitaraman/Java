public class Product
{

  private final String productCode;
  private int quantityInStock;

  /** @return the code of this product
   */
  public String getProductCode()
  {
    return productCode;
  }

  /** @return the current quantity in stock of this product. This should never be negative.
   */
  public int getQuant()
  {
    return quantityInStock;
  }

  /** Sets the current quantity in stock of this product to the parameter value
   */
  public void setQuant(int quantity)
  {
    quantityInStock = quantity;
  }


  /* CLASS MEMBERS FOR TESTING */
  /* DO NOT MODIFY ANY OF THE CONSTRUCTORS OR METHODS BELOW */
  public Product(String det)
  {
    productCode = det.split("/")[0];
    quantityInStock = Integer.parseInt(det.split("/")[1]);
  }

}
