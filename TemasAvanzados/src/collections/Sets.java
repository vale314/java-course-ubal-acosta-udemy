package collections;

import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();

        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");

        // no permite e duplicados

        set.remove("B");

        for (String s : set) {
            System.out.println(s);
        }
    }
}
