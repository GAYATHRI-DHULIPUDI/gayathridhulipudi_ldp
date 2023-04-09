package corejava.collections;

import java.util.Comparator;
import java.util.PriorityQueue;
class CustomComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
       if(o1>o2)
           return 1;
       else if(o1<o2)
           return -1;
       else return 0;
    }
}

public class PriorityQueueClass {
    public static void main(String[] args) {
        PriorityQueue<Character> pq=new PriorityQueue<>();
        pq.add('C');
        pq.add('A');
        pq.add('0');
        pq.add('a');
        System.out.println(pq);
        PriorityQueue<Integer> p=new PriorityQueue<>();
        p.add(100);
        p.add(30);
        p.add(200);
        p.add(-1);
        p.offer(45);
        System.out.println(p.peek());//returns newly added element;
        System.out.println(p);
//        System.out.println(p.poll());//returns and removes top element

    }
}
