package corejava.collections;

import java.util.*;

public class SetClass {
    public static void main(String[] args) {
        HashSet<Integer> hs=new HashSet<>();
        hs.add(10);
        hs.add(40);
        hs.add(10);
        hs.add(-1);
        hs.add(30);
        System.out.println("hashset "+ hs);
        LinkedHashSet<Integer> ls=new LinkedHashSet<>();
        ls.add(10);
        ls.add(40);
        ls.add(-1);
        ls.add(10);
        ls.add(30);
        System.out.println("linkedhashset "+ls);
        TreeSet<Integer> ts=new TreeSet<>(Collections.reverseOrder());
        ts.add(10);
        ts.add(40);
        ts.add(-1);
        ts.add(10);
        ts.add(30);
        System.out.println("treeset "+ts);

        System.out.println((TreeSet<Integer>)ts.descendingSet());
    }
}
