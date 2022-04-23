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
public class ScholarshipAnd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numberDaysAbsent = 0;
        int grade = 70;

        if (grade >= 88 && numberDaysAbsent == 0) {

            System.out.println("You qualify for the scholarship.");

        } else {
            System.out.println("You do not qualify for the scholarship.");
        }
    }
}
