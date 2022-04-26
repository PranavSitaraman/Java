/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section8.ArrayListsDemo;

import java.util.*;

//import java.util.ListIterator;
/**
 *
 * @author anshenoy
 */
public class ListIteratorDemo {

    public static void main(String args[]) {

        ArrayList<String> names = new ArrayList<String>();
        names.add("Tom");
        names.add("Mike");
        names.add("Matt");
        names.add("Nick");

        ListIterator<String> litr = names.listIterator();
        System.out.println("Traversing list forwards: ");
        while (litr.hasNext()) {

            System.out.println("Name is " + litr.next());
        }

        System.out.println("Traversing list backwards: ");
        while (litr.hasPrevious()) {
            System.out.println("Name is " + litr.previous());

        }

    }

}
