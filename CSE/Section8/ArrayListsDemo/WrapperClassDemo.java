/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section8.ArrayListsDemo;

import java.util.ArrayList;

public class WrapperClassDemo {

    public static void main(String[] args) {

        // ArrayList<double> scores = new ArrayList<double>();
        ArrayList<Double> scores = new ArrayList<Double>();
        scores.add(66.5);
        scores.add(79.5);
        scores.add(95.3);
        double myGrade = scores.get(0);
        System.out.println(" My score is " + myGrade);

    }
}
