public class Warehouse
{
  private Product[][] stock;


  /** Attempts to swap the Product at the location frRow, frCol in stock with
   *  the Product at location toRow, toCol. This only happens if the
   *  quantity in stock of the Product at  toRow, toCol before the method is called
   *  is 0.
   *  @param frRow a valid row index for  stock
   *  @param frCol a valid column index for  stock
   *  @param toRow a valid row index for  stock
   *  @param toCol a valid column index for  stock
   *  @return true if the swap is completed; false otherwise.
   */
  public boolean reposition(int frRow, int frCol, int toRow, int toCol)
  {
    /* Implement your answer to part (b) here */
    if(stock[toRow][toCol].getQuant() > 0) return false;
    
    Product placeholder = stock[toRow][toCol];
    stock[toRow][toCol] = stock[frRow][frCol];
    stock[frRow][frCol] = placeholder;
    
    return true;
  }


  /* Methods for previous parts of this question are not shown */

  /* CLASS MEMBERS FOR TESTING */
  /* DO NOT MODIFY ANY OF THE CONSTRUCTORS OR METHODS BELOW */

  public Product[][] getStock()
  {  return stock;  }

  public Warehouse(Product[][] s)
  {  stock = s;  }

}
