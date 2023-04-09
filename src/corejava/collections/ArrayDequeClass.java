package corejava.collections;

import java.util.ArrayDeque;

public class ArrayDequeClass {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad=new ArrayDeque<>();
        ad.add(20);
        ad.add(10);
        ad.add(-1);
        ad.add(100);
        System.out.println(ad);
        System.out.println(ad.removeFirst());
        System.out.println(ad);
        ad.addFirst(1);
        System.out.println(ad);
    }
}
