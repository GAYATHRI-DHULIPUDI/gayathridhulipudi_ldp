package assignments.assignment2;

import java.util.*;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String s=sc.nextLine();
        s=s.toLowerCase();
        HashSet<Character> hs=new HashSet<>();
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)>=65 && s.charAt(i)<=90)||(s.charAt(i)>=97 && s.charAt(i)<=122)){
                hs.add(s.charAt(i));
            }
        }
        if(hs.size()==26){
            System.out.println("valid");

        }
        else{
            System.out.println("invalid");
        }
    }
}
//Time complexity:O(len(inputString))
//space complexity:<=O(len(inputString))