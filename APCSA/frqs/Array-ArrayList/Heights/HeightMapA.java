public class HeightMap
{
  /** A two-dimensional array of height values, initialized in the constructor
    * Guaranteed not to be null
    */
  private double[][] heights;

  /** @param r a valid row index in heights
    * @param c a valid column index in heights
    * @return true if the height at row r, column c is not at the edge of the
    * two-dimensional array heights, and is greater in value than all 8 surrounding
    * values; false otherwise.
    */
  public boolean isPeak(int r, int c)
  {
    /* COMPLETE WORKING METHOD PROVIDED */
    /* DO NOT MODIFY THE IMPLEMENTATION OF THIS METHOD*/
    if(r == 0 || r == heights.length - 1
          || c == 0 || c == heights[0].length - 1)
    {
      return false;
    }

    double h = heights[r][c];

    return (heights[r][c - 1] < h && heights[r][c + 1] < h
            && heights[r - 1][c] < h && heights[r + 1][c] < h
            && heights[r - 1][c - 1] < h && heights[r - 1][c + 1] < h
            && heights[r + 1][c - 1] < h  && heights[r + 1][c + 1] < h);
  }

  /* Methods for subsequent parts of this question are not shown */

  /* CLASS MEMBERS FOR TESTING */
  /* DO NOT MODIFY ANY OF THE CONSTRUCTORS OR METHODS BELOW*/

  public HeightMap(double[][] h){
    heights = h;
  }

}
