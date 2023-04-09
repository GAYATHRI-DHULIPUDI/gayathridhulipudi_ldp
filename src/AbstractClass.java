public abstract class AbstractClass {
    abstract public void printDetails();
    public void Print(){
        System.out.println("concrete method in abstract class");
    }
}
class Child extends AbstractClass{

    @Override
    public void printDetails() {
        System.out.println("implementing abstract class");
    }

    public static void main(String[] args) {
        Child obj=new Child();
        obj.Print();
        obj.printDetails();
    }
}
