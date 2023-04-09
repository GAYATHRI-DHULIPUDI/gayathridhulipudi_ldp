package assignments.assignment8;

import java.util.Scanner;

class FirstException extends RuntimeException{

}
class SecondException extends NullPointerException{

}
class ThirdException extends RuntimeException{

}
public class Assignment8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String inputString=sc.nextLine().toLowerCase();
        try{
            if(inputString.contains("first")){
                throw new FirstException();
            }
            if(inputString.contains("second")){
                throw new SecondException();
            }
            if(inputString.contains("third")){
                throw new ThirdException();
            }
        }
        catch (Exception e){
            System.out.println(e.getClass().getSimpleName());
        }
        finally{
            System.out.println("Finally block");
        }
    }
}
