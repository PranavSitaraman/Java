/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section8.ArrayListsDemo;

import java.util.ArrayList;

public class ScenarioArrayList {

    public static void main(String args[]) {
        ArrayList<String> names;
        names = new ArrayList();

        names.add("Jamie");
        names.add("Gustav");
        names.add("Alisa");
        names.add("Jose");
        

        for(String name: names)
        {
            System.out.println("name is :"+name);
            if(names.contains("Jose"))
            System.out.print(" Present");
            else
             System.out.print(" Not Present");
        }

        
    }
}
