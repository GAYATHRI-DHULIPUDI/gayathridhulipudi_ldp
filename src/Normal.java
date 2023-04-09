import java.util.*;
public class Normal {
    public static void main(String[] args) {
        double a;
        double b;
        Scanner sc=new Scanner(System.in);
        a=sc.nextDouble();
        b=sc.nextDouble();
        char c;
        c=sc.next().charAt(0);
        switch(c){
            case '+':
                System.out.println(a+b);break;
            case '-':
                System.out.println(a-b);break;
            default:
                System.out.println("error");

        }
    }
}
