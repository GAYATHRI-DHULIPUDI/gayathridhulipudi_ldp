interface A{
    default void print(){
        System.out.println("A interface");
    }
}
interface AA{
    default void print(){
        System.out.println("AA interface");
    }
}
public class MultipleInheritance implements A,AA{


    @Override
    public void print() {
        AA.super.print();
    }

    public static void main(String[] args) {
        MultipleInheritance obj=new MultipleInheritance();
        obj.print();
    }
}
