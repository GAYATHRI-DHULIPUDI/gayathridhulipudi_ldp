package corejava;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {
    public static void main(String[] args) {
        Pattern pattern=Pattern.compile("abc");
        Matcher matcher= pattern.matcher("somethingabor");
        if(matcher.find()){
            System.out.println("match find");
        }
        else{
            System.out.println("match not found");
        }
       // System.out.println(Pattern.matches("[6789][0-9]{9}","6789056798"));
        //System.out.println(Pattern.matches("[^6789]","67896789"));
        //System.out.println(Pattern.matches("[0-9]{1,2}","6"));
       // System.out.println(Pattern.matches("\\d{3,5}","66856"));//any range between 3 to 5
        //System.out.println(Pattern.matches("\\w{1,5}","abA09"));//by default only one character
        //System.out.println(Pattern.matches("[^\\d]{3,5}","abc"));
    }
}
