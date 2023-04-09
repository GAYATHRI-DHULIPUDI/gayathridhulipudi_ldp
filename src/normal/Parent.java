package normal;

public class Parent {
     int parentVariable=20;
    public void GetParentVariable(){
        System.out.println("Parent Variable"+parentVariable);
    }
}
class Child extends Parent{
    int a=parentVariable+20;
    public void get(){
        System.out.println(a);
    }
}
class Normal {
    public static void main(String[] args) {
        Child obj=new Child();
        Parent p=new Child();
        obj.get();
        obj.GetParentVariable();
    }
}
