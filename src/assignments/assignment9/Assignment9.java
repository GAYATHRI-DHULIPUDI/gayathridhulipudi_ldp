package assignments.assignment9;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Assignment9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String inputString=sc.nextLine();
        Pattern pattern=Pattern.compile("^[A-Z].*\\.$");
        Matcher matcher= pattern.matcher(inputString);
        if(matcher.find()){
            System.out.println("success");
        }
        else{
            System.out.println("you stupid");
        }
    }
}
