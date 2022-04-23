public class Warehouse
{
  private Product[][] stock;


  /** Attempts to fulfill an order by decreasing the quantity in stock of a product with the
   *  specified productCode by the quantity requested. This is only completed if a
   *  Product with the code desired is found with  quantity in stock greater than or equal
   *  to the quantity requested.
   *  @param code the product code to search for in stock
   *  @param orderQuant the quantity requested of this product
   *  @return true if the order is completed; false otherwise.
   */
  public boolean fulfillOrder(String code, int orderQuant)
  {
    /* Implement your answer to part (a) here */
    for(int row = 0; row < stock.length; row++) {
      for(int col = 0; col < stock[0].length; col++) {
        if(stock[row][col].getProductCode().equals(code)) {
          if(stock[row][col].getQuant() - orderQuant < 0) return false;
          else {
          stock[row][col].setQuant(stock[row][col].getQuant() - orderQuant);
          return true;
          }
        }
      }
    }
    return false;
  }


  /* Methods for subsequent parts of this question are not shown */

  /* CLASS MEMBERS FOR TESTING */
  /* DO NOT MODIFY ANY OF THE CONSTRUCTORS OR METHODS BELOW */

  public Product[][] getStock()
  {  return stock;  }

  public Warehouse(Product[][] s)
  {  stock = s;  }

}
