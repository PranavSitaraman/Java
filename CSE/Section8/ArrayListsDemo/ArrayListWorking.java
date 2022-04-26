/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section8.ArrayListsDemo;

import java.util.ArrayList;

public class ArrayListWorking {

    public static void main(String args[]) {
        ArrayList<String> names;
        names = new ArrayList();

        names.add("Jamie");
        names.add("Gustav");
        names.add("Alisa");
        names.add("Jose");
        names.add(2, "Prashant");

        String str = names.get(0);
        System.out.println(str);
        names.remove(0);
        System.out.println(names);
        names.remove(names.size() - 1);
        System.out.println(names);
        names.remove("Gustav");

        System.out.println(names);

    }

}
