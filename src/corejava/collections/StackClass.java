package corejava.collections;

import java.util.Iterator;
import java.util.Stack;

public class StackClass {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        s.add(1,1);
        Iterator itr=s.iterator();
//        while(itr.hasNext()){
//            System.out.println(itr.next());
//        }
        System.out.println(s.peek());
        System.out.println(s);
        System.out.println(s.search(20));//index starts with 1,2...
    }
}
