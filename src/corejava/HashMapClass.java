package corejava;
import java.util.*;

public class HashMapClass {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("gayathri",32);
        map.put("siva",23);
        map.put("sita",65);
//        System.out.println(map);
        LinkedHashMap<String,Integer> linkedMap=new LinkedHashMap<>();
        linkedMap.put("gayathri",32);
        linkedMap.put("siva",23);
        linkedMap.put("sita",65);
        linkedMap.put("ram",55);
        linkedMap.put("lakshman",66);
        System.out.println(linkedMap);
//        for(Map.Entry<String,Integer> e:linkedMap.entrySet()){
//            System.out.println(e.getKey()+" "+e.getValue());
//        }
        System.out.println(linkedMap.keySet());
        System.out.println(linkedMap.values());
    }
}
