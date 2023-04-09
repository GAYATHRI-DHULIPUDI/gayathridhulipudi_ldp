package corejava;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) throws IOException {
      File f=new File("hello.txt");
//        f.createNewFile();
//        System.out.println(f);
//        FileWriter f=new FileWriter("hello.txt");
//        f.write("text  is written\n in the hello.txt file\n first file");
//        f.close();
        Scanner sc=new Scanner(f);
        while(sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }

    }
}
