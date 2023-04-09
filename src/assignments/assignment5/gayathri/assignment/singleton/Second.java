package assignments.assignment5.gayathri.assignment.singleton;

public class Second {
   String s;
    public static Second initalize(String s){
//        this.s=s;
        return new Second();
    }
    public void printString(){
        System.out.println(this.s);
    }
}
