package assignments.assignment1;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class PrintFiles{
    void printPathOfFiles(String directory,String Search){
        Pattern pattern=Pattern.compile(Search,Pattern.CASE_INSENSITIVE);
        File file=new File(directory);
        File listFiles[]=file.listFiles();
        for(File files:listFiles){
            String a=files.getName();
            if(a.substring(a.length()-3).equals("txt")){
                Matcher matcher=pattern.matcher(a);
                if(matcher.find()){
                    System.out.println("File : "+files.getAbsolutePath());
                }
            }
            else{
                printPathOfFiles(files.getAbsolutePath(),Search);
            }
        }
    }
}

public class Assignment1 {
    public static void main(String[] args) {
        PrintFiles obj=new PrintFiles();
        obj.printPathOfFiles("C:/Users/Siva Kumar/Desktop/Test","File1");
    }
}
