import java.util.ArrayList;
public class OccupancyInfo
{
  private ArrayList<Room> rooms;
  // no two Room objects in rooms have the same room number

  /** Returns an ArrayList containing the number of every room which is not occupied
    * in the order in which these appear in the ArrayList rooms.
    */
  public ArrayList<Integer> availableRoomNumbers()
  {
    /* Implement your answer to part (b) here */
    ArrayList<Integer> free = new ArrayList<Integer>();
    for(Room r: rooms) {
      if(!r.isOccupied()) {
        free.add(r.getNumber());
    }
  }
return free;
}
  /* Methods for previous parts of this question are not shown */

  /* CLASS MEMBERS FOR TESTING */
  /* DO NOT MODIFY ANY OF THE CONSTRUCTORS OR METHODS BELOW*/

  public OccupancyInfo(ArrayList<Room> r)
  {  rooms = r;  }

  public ArrayList<Room> getRooms()
  {  return rooms;  }

}
