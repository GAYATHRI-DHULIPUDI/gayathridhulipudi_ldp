package assignments.assignment7.third;
interface One{
    public void methodOne();
    public void methodTwo();
}
interface Two{
    public void methodThree();
    public void methodFour();
}
interface Three{
    public void methodFive();
    public void methodSix();
}
interface Four extends One,Two,Three{
    public void methodSeven();
}
class ConcreteClass {
    public void Show(){
        System.out.println("concrete class");
    }
}
class ImplementInterfaces extends ConcreteClass implements Four {

    @Override
    public void methodOne() {
        System.out.println("method one");
    }

    @Override
    public void methodTwo() {
        System.out.println("method two");
    }

    @Override
    public void methodThree() {
        System.out.println("method three");
    }

    @Override
    public void methodFour() {
        System.out.println("method four");
    }

    @Override
    public void methodFive() {
        System.out.println("method five");
    }

    @Override
    public void methodSix() {
        System.out.println("method six");
    }

    @Override
    public void methodSeven() {
        System.out.println("method seven");
    }
}

public class MainClass {
    public void interfaceOne(One one){
        one.methodOne();
        one.methodTwo();
    }
    public void interfaceTwo(Two two){
        two.methodThree();
        two.methodFour();
    }
    public void interfaceThree(Three three){
        three.methodFive();
        three.methodSix();
    }
    public void interfaceFour(Four four){
       four.methodOne();
       four.methodTwo();
       four.methodThree();
       four.methodFour();
       four.methodFive();
       four.methodSix();
       four.methodSeven();
    }

    public static void main(String[] args) {
        MainClass mc=new MainClass();
        ImplementInterfaces obj=new ImplementInterfaces();
        mc.interfaceOne(obj);
        mc.interfaceTwo(obj);
        mc.interfaceThree(obj);
        mc.interfaceFour(obj);
    }
}
