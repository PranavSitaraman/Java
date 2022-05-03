/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section8.ArrayListsEx;
import java.util.*;
public class ArrayListEx1
{
    public static void main(String[] args)
    {
        ArrayList<String> students = new ArrayList();
        students.add("Amy");
        students.add("Bob");
        students.add("Cindy");
        students.add("David");
        System.out.print("Elements in ArrayList:");
        for (String name : students) System.out.print(" " + name);
        System.out.println();
        System.out.println("The size of ArrayList is " + students.size());
        students.add(0, "Nick");
        students.add(1, "Mike");
        students.remove(3);
        System.out.print("Elements in ArrayList:");
        for (String name : students) System.out.print(" " + name);
        System.out.println();
        System.out.println("The size of ArrayList is " + students.size());
    }
}