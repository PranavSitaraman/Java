package Section8.ArrayListsDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayIterator {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<String>();
        names.add("Tom");
        names.add("Mike");
        names.add("Matt");
        names.add("Nick");

        
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            System.out.println("Name is " + iterator.next());
        }
    }
}
