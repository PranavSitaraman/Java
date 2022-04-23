import java.util.ArrayList;
public class OccupancyInfo
{
  private ArrayList<Room> rooms;
  // no two Room objects in rooms have the same room number


  /** Attempts to check-in a new guest into a given room number. If a room exists in
    * the database with the room number requested, and the room is unoccupied, a guest
    * with the name given is checked-in to that room: the room is marked as occupied,
    * and the guestName variable in the Room object is set to the name given.
    * @param name the name of the guest attempting to check-in
    * @param number the room number into which the guest is to be checked-in
    * @return -1 if no room with the requested number exists;
    *         0 if the room requested is occupied;
    *         1 if the check-in is successful
    */
  public int checkIn(String name, int number)
  {
    /* Implement your answer to part (a) here */
    for(Room r: rooms) {
      if(r.getNumber() == number) {
        if(!r.checkInNewGuest(name)) 
          return 0;
       return 1;
      }
    }
    return -1; 
  }


  /* Methods for subsequent parts of this question are not shown */

  /* CLASS MEMBERS FOR TESTING */
  /* DO NOT MODIFY ANY OF THE CONSTRUCTORS OR METHODS BELOW*/

  public OccupancyInfo(ArrayList<Room> r)
  {  rooms = r;  }

  public ArrayList<Room> getRooms()
  {  return rooms;  }

}
