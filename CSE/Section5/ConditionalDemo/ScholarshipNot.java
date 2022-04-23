/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section5.ConditionalDemo;

public class ScholarshipNot {

    public static void main(String args[]) {
        int numDaysAbsent = 2;
        int grade = 65;
        boolean madeHonorRoll = grade >= 88;
        if (!madeHonorRoll && numDaysAbsent < 3) {

            System.out.println("You qualify for free tutoring help.");
        } 

        }
    
}
