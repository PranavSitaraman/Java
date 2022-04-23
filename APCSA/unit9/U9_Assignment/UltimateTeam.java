package unit9.U9_Assignment;

import java.util.ArrayList;

public class UltimateTeam {

    private ArrayList<UltimatePlayer> players;
    private ArrayList<Coach> coaches;

    public UltimateTeam(ArrayList<UltimatePlayer> players, ArrayList<Coach> coaches) {
      this.players = players;
      this.coaches = coaches;
    }

    public String getCutters() {
        // Call helper method (see below)
        return getPlayersByPosition("cutter");
    }

    public String getHandlers() {
        // Call helper method (see below)
        return getPlayersByPosition("handler");
    }

    public String toString() {
        String s = "COACHES\n";
        for (Coach coach : this.coaches) {
            s += coach.toString() + "\n";
        }
        s += "\nPLAYERS\n";
        for (UltimatePlayer player : this.players) {
            s += player.toString() + "\n";
        }
        return s;
    }

    /* This helper method means that code does not need to be
     * duplicated for the getCutters and getHandlers method. It
     * iterates throught he player list and finds the position 
     * of each player. If that position is the same as s, it 
     * adds the players to the String.
     */
    private String getPlayersByPosition(String position) {
        String s = "";
        for (UltimatePlayer player : this.players) {
            if (position.equals(player.getPosition())) {
                s += player.toString() + "\n";
            }
        }
        return s;
    }
}
