class Parent{
    public void show(){
        System.out.println("parent class is called");
    }
}
class Derived extends Parent{
    public void show(){
        System.out.println("child class is called");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        Parent dev=new Derived();
        dev.show();
    }
}
