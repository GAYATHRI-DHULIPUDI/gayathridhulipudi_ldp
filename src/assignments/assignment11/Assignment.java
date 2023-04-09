package assignments.assignment11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
class CountLeters{
    public void countLetters(File f) throws IOException {
        LinkedHashMap<Character,Integer> map=new LinkedHashMap<>();
        Scanner s=new Scanner(f);
        while(s.hasNextLine()){
            String line=s.nextLine();
            for(int i=0;i<line.length();i++){
                if(map.containsKey(line.charAt(i))){
                    map.put(line.charAt(i),map.get(line.charAt(i))+1);
                }
                else{
                    map.put(line.charAt(i),1);
                }
            }
        }
        System.out.println(map);
        FileWriter f2=new FileWriter("C:/Users/Siva Kumar/IdeaProjects/OOPS/src/assignments/assignment11/out.txt",true);
        for(Map.Entry<Character,Integer> e:map.entrySet()){
            String newLine=e.getKey()+" : "+e.getValue()+"\n";
            f2.write(newLine);
        }
        f2.close();
    }
}

public class Assignment {
    public static void main(String[] args) throws IOException {
        File f=new File("C:/Users/Siva Kumar/IdeaProjects/OOPS/src/assignments/assignment11/in.txt");
        CountLeters obj=new CountLeters();
        obj.countLetters(f);
    }
}
