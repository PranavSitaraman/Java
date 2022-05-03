/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section8.ArrayListsEx;
import java.util.*;
public class ArrayListEx2
{
    public static void main(String args[])
    {
        ArrayList<Integer> numbers = new ArrayList();
        for (int i = 0; i < 10; i++) numbers.add(i);
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) System.out.print(iterator.next() + " ");
        System.out.println();
        for (int i = 0; i < numbers.size(); i++) if (numbers.get(i) % 2 == 0) numbers.remove(i);
        iterator = numbers.iterator();
        while (iterator.hasNext()) System.out.print(iterator.next() + " ");
        System.out.println();
    }
}