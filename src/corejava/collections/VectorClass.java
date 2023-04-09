package corejava.collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;

public class VectorClass {
    public static void main(String[] args) {
        Vector<String> v=new Vector<>();
        v.add("hii");
        v.addAll(new Vector<>(Arrays.asList("abc","def")));
        //System.out.println(v);
        //System.out.println(v.elementAt(2));
        v.insertElementAt("hello",1);
        //System.out.println(v);
        v.add(3,"world");
        System.out.println(v);
        Iterator itr=v.iterator();
//        while(itr.hasNext()){
//            System.out.println(itr.next());
//        }
        v.removeAll(new Vector<>(Arrays.asList("abc","def")));
        System.out.println(v);
        System.out.println(v.toString());
        System.out.println(v.size());
    }
}
