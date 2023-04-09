package corejava.lambda;
//lambda expression expresses the functional interface. here we can implement method body without class
interface One{
    public int add(int x,int y);
}
interface Two{
    public void print(String s);
}

public class LambdaExample {
    public static void main(String[] args) {
        Two two=(String s)-> System.out.println(s);
        two.print("welcome!");
        One obj=(int a,int b)->{
            return a+b;
        };
        System.out.println(obj.add(2,5));
    }
}
