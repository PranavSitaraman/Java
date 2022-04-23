/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section5.ConditionalDemo;

/**
 *
 * @author anshenoy
 */
public class TernaryOperator1 {

    public static void main(String args[]) {
        int numberOfGoals = 5;
        String s = (numberOfGoals == 1 ? "goal" : "goals");
        System.out.println("I scored " + numberOfGoals + " " + s);

    }
}
