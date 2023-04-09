package assignments.assignment7.four;

import java.util.Scanner;

interface Cycle{
    public void show();
}
class BiCycle implements Cycle{

    @Override
    public void show() {
        System.out.println("Riding BiCycle");
    }
}
class UniCycle implements Cycle{

    @Override
    public void show() {
        System.out.println(" Riding UniCycle");
    }
}
class TriCycle implements Cycle{

    @Override
    public void show() {
        System.out.println("Riding TriCycle");
    }
}
class BiCycleFactory{
    public BiCycle returns(){
        return new BiCycle();
    }
}
class UniCycleFactory{
    public UniCycle returns(){
        return new UniCycle();
    }
}
class TriCycleFactory{
    public TriCycle returns(){
        return new TriCycle();
    }
}
public class FactoryDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter cycle name  that you want to ride");
        String inputString=sc.nextLine().toLowerCase();
        if(inputString.contains("bi")){
            BiCycleFactory bicycle=new BiCycleFactory();
            Cycle c=bicycle.returns();
            c.show();
        }
        if(inputString.contains("uni")){
            UniCycleFactory unicycle=new UniCycleFactory();
            Cycle c=unicycle.returns();
            c.show();
        }
        if(inputString.contains("tri")){
            TriCycleFactory tricycle=new TriCycleFactory();
            Cycle c=tricycle.returns();
            c.show();
        }
    }
}
