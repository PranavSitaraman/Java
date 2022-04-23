import java.util.ArrayList;

public class HeightMap
{
  /** A two-dimensional array of height values, initialized in the constructor (not shown)
    * Guaranteed not to be null
    */
  private double[][] heights;

  /** @return an ArrayList of String objects which give information on each peak in
    * the two-dimensional array heights.
    * Each string is in the format "Peak at (r, c): Height h", where r and c
    * are the row and column index, and h is the height of the peak.
    */
  public ArrayList<String> peakInfo()
  {
    /* Implement your answer to part (b) here */
    ArrayList<String> peakList = new ArrayList<String>();
    for(int row = 0; row < heights.length; row++) {
      for(int col = 0; col < heights[0].length; col++) {
        if(isPeak(row, col)) 
        peakList.add("Peak at (" + row + ", " + col + "): Height " + heights[row][col]);
      }
    }
  return peakList;
  }

  /** @param r a valid row index in heights
    * @param c a valid column index in heights
    * @return true if the height at row r, column c is not at the edge of the
    * two-dimensional array heights, and is greater in value than all 8 surrounding
    * values; false otherwise.
    */


  /* CLASS MEMBERS FOR TESTING */
  /* DO NOT MODIFY ANY OF THE CONSTRUCTORS OR METHODS BELOW*/

  public HeightMap(double[][] h){
    heights = h;
  }

}
