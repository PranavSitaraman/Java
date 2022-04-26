package Section8.ArrayListsDemo;

import java.util.ArrayList;

public class ArrayListTraversal {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<String>();
        names.add("Tom");
        names.add("Mike");
        names.add("Matt");
        names.add("Nick");

        System.out.println("");
        for (String i : names) {
            System.out.println("Name is "+i);
        }

    }
}
