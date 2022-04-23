/* COMPLETE WORKING CLASS PROVIDED */
/* DO NOT MODIFY THE IMPLEMENTATION OF THIS CLASS*/

public class Room
{
  private int roomNumber;
  private boolean occupied;
  private String bookingName;


  /** Attempts to check a new guest into the room. If the room is not occupied (the
    * variable occupied is false), changes bookingName to name and sets
    * occupied to true.
    * Otherwise does not change the values of the member variables.
    * @param name the name of the guest checking in as a String
    * @return true if the check-in was successful and bookingName was changed
    *         false otherwise
    */
  public boolean checkInNewGuest(String name)
  {
    if(occupied) return false;
    bookingName = name;
    occupied = true;
    return true;
  }


  /** @return the room number
    */
  public int getNumber()
  {  return roomNumber;  }

  /** @return true if the room is occupied; false otherwise.
    */
  public boolean isOccupied()
  {  return occupied;  }

  public Room (int rn, boolean o, String bn){
    roomNumber = rn;
    occupied = o;
    bookingName = bn;
  }

  public String toString(){
    return roomNumber+"; "+occupied+"; "+bookingName;
  }

}
