/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section8.ArrayListsDemo;

import java.util.ArrayList;

public class AutoBoxing {

    public static void main(String args[]) {
        
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 1; i < 50; i += 2) {
            nums.add(i);
                       
        }
        
        for(Integer i:nums )
            
        {
            int nos=i;
            System.out.println(nos);

            
        }

    }

}
