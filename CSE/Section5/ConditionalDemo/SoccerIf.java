/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section5.ConditionalDemo;

public class SoccerIf {

    public static void main(String args[]) {
        int numberOfGoals = 5;
        String s;
        if (numberOfGoals == 1) {
            s = "goal";

        } 
        else {
            s="goals";
 
        }
        
        System.out.println("I scored " + numberOfGoals + " " + s);

    }
}
