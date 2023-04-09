package corejava.collections;
import java.util.*;

public class ListClass {
    public static void main(String[] args) {
        ArrayList<Integer> l=new ArrayList<>();
        l.add(10);
        l.add(20);
        l.addAll(1,new ArrayList<>(Arrays.asList(10,20,30,40)));
        System.out.println(l);
        l.set(1,60);
        l.remove(3);
        Collections.sort(l);
//        for(int i:l){
//            System.out.println(i);
//        }
//        Iterator it=l.iterator();
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }
        System.out.println(l.subList(1,5));
    }
}
