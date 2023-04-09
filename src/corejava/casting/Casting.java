package corejava.casting;
class A{
    public void show1(){
        System.out.println("in A show");
    }
}
class B extends A{
    public void show2(){
        System.out.println("in B show");
    }
}

public class Casting {
    public static void main(String[] args) {
        A a=new B();//in upcasting we can call methods of parent only eg:double to int(implicit)
       // a.show2(); error
        B obj=(B)a;// downcasting
        obj.show1();
    }
}
